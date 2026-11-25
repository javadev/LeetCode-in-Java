package g4001_4100.s4022_k_th_digit_in_infinite_string;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void kthDigit() {
        assertThat(new Solution().kthDigit(1), equalTo(1));
    }

    @Test
    void kthDigit2() {
        assertThat(new Solution().kthDigit(9), equalTo(9));
    }

    @Test
    void kthDigit3() {
        assertThat(new Solution().kthDigit(10), equalTo(1));
    }

    @Test
    void kthDigit4() {
        assertThat(new Solution().kthDigit(11), equalTo(9));
    }

    @Test
    void kthDigit5() {
        assertThat(new Solution().kthDigit(15), equalTo(7));
    }

    @Test
    void kthDigit6() {
        assertThat(new Solution().kthDigit(19), equalTo(5));
    }

    @Test
    void kthDigit7() {
        assertThat(new Solution().kthDigit(20), equalTo(1));
    }
}
