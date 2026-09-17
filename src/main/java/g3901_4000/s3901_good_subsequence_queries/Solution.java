package g3901_4000.s3901_good_subsequence_queries;

// #Hard #Array #Math #Segment_Tree #Number_Theory #Weekly_Contest_497 #Principal
// #2026_09_17_Time_20_ms_(100.00%)_Space_133.27_MB_(34.15%)

public class Solution {
    private int[] tree;
    private int validCount = 0;

    public int countGoodSubseq(int[] nums, int p, int[][] queries) {
        int n = nums.length;
        // 1. Iterative Segment Tree only needs 2n space
        tree = new int[2 * n];
        // Build the leaves of the tree and get initial count
        for (int i = 0; i < n; i++) {
            if (nums[i] % p == 0) {
                tree[n + i] = nums[i];
                validCount++;
            }
        }
        // Build the internal nodes bottom-up
        for (int i = n - 1; i > 0; --i) {
            // tree[i << 1] is the left child, tree[i << 1 | 1] is the right child
            tree[i] = gcd(tree[i << 1], tree[i << 1 | 1]);
        }
        int ans = 0;
        for (int[] q : queries) {
            int idx = q[0];
            int value = q[1];
            // 2. O(1) tracking for validCount (No segment tree needed for this!)
            boolean wasValid = (nums[idx] % p == 0);
            boolean isValid = (value % p == 0);
            if (wasValid && !isValid) {
                validCount--;
            }
            if (!wasValid && isValid) {
                validCount++;
            }

            // Update the original array to keep track of the old values
            nums[idx] = value;
            // Point update for the Iterative Tree
            tree[idx + n] = isValid ? value : 0;
            // Climb up the tree using bitwise shifts (i >>= 1 means i = i / 2)
            for (int i = idx + n; i > 1; i >>= 1) {
                tree[i >> 1] = gcd(tree[i], tree[i ^ 1]);
            }
            // 3. The logic check (tree[1] is ALWAYS the root in an iterative tree)
            if (tree[1] == p) {
                if (validCount < n) {
                    ans++;
                } else {
                    // validCount == n (Every element is a multiple of p)
                    if (n > 20) {
                        // THE O(1) MATH BYPASS!
                        ans++;
                    } else {
                        // Only run this heavy check if n is 20 or smaller
                        boolean flag = false;
                        for (int i = 0; i < n; i++) {
                            int leftGcd = query(0, i - 1, n);
                            int rightGcd = query(i + 1, n - 1, n);
                            if (gcd(leftGcd, rightGcd) == p) {
                                flag = true;
                                break;
                            }
                        }
                        if (flag) {
                            ans++;
                        }
                    }
                }
            }
        }
        return ans;
    }

    // Iterative Range Query [l, r] inclusive
    private int query(int l, int r, int n) {
        if (l > r) {
            return 0;
        }
        int res = 0;
        for (l += n, r += n + 1; l < r; l >>= 1, r >>= 1) {
            if ((l & 1) == 1) {
                res = gcd(res, tree[l++]);
            }
            if ((r & 1) == 1) {
                res = gcd(res, tree[--r]);
            }
        }
        return res;
    }

    private int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
