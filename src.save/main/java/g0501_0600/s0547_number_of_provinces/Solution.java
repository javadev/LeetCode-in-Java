package g0501_0600.s0547_number_of_provinces;

// #Medium #Depth_First_Search #Breadth_First_Search #Graph #Union_Find
// #Algorithm_II_Day_6_Breadth_First_Search_Depth_First_Search
// #Graph_Theory_I_Day_8_Standard_Traversal #Level_2_Day_19_Union_Find
// #2022_08_02_Time_2_ms_(69.51%)_Space_54.2_MB_(42.16%)

import java.util.Arrays;

public class Solution {
    public int findCircleNum(int[][] arr) {
        int[] parent = new int[arr.length];
        Arrays.fill(parent, -1);
        int ans = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    ans += union(i, j, parent);
                }
            }
        }
        return arr.length - ans;
    }

    private int union(int a, int b, int[] arr) {
        int ga = find(a, arr);
        int gb = find(b, arr);
        if (ga != gb) {
            arr[gb] = ga;
            return 1;
        }
        return 0;
    }

    private int find(int a, int[] arr) {
        if (arr[a] == -1) {
            return a;
        }
        arr[a] = find(arr[a], arr);
        return arr[a];
    }
}
