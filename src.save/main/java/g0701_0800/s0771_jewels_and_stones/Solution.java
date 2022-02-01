package g0701_0800.s0771_jewels_and_stones;

// #Easy #String #Hash_Table

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
