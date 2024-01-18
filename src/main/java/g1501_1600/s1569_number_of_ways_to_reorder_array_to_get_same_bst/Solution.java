package g1501_1600.s1569_number_of_ways_to_reorder_array_to_get_same_bst;

// #Hard #Array #Dynamic_Programming #Math #Tree #Binary_Tree #Union_Find #Binary_Search_Tree
// #Divide_and_Conquer #Memoization #Combinatorics
// #2022_04_11_Time_21_ms_(97.44%)_Space_49.9_MB_(92.31%)

public class Solution {
    public int numOfWays(int[] nums) {
        long mod = 1000000007;
        long[] fact = new long[1001];
        fact[0] = 1;
        for (int i = 1; i <= 1000; i++) {
            fact[i] = (fact[i - 1] * (i)) % mod;
        }
        TreeNode root = new TreeNode(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            addInTree(nums[i], root);
        }

        return (int) ((calcPerms(root, fact).perm - 1) % mod);
    }

    static TreeInfo calcPerms(TreeNode root, long[] fact) {
        TreeInfo left;
        TreeInfo right;

        if (root.left != null) {
            left = calcPerms(root.left, fact);
        } else {
            left = new TreeInfo(0, 1);
        }

        if (root.right != null) {
            right = calcPerms(root.right, fact);
        } else {
            right = new TreeInfo(0, 1);
        }
        long mod = 1000000007;
        long totNodes = left.numOfNodes + right.numOfNodes + 1;

        long modDiv =
                getModDivision(
                        fact[(int) totNodes - 1],
                        fact[(int) left.numOfNodes],
                        fact[(int) right.numOfNodes],
                        mod);
        long perms = (totNodes == 1) ? 1 : ((((left.perm * right.perm) % mod) * modDiv) % mod);

        left.numOfNodes = totNodes;
        left.perm = perms;
        return left;
    }

    static long getModDivision(long a, long b1, long b2, long m) {
        long b = (b1 * b2);

        long inv = getInverse(b, m);
        return ((inv * a) % m);
    }

    static long getInverse(long b, long m) {
        Inverse inv = getInverseExtended(b, m);
        return ((inv.x % m) + m) % m;
    }

    static Inverse getInverseExtended(long a, long b) {
        if (a == 0) {
            return new Inverse(0, 1);
        }

        Inverse inv = getInverseExtended(b % a, a);
        long x1 = inv.y - ((b / a) * inv.x);
        long y1 = inv.x;
        inv.x = x1;
        inv.y = y1;
        return inv;
    }

    static class Inverse {
        long x;
        long y;

        Inverse(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }

    static class TreeInfo {
        long numOfNodes;
        long perm;

        TreeInfo(long numOfNodes, long perm) {
            this.numOfNodes = numOfNodes;
            this.perm = perm;
        }
    }

    static void addInTree(int x, TreeNode root) {
        if (root.val > x) {
            if (root.left != null) {
                addInTree(x, root.left);
            } else {
                root.left = new TreeNode(x);
            }
        }
        if (root.val < x) {
            if (root.right != null) {
                addInTree(x, root.right);
            } else {
                root.right = new TreeNode(x);
            }
        }
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
            left = null;
            right = null;
        }
    }
}
