package g3101_3200.s3151_special_array_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isArraySpecial() {
        assertThat(new Solution().isArraySpecial(new int[] {1}), equalTo(true));
    }

    @Test
    void isArraySpecial2() {
        assertThat(new Solution().isArraySpecial(new int[] {2, 1, 4}), equalTo(true));
    }

    @Test
    void isArraySpecial3() {
        assertThat(new Solution().isArraySpecial(new int[] {4, 3, 1, 6}), equalTo(false));
    }

    @Test
    void isArraySpecial4() {
        assertThat(new Solution().isArraySpecial(new int[] {2, 10}), equalTo(false));
    }
}
