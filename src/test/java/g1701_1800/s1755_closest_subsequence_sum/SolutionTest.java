package g1701_1800.s1755_closest_subsequence_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minAbsDifference() {
        assertThat(new Solution().minAbsDifference(new int[] {5, -7, 3, 5}, 6), equalTo(0));
    }

    @Test
    void minAbsDifference2() {
        assertThat(new Solution().minAbsDifference(new int[] {7, -9, 15, -2}, -5), equalTo(1));
    }

    @Test
    void minAbsDifference3() {
        assertThat(new Solution().minAbsDifference(new int[] {1, 2, 3}, -7), equalTo(7));
    }
}
