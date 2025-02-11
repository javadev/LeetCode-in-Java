package g3401_3500.s3447_assign_elements_to_groups_with_constraints;

// #Medium #Array #Hash_Table #2025_02_11_Time_7_ms_(99.06%)_Space_64.05_MB_(91.85%)

import java.util.Arrays;

public class Solution {
    public int[] assignElements(int[] groups, int[] elements) {
        int i;
        int j;
        int n = (int) (1e5 + 1);
        int maxi = 0;
        for (i = 0; i < groups.length; i++) {
            maxi = Math.max(maxi, groups[i]);
        }
        n = maxi + 1;
        int[] arr = new int[n];
        int[] ans = new int[groups.length];
        Arrays.fill(arr, -1);
        for (i = 0; i < elements.length; i++) {
            if (elements[i] < n && arr[elements[i]] == -1) {
                for (j = elements[i]; j < n; j += elements[i]) {
                    if (arr[j] == -1) {
                        arr[j] = i;
                    }
                }
            }
        }
        for (i = 0; i < groups.length; i++) {
            ans[i] = arr[groups[i]];
        }
        return ans;
    }
}
