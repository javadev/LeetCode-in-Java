package g2801_2900.s2807_insert_greatest_common_divisors_in_linked_list;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.LinkedListUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void insertGreatestCommonDivisors() {
        assertThat(
                new Solution()
                        .insertGreatestCommonDivisors(
                                LinkedListUtils.contructLinkedList(new int[] {18, 6, 10, 3}))
                        .toString(),
                equalTo(
                        LinkedListUtils.contructLinkedList(new int[] {18, 6, 6, 2, 10, 1, 3})
                                .toString()));
    }

    @Test
    void insertGreatestCommonDivisors2() {
        assertThat(
                new Solution()
                        .insertGreatestCommonDivisors(
                                LinkedListUtils.contructLinkedList(new int[] {7}))
                        .toString(),
                equalTo(LinkedListUtils.contructLinkedList(new int[] {7}).toString()));
    }
}
