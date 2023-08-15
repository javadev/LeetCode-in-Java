package g1301_1400.s1345_jump_game_iv;

// #Hard #Array #Hash_Table #Breadth_First_Search
// #2022_03_21_Time_65_ms_(89.91%)_Space_92.2_MB_(78.79%)

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public int minJumps(int[] arr) {
        if (arr.length == 1) {
            return 0;
        }

        int len = arr.length;
        HashMap<Integer, List<Integer>> myHash = new HashMap<>();

        int i = 0;
        while (i < arr.length) {
            List<Integer> curList = myHash.getOrDefault(arr[i], new ArrayList<>());
            curList.add(i);
            int tempNum = arr[i];
            int tempIndex = i;
            while (i < arr.length && arr[i] == tempNum) {
                i++;
            }
            if (i != tempIndex + 1) {
                curList.add(i - 1);
            }
            myHash.put(tempNum, curList);
        }

        Deque<Integer> myQueue = new LinkedList<>();
        int step = 0;
        myQueue.offerLast(0);

        boolean[] visited = new boolean[arr.length];
        visited[0] = true;

        while (!myQueue.isEmpty()) {
            int curCount = myQueue.size();
            int j = 0;
            while (j < curCount) {
                int curIndex = myQueue.pollFirst();
                if (curIndex == len - 1) {
                    return step;
                }
                if (curIndex + 1 < len && !visited[curIndex + 1]) {
                    myQueue.offerLast(curIndex + 1);
                    visited[curIndex + 1] = true;
                }
                if (curIndex - 1 >= 0 && !visited[curIndex - 1]) {
                    myQueue.offerLast(curIndex - 1);
                    visited[curIndex - 1] = true;
                }
                List<Integer> tempList = myHash.getOrDefault(arr[curIndex], new ArrayList<>());
                for (Integer integer : tempList) {
                    if (!visited[integer]) {
                        myQueue.offerLast(integer);
                        visited[integer] = true;
                    }
                }
                myHash.remove(arr[curIndex]);
                j++;
            }
            step++;
        }

        return step;
    }
}
