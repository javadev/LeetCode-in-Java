package g3501_3600.s3508_implement_router;

// #Medium #2025_04_06_Time_145_ms_(100.00%)_Space_115.44_MB_(94.12%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Router {
    private final int size;
    private int cur;
    private final Queue<int[]> q;
    private final HashMap<Integer, ArrayList<int[]>> map;

    public Router(int memoryLimit) {
        q = new LinkedList<>();
        map = new HashMap<>();
        size = memoryLimit;
        cur = 0;
    }

    public boolean addPacket(int source, int destination, int timestamp) {
        if (map.containsKey(destination)) {
            boolean found = false;
            ArrayList<int[]> list = map.get(destination);
            for (int i = list.size() - 1; i >= 0; i--) {
                if (list.get(i)[1] < timestamp) {
                    break;
                } else if (list.get(i)[0] == source) {
                    found = true;
                    break;
                }
            }
            if (found) {
                return false;
            }
        }
        if (map.containsKey(destination)) {
            ArrayList<int[]> list = map.get(destination);
            list.add(new int[] {source, timestamp});
            cur++;
            q.offer(new int[] {source, destination, timestamp});
        } else {
            ArrayList<int[]> temp = new ArrayList<>();
            temp.add(new int[] {source, timestamp});
            cur++;
            map.put(destination, temp);
            q.offer(new int[] {source, destination, timestamp});
        }
        if (cur > size) {
            forwardPacket();
        }
        return true;
    }

    public int[] forwardPacket() {
        if (q.isEmpty()) {
            return new int[] {};
        }
        int[] temp = q.poll();
        ArrayList<int[]> list = map.get(temp[1]);
        list.remove(0);
        if (list.isEmpty()) {
            map.remove(temp[1]);
        }
        cur--;
        return temp;
    }

    public int getCount(int destination, int startTime, int endTime) {
        if (map.containsKey(destination)) {
            ArrayList<int[]> list = map.get(destination);
            int lower = -1;
            int higher = -1;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i)[1] >= startTime) {
                    lower = i;
                    break;
                }
            }
            for (int i = list.size() - 1; i >= 0; i--) {
                if (list.get(i)[1] <= endTime) {
                    higher = i;
                    break;
                }
            }
            if (lower == -1 || higher == -1) {
                return 0;
            } else {
                return Math.max(0, higher - lower + 1);
            }
        } else {
            return 0;
        }
    }
}

/*
 * Your Router object will be instantiated and called as such:
 * Router obj = new Router(memoryLimit);
 * boolean param_1 = obj.addPacket(source,destination,timestamp);
 * int[] param_2 = obj.forwardPacket();
 * int param_3 = obj.getCount(destination,startTime,endTime);
 */
