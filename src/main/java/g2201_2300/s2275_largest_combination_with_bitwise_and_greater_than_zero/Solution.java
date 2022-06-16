package g2201_2300.s2275_largest_combination_with_bitwise_and_greater_than_zero;

class Solution {
    public int largestCombination(int[] candidates) {
        int[] bits = new int[32];

        for (int x : candidates) for (int i = 0; x != 0; i++, x >>= 1) bits[i] += x & 1;

        int ans = 0;
        for (int b : bits) ans = Math.max(ans, b);

        return ans;
    }
}
