package g2201_2300.s2201_count_artifacts_that_can_be_extracted;

// #Medium #Array #Hash_Table #Simulation #2022_06_11_Time_7_ms_(82.97%)_Space_91.5_MB_(99.45%)

public class Solution {
    public int digArtifacts(int n, int[][] artifacts, int[][] dig) {
        int[][] ar = new int[n][n];
        for (int[] ints : dig) {
            ar[ints[0]][ints[1]] = 1;
        }
        int ans = 0;
        for (int[] artifact : artifacts) {
            int x1 = artifact[0];
            int y1 = artifact[1];
            int x2 = artifact[2];
            int y2 = artifact[3];
            int flag = 0;
            int a = x1;
            int b = y1;
            while (a <= x2) {
                b = y1;
                while (b <= y2) {
                    if (ar[a][b] != 1) {
                        flag = 1;
                        break;
                    }
                    b++;
                }
                if (flag == 1) {
                    break;
                }
                a++;
            }
            if (a == x2 + 1 && b == y2 + 1) {
                ans++;
            }
        }
        return ans;
    }
}
