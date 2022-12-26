package g1301_1400.s1367_linked_list_in_binary_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.LinkedListUtils;
import com_github_leetcode.ListNode;
import com_github_leetcode.TreeNode;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isSubPath() {
        ListNode listNode = LinkedListUtils.contructLinkedList(new int[] {4, 2, 8});
        TreeNode treeNode =
                TreeNode.create(
                        Arrays.asList(
                                1, 4, 4, null, 2, 2, null, 1, null, 6, 8, null, null, null, null, 1,
                                3));
        assertThat(new Solution().isSubPath(listNode, treeNode), equalTo(true));
    }

    @Test
    void isSubPath2() {
        ListNode listNode = LinkedListUtils.contructLinkedList(new int[] {1, 4, 2, 6});
        TreeNode treeNode =
                TreeNode.create(
                        Arrays.asList(
                                1, 4, 4, null, 2, 2, null, 1, null, 6, 8, null, null, null, null, 1,
                                3));
        assertThat(new Solution().isSubPath(listNode, treeNode), equalTo(true));
    }

    @Test
    void isSubPath3() {
        ListNode listNode = LinkedListUtils.contructLinkedList(new int[] {1, 4, 2, 6, 8});
        TreeNode treeNode =
                TreeNode.create(
                        Arrays.asList(
                                1, 4, 4, null, 2, 2, null, 1, null, 6, 8, null, null, null, null, 1,
                                3));
        assertThat(new Solution().isSubPath(listNode, treeNode), equalTo(false));
    }
}
