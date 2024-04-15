package g2801_2900.s2816_double_a_number_represented_as_a_linked_list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.LinkedListUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void doubleIt() {
        assertThat(
                new Solution()
                        .doubleIt(LinkedListUtils.contructLinkedList(new int[] {1, 8, 9}))
                        .toString(),
                equalTo("3, 7, 8"));
    }

    @Test
    void doubleIt2() {
        assertThat(
                new Solution()
                        .doubleIt(LinkedListUtils.contructLinkedList(new int[] {9, 9, 9}))
                        .toString(),
                equalTo("1, 9, 9, 8"));
    }
}
