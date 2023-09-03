package g2501_2600.s2529_maximum_count_of_positive_integer_and_negative_integer;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumCount() {
        assertThat(new Solution().maximumCount(new int[] {-2, -1, -1, 1, 2, 3}), equalTo(3));
    }

    @Test
    void maximumCount2() {
        assertThat(new Solution().maximumCount(new int[] {-3, -2, -1, 0, 0, 1, 2}), equalTo(3));
    }

    @Test
    void maximumCount3() {
        assertThat(new Solution().maximumCount(new int[] {5, 20, 66, 1314}), equalTo(4));
    }
}
