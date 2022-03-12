package g1201_1300.s1250_check_if_it_is_a_good_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isGoodArray() {
        assertThat(new Solution().isGoodArray(new int[] {12, 5, 7, 23}), equalTo(true));
    }

    @Test
    void isGoodArray2() {
        assertThat(new Solution().isGoodArray(new int[] {29, 6, 10}), equalTo(true));
    }

    @Test
    void isGoodArray3() {
        assertThat(new Solution().isGoodArray(new int[] {3, 6}), equalTo(false));
    }
}
