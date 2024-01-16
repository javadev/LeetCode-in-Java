package g2001_2100.s2090_k_radius_subarray_averages;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getAverages() {
        assertThat(
                new Solution().getAverages(new int[] {7, 4, 3, 9, 1, 8, 5, 2, 6}, 3),
                equalTo(new int[] {-1, -1, -1, 5, 4, 4, -1, -1, -1}));
    }

    @Test
    void getAverages2() {
        assertThat(new Solution().getAverages(new int[] {100000}, 0), equalTo(new int[] {100000}));
    }

    @Test
    void getAverages3() {
        assertThat(new Solution().getAverages(new int[] {8}, 100000), equalTo(new int[] {-1}));
    }
}
