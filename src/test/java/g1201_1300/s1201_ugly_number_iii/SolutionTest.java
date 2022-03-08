package g1201_1300.s1201_ugly_number_iii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void nthUglyNumber() {
        assertThat(new Solution().nthUglyNumber(3, 2, 3, 5), equalTo(4));
    }

    @Test
    void nthUglyNumber2() {
        assertThat(new Solution().nthUglyNumber(4, 2, 3, 4), equalTo(6));
    }

    @Test
    void nthUglyNumber3() {
        assertThat(new Solution().nthUglyNumber(5, 2, 11, 13), equalTo(10));
    }
}
