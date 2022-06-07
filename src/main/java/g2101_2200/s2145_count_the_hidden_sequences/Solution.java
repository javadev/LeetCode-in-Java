package g2101_2200.s2145_count_the_hidden_sequences;

class Solution {
    public int numberOfArrays(int[] diff, int lower, int upper) {
        int n = diff.length;
        if (lower == upper) {
            for (int i = 0; i < n; i++) {
                if (diff[i] != 0) return 0;
            }
        }

        int max = -(int) 1e9;
        int min = (int) 1e9;
        int[] hidden = new int[n + 1];
        hidden[0] = 0;

        for (int i = 1; i <= n; i++) {
            hidden[i] = hidden[i - 1] + diff[i - 1];
        }

        for (int i = 0; i <= n; i++) {
            if (hidden[i] > max) max = hidden[i];
            if (hidden[i] < min) min = hidden[i];
        }

        int low = lower - min;
        int high = upper - max;

        if (low > high) return 0;
        int count = (high - low) + 1;

        return count;
    }
}
