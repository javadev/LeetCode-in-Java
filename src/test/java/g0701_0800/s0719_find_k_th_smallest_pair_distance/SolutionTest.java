package g0701_0800.s0719_find_k_th_smallest_pair_distance;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallestDistancePair() {
        assertThat(new Solution().smallestDistancePair(new int[] {1, 3, 1}, 1), equalTo(0));
    }

    @Test
    void smallestDistancePair2() {
        assertThat(new Solution().smallestDistancePair(new int[] {1, 1, 1}, 2), equalTo(0));
    }

    @Test
    void smallestDistancePair3() {
        assertThat(new Solution().smallestDistancePair(new int[] {1, 6, 1}, 3), equalTo(5));
    }
}
