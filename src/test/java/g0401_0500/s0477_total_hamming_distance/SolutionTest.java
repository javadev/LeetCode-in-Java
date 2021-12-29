package g0401_0500.s0477_total_hamming_distance;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void totalHammingDistance() {
        assertThat(new Solution().totalHammingDistance(new int[] {4, 14, 2}), equalTo(6));
    }

    @Test
    void totalHammingDistance2() {
        assertThat(new Solution().totalHammingDistance(new int[] {4, 14, 4}), equalTo(4));
    }
}
