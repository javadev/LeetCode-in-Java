package g0901_1000.s0975_odd_even_jump;

// #Hard #Array #Dynamic_Programming #Stack #Ordered_Set #Monotonic_Stack
// #2022_03_31_Time_49_ms_(98.38%)_Space_69.1_MB_(5.18%)

import java.util.Arrays;

public class Solution {
    private int[] valToPos;

    public int oddEvenJumps(int[] arr) {
        int size = arr.length;
        boolean[] odd = new boolean[size];
        boolean[] even = new boolean[size];
        valToPos = new int[100001];
        Arrays.fill(valToPos, -1);
        valToPos[arr[size - 1]] = size - 1;
        odd[size - 1] = even[size - 1] = true;
        int count = 1;
        for (int i = size - 2; i >= 0; i--) {
            int curVal = arr[i];
            int maxS = findMaxS(curVal);
            int minL = findMinL(curVal);
            if (minL != -1 && even[minL]) {
                // System.out.println("find minL is true at: "+minL+" start from "+i);
                odd[i] = even[minL];
                count++;
            }
            if (maxS != -1) {
                even[i] = odd[maxS];
            }
            valToPos[arr[i]] = i;
        }
        return count;
    }

    private int findMaxS(int val) {
        for (int i = val; i >= 0; i--) {
            if (valToPos[i] != -1) {
                return valToPos[i];
            }
        }
        return -1;
    }

    private int findMinL(int val) {
        for (int i = val; i < 100001; i++) {
            if (valToPos[i] != -1) {
                return valToPos[i];
            }
        }
        return -1;
    }
}
