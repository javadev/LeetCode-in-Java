package g0901_1000.s1000_minimum_cost_to_merge_stones;

// #Hard #Array #Dynamic_Programming

public class Solution {
    public int mergeStones(int[] stones, int k) {
        int n = stones.length;
        int[][] mem = new int[n][n];
        int[] s = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += stones[i];
            s[i] = sum;
        }
        return merge(stones, 0, n - 1, k, s, mem);
    }

    private int merge(int[] stones, int start, int end, int k, int[] s, int[][] mem) {
        if (start == end) return 0;
        if (end - start < k - 1) return -1;
        if (mem[start][end] != 0) {
            return mem[start][end];
        }
        int result = backtrack(stones, start, end, k, k, s, mem);
        if (result >= 0) {
            result += s[end] - (start == 0 ? 0 : s[start - 1]);
        }
        mem[start][end] = result;
        return result;
    }

    private int backtrack(int[] stones, int start, int end, int k, int ck, int[] s, int[][] mem) {
        if (end - start < ck - 1) {
            return -1;
        }
        if (ck == 1) {
            return merge(stones, start, end, k, s, mem);
        }
        int min = Integer.MAX_VALUE;
        for (int i = start; i < end; i++) {
            int m = merge(stones, start, i, k, s, mem);
            if (m < 0) {
                continue;
            }
            int b = backtrack(stones, i + 1, end, k, ck - 1, s, mem);
            if (b < 0) {
                continue;
            }
            min = Math.min(m + b, min);
        }
        if (min == Integer.MAX_VALUE) {
            return -1;
        }
        return min;
    }
}
