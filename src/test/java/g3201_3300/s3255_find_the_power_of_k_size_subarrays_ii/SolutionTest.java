package g3201_3300.s3255_find_the_power_of_k_size_subarrays_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void resultsArray() {
        assertThat(
                new Solution().resultsArray(new int[] {1, 2, 3, 4, 3, 2, 5}, 3),
                equalTo(new int[] {3, 4, -1, -1, -1}));
    }

    @Test
    void resultsArray2() {
        assertThat(
                new Solution().resultsArray(new int[] {2, 2, 2, 2, 2}, 4),
                equalTo(new int[] {-1, -1}));
    }

    @Test
    void resultsArray3() {
        assertThat(
                new Solution().resultsArray(new int[] {3, 2, 3, 2, 3, 2}, 2),
                equalTo(new int[] {-1, 3, -1, 3, -1}));
    }
}
