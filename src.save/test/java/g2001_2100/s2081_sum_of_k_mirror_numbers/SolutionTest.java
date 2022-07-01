package g2001_2100.s2081_sum_of_k_mirror_numbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void kMirror() {
        assertThat(new Solution().kMirror(2, 5), equalTo(25L));
    }

    @Test
    void kMirror2() {
        assertThat(new Solution().kMirror(3, 7), equalTo(499L));
    }

    @Test
    void kMirror3() {
        assertThat(new Solution().kMirror(7, 17), equalTo(20379000L));
    }
}
