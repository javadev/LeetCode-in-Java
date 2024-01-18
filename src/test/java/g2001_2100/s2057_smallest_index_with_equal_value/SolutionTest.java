package g2001_2100.s2057_smallest_index_with_equal_value;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallestEqual() {
        assertThat(new Solution().smallestEqual(new int[] {0, 1, 2}), equalTo(0));
    }

    @Test
    void smallestEqual2() {
        assertThat(new Solution().smallestEqual(new int[] {4, 3, 2, 1}), equalTo(2));
    }

    @Test
    void smallestEqual3() {
        assertThat(
                new Solution().smallestEqual(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}),
                equalTo(-1));
    }
}
