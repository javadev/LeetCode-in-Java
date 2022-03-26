package g0701_0800.s0765_couples_holding_hands;

// #Hard #Depth_First_Search #Greedy #Breadth_First_Search #Graph #Union_Find
// #2022_03_26_Time_0_ms_(100.00%)_Space_41.6_MB_(54.28%)

public class Solution {
    public int minSwapsCouples(int[] row) {
        int swaps = 0;
        for (int i = 0; i < row.length - 1; i += 2) {
            int coupleValue = row[i] % 2 == 0 ? row[i] + 1 : row[i] - 1;
            if (row[i + 1] != coupleValue) {
                swaps++;
                int coupleIndex = findIndex(row, coupleValue);
                swap(row, coupleIndex, i + 1);
            }
        }
        return swaps;
    }

    private void swap(int[] row, int i, int j) {
        int tmp = row[i];
        row[i] = row[j];
        row[j] = tmp;
    }

    private int findIndex(int[] row, int value) {
        for (int i = 0; i < row.length; i++) {
            if (row[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
