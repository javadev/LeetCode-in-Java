package g3301_3400.s3357_minimize_the_maximum_adjacent_element_difference;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minDifference() {
        assertThat(new Solution().minDifference(new int[] {1, 2, -1, 10, 8}), equalTo(4));
    }

    @Test
    void minDifference2() {
        assertThat(new Solution().minDifference(new int[] {-1, -1, -1}), equalTo(0));
    }

    @Test
    void minDifference3() {
        assertThat(new Solution().minDifference(new int[] {-1, 10, -1, 8}), equalTo(1));
    }
}
