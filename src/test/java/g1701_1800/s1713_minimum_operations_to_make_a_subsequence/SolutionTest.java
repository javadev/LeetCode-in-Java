package g1701_1800.s1713_minimum_operations_to_make_a_subsequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(
                new Solution().minOperations(new int[] {5, 1, 3}, new int[] {9, 4, 2, 3, 4}),
                equalTo(2));
    }

    @Test
    void minOperations2() {
        assertThat(
                new Solution()
                        .minOperations(
                                new int[] {6, 4, 8, 1, 3, 2}, new int[] {4, 7, 6, 2, 3, 8, 6, 1}),
                equalTo(3));
    }
}
