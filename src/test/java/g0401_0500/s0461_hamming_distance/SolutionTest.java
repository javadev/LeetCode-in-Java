package g0401_0500.s0461_hamming_distance;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void hammingDistance() {
        assertThat(new Solution().hammingDistance(1, 4), equalTo(2));
    }

    @Test
    void hammingDistance2() {
        assertThat(new Solution().hammingDistance(3, 1), equalTo(1));
    }
}
