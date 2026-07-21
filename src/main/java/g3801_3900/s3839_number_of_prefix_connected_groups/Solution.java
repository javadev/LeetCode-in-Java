package g3801_3900.s3839_number_of_prefix_connected_groups;

// #Medium #Array #String #Hash_Table #Counting #Senior #Biweekly_Contest_176
// #2026_07_21_Time_20_ms_(89.73%)_Space_48.85_MB_(67.30%)

public class Solution {
    public int prefixConnected(String[] words, int k) {
        java.util.HashMap<String, Integer> mpp = new java.util.HashMap<>();
        for (String word : words) {
            if (word.length() >= k) {
                String pref = word.substring(0, k);
                mpp.put(pref, mpp.getOrDefault(pref, 0) + 1);
            }
        }
        int cnt = 0;
        for (int y : mpp.values()) {
            if (y >= 2) {
                cnt++;
            }
        }
        return cnt;
    }
}
