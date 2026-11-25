package g4001_4100.s4044_count_good_cyclic_rotations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countGoodRotations() {
        assertThat(new Solution().countGoodRotations(new int[] {1, 2, 3, 4}), equalTo(1));
    }

    @Test
    void countGoodRotations2() {
        assertThat(new Solution().countGoodRotations(new int[] {1, 1, 1, 1}), equalTo(0));
    }

    @Test
    void countGoodRotations3() {
        assertThat(new Solution().countGoodRotations(new int[] {5, 1}), equalTo(1));
    }

    @Test
    void countGoodRotations4() {
        assertThat(new Solution().countGoodRotations(new int[] {7}), equalTo(0));
    }
}

