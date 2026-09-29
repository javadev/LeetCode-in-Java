package g3901_4000.s3932_count_k_th_roots_in_a_range;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countKthRoots() {
        assertThat(new Solution().countKthRoots(1, 9, 3), equalTo(2));
    }

    @Test
    void countKthRoots2() {
        assertThat(new Solution().countKthRoots(8, 30, 2), equalTo(3));
    }

    @Test
    void countKthRoots3() {
        assertThat(new Solution().countKthRoots(0, 0, 30), equalTo(1));
    }

    @Test
    void countKthRoots4() {
        assertThat(new Solution().countKthRoots(0, 1000000000, 1), equalTo(1000000001));
    }

    @Test
    void countKthRoots5() {
        assertThat(new Solution().countKthRoots(16, 16, 2), equalTo(1));
    }

    @Test
    void countKthRoots6() {
        assertThat(new Solution().countKthRoots(17, 24, 2), equalTo(0));
    }

    @Test
    void countKthRoots7() {
        assertThat(new Solution().countKthRoots(0, 1000000000, 30), equalTo(2));
    }

    @Test
    void countKthRoots8() {
        assertThat(new Solution().countKthRoots(999950884, 1000000000, 2), equalTo(1));
    }

    @Test
    void countKthRoots9() {
        assertThat(new Solution().countKthRoots(8, 27, 3), equalTo(2));
    }
}
