package g3101_3200.s3131_find_the_integer_added_to_array_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void addedInteger() {
        assertThat(
                new Solution().addedInteger(new int[] {2, 6, 4}, new int[] {9, 7, 5}), equalTo(3));
    }

    @Test
    void addedInteger2() {
        assertThat(new Solution().addedInteger(new int[] {10}, new int[] {5}), equalTo(-5));
    }

    @Test
    void addedInteger3() {
        assertThat(
                new Solution().addedInteger(new int[] {1, 1, 1, 1}, new int[] {1, 1, 1, 1}),
                equalTo(0));
    }
}
