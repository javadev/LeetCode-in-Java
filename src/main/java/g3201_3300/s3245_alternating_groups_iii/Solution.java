package g3201_3300.s3245_alternating_groups_iii;

// #Hard #Array #Binary_Indexed_Tree #2025_03_14_Time_38_ms_(91.84%)_Space_77.53_MB_(87.76%)

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class Solution {
    public List<Integer> numberOfAlternatingGroups(int[] colors, int[][] queries) {
        int n = colors.length;
        BitSet set = new BitSet();
        BIT bit = new BIT(n);
        for (int i = 0; i < n; i++) {
            if (colors[i] == colors[getIndex(i + 1, n)]) {
                add(set, bit, n, i);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int[] q : queries) {
            if (q[0] == 1) {
                if (set.isEmpty()) {
                    ans.add(n);
                } else {
                    int size = q[1];
                    int[] res = bit.query(size);
                    ans.add(res[1] - res[0] * (size - 1));
                }
            } else {
                int i = q[1];
                int color = colors[i];
                if (q[2] == color) {
                    continue;
                }
                int pre = getIndex(i - 1, n);
                if (colors[pre] == color) {
                    remove(set, bit, n, pre);
                }
                int next = getIndex(i + 1, n);
                if (colors[next] == color) {
                    remove(set, bit, n, i);
                }
                colors[i] ^= 1;
                color = colors[i];
                if (colors[pre] == color) {
                    add(set, bit, n, pre);
                }
                if (colors[next] == color) {
                    add(set, bit, n, i);
                }
            }
        }
        return ans;
    }

    private void add(BitSet set, BIT bit, int n, int i) {
        if (set.isEmpty()) {
            bit.update(n, 1);
        } else {
            update(set, bit, n, i, 1);
        }
        set.set(i);
    }

    private void remove(BitSet set, BIT bit, int n, int i) {
        set.clear(i);
        if (set.isEmpty()) {
            bit.update(n, -1);
        } else {
            update(set, bit, n, i, -1);
        }
    }

    private void update(BitSet set, BIT bit, int n, int i, int v) {
        int pre = set.previousSetBit(i);
        if (pre == -1) {
            pre = set.previousSetBit(n);
        }
        int next = set.nextSetBit(i);
        if (next == -1) {
            next = set.nextSetBit(0);
        }
        bit.update(getIndex(next - pre + n - 1, n) + 1, -v);
        bit.update(getIndex(i - pre, n), v);
        bit.update(getIndex(next - i, n), v);
    }

    private int getIndex(int index, int mod) {
        int result = index >= mod ? index - mod : index;
        return index < 0 ? index + mod : result;
    }

    private static class BIT {
        int n;
        int[] tree1;
        int[] tree2;

        BIT(int n) {
            this.n = n + 1;
            tree1 = new int[n + 1];
            tree2 = new int[n + 1];
        }

        void update(int size, int v) {
            for (int i = size; i > 0; i -= i & -i) {
                tree1[i] += v;
                tree2[i] += v * size;
            }
        }

        int[] query(int size) {
            int count = 0;
            int sum = 0;
            for (int i = size; i < n; i += i & -i) {
                count += tree1[i];
                sum += tree2[i];
            }
            return new int[] {count, sum};
        }
    }
}
