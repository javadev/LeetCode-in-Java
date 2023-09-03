package g1901_2000.s1987_number_of_unique_good_subsequences;

// #Hard #String #Dynamic_Programming #2022_05_17_Time_19_ms_(53.78%)_Space_52.6_MB_(37.82%)

public class Solution {
    private static final int MOD = 1000000007;

    public int numberOfUniqueGoodSubsequences(String binary) {
        boolean addZero = false;
        // in the first round we "concat" to the empty binary
        int count = 1;
        int[] countEndsWith = new int[2];
        for (int i = 0; i < binary.length(); i++) {
            char c = binary.charAt(i);
            int cIndex = c - '0';
            // all valid sub-binaries + c at the end => same count
            int endsWithCCount = count;
            if (c == '0') {
                addZero = true;
                // every time c is '0', we concat it to "" and get "0" - we wish to count it only
                // once (done in the end)
                endsWithCCount--;
            }
            // w/out c at the end minus dups (= already end with c)
            count = (count + endsWithCCount - countEndsWith[cIndex]) % MOD;
            // may be negative due to MOD
            count = count < 0 ? count + MOD : count;
            countEndsWith[cIndex] = endsWithCCount;
        }
        // remove the empty binary
        count--;
        // add "0"
        if (addZero) {
            count++;
        }
        return count;
    }
}
