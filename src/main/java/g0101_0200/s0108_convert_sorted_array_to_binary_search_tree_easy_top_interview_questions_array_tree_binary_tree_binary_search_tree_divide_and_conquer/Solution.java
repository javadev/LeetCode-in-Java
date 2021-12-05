package g0101_0200.s0108_convert_sorted_array_to_binary_search_tree_easy_top_interview_questions_array_tree_binary_tree_binary_search_tree_divide_and_conquer;

import com_github_leetcode.TreeNode;

public class Solution {
    public TreeNode sortedArrayToBST(int[] num) {
        /*1. Set up recursion*/
        return makeTree(num, 0, num.length - 1);
    }

    public TreeNode makeTree(int[] num, int left, int right) {
        /*2. left as lowest# can't be greater than right*/
        if (left > right) {
            return null;
        }

        /*3. Set median# as node*/
        int mid = (left + right) / 2;
        TreeNode midNode = new TreeNode(num[mid]);

        /*4. Set mid node's kids*/
        midNode.left = makeTree(num, left, mid - 1);
        midNode.right = makeTree(num, mid + 1, right);

        /*5. Sends node back || Goes back to prev node*/
        return midNode;
    }
}
