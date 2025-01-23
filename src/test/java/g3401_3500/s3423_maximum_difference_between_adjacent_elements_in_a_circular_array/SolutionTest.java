package g3401_3500.s3423_maximum_difference_between_adjacent_elements_in_a_circular_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxAdjacentDistance() {
        assertThat(new Solution().maxAdjacentDistance(new int[] {1, 2, 4}), equalTo(3));
    }

    @Test
    void maxAdjacentDistance2() {
        assertThat(new Solution().maxAdjacentDistance(new int[] {-5, -10, -5}), equalTo(5));
    }
}
