package g2501_2600.s2598_smallest_missing_non_negative_integer_after_operations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findSmallestInteger() {
        assertThat(
                new Solution().findSmallestInteger(new int[] {1, -10, 7, 13, 6, 8}, 5), equalTo(4));
    }

    @Test
    void findSmallestInteger2() {
        assertThat(
                new Solution().findSmallestInteger(new int[] {1, -10, 7, 13, 6, 8}, 7), equalTo(2));
    }
}
