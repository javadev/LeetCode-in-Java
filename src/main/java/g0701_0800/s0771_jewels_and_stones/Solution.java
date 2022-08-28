package g0701_0800.s0771_jewels_and_stones;

// #Easy #String #Hash_Table #2022_03_26_Time_1_ms_(91.74%)_Space_41.7_MB_(74.24%)

public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int[] x = new int[60];
        int count = 0;
        int len = jewels.length();
        int len2 = stones.length();
        for (int i = 0; i < len; i++) {
            x[jewels.charAt(i) - 65]++;
        }
        for (int i = 0; i < len2; i++) {
            if (x[stones.charAt(i) - 65] == 1) {
                count++;
            }
        }
        return count;
    }
}
