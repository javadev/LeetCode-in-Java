package g1901_2000.s1993_operations_on_tree;

// #Medium #Hash_Table #Depth_First_Search #Breadth_First_Search #Tree #Design
// #2022_05_19_Time_394_ms_(23.03%)_Space_167.4_MB_(5.26%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class LockingTree {
    private int[][] a;
    private HashMap<Integer, List<Integer>> map = new HashMap<>();

    public LockingTree(int[] parent) {
        int l = parent.length;
        a = new int[l][2];
        for (int i = 0; i < l; i++) {
            a[i][0] = parent[i];
            a[i][1] = -1;
            map.putIfAbsent(parent[i], new ArrayList<>());
            List<Integer> p = map.get(parent[i]);
            p.add(i);
            map.put(parent[i], p);
        }
    }

    public boolean lock(int num, int user) {
        int userId = a[num][1];
        if (userId == -1) {
            a[num][1] = user;
            return true;
        }
        return false;
    }

    public boolean unlock(int num, int user) {
        int y = a[num][1];
        if (y == user) {
            a[num][1] = -1;
            return true;
        }
        return false;
    }

    public boolean upgrade(int num, int user) {
        int par = num;
        while (par >= 0) {
            int lop = a[par][1];
            if (lop != -1) {
                return false;
            }
            par = a[par][0];
        }
        int f = 0;
        LinkedList<Integer> que = new LinkedList<>();
        int[] v = new int[a.length];
        que.add(num);
        v[num] = 1;
        while (!que.isEmpty()) {
            int t = que.get(0);
            que.remove(0);
            List<Integer> p = map.getOrDefault(t, new ArrayList<>());
            for (int e : p) {
                if (a[e][1] != -1) {
                    f = 1;
                    a[e][1] = -1;
                }
                if (v[e] == 0) {
                    que.add(e);
                    v[e] = 1;
                }
            }
        }
        if (f == 1) {
            a[num][1] = user;
            return true;
        }
        return false;
    }
}

/*
 * Your LockingTree object will be instantiated and called as such:
 * LockingTree obj = new LockingTree(parent);
 * boolean param_1 = obj.lock(num,user);
 * boolean param_2 = obj.unlock(num,user);
 * boolean param_3 = obj.upgrade(num,user);
 */
