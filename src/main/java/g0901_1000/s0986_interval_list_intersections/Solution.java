package g0901_1000.s0986_interval_list_intersections;

// #Medium #Array #Two_Pointers

import java.util.ArrayList;

public class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        ArrayList<int[]> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < firstList.length && j < secondList.length) {
            int start = Math.max(firstList[i][0], secondList[j][0]);
            int end = Math.min(firstList[i][1], secondList[j][1]);
            if (start <= end) {
                list.add(new int[] {start, end});
            }
            if (firstList[i][1] > end) {
                j++;
            } else {
                i++;
            }
        }
        return list.toArray(new int[0][]);
    }
}
