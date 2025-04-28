package g3501_3600.s3527_find_the_most_common_response;

// #Medium #Array #String #Hash_Table #Counting
// #2025_04_28_Time_94_ms_(100.00%)_Space_211.70_MB_(22.07%)

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    private boolean compareStrings(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (str1.charAt(i) < str2.charAt(j)) {
                return true;
            } else if (str1.charAt(i) > str2.charAt(j)) {
                return false;
            }
            i++;
            j++;
        }
        return n < m;
    }

    public String findCommonResponse(List<List<String>> responses) {
        int n = responses.size();
        Map<String, int[]> mp = new HashMap<>();
        String ans = responses.get(0).get(0);
        int maxFreq = 0;
        for (int row = 0; row < n; row++) {
            int m = responses.get(row).size();
            for (int col = 0; col < m; col++) {
                String resp = responses.get(row).get(col);
                int[] arr = mp.getOrDefault(resp, new int[] {0, -1});
                if (arr[1] != row) {
                    arr[0]++;
                    arr[1] = row;
                    mp.put(resp, arr);
                }
                if (arr[0] > maxFreq
                        || !ans.equals(resp) && arr[0] == maxFreq && compareStrings(resp, ans)) {
                    ans = resp;
                    maxFreq = arr[0];
                }
            }
        }
        return ans;
    }
}
