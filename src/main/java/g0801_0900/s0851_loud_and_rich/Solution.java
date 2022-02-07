package g0801_0900.s0851_loud_and_rich;

// #Medium #Array #Depth_First_Search #Graph #Topological_Sort

public class Solution {
    public int[] loudAndRich(int[][] richer, int[] quiet) {
        int[] result = new int[quiet.length];
        for (int i = 0; i < quiet.length; i++) {
            result[i] = i;
        }
        for (int k = 0; k < quiet.length; k++) {
            boolean changed = false;
            for (int[] r : richer) {
                if (quiet[result[r[0]]] < quiet[result[r[1]]]) {
                    result[r[1]] = result[r[0]];
                    changed = true;
                }
            }
            if (!changed) {
                break;
            }
        }
        return result;
    }
}
