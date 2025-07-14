package g3601_3700.s3613_minimize_maximum_component_cost;

// #Medium #Binary_Search #Graph #Union_Find #Sort
// #2025_07_14_Time_37_ms_(100.00%)_Space_88.50_MB_(98.52%)

public class Solution {
    public int minCost(int ui, int[][] pl, int zx) {
        int rt = 0;
        int gh = 0;
        int i = 0;
        while (i < pl.length) {
            gh = Math.max(gh, pl[i][2]);
            i++;
        }
        while (rt < gh) {
            int ty = rt + (gh - rt) / 2;
            if (dfgh(ui, pl, ty, zx)) {
                gh = ty;
            } else {
                rt = ty + 1;
            }
        }
        return rt;
    }

    private boolean dfgh(int ui, int[][] pl, int jk, int zx) {
        int[] wt = new int[ui];
        int i = 0;
        while (i < ui) {
            wt[i] = i;
            i++;
        }
        int er = ui;
        i = 0;
        while (i < pl.length) {
            int[] df = pl[i];
            if (df[2] > jk) {
                i++;
                continue;
            }
            int u = cvb(wt, df[0]);
            int v = cvb(wt, df[1]);
            if (u != v) {
                wt[u] = v;
                er--;
            }
            i++;
        }
        return er <= zx;
    }

    private int cvb(int[] wt, int i) {
        for (; wt[i] != i; i = wt[i]) {
            wt[i] = wt[wt[i]];
        }
        return i;
    }
}
