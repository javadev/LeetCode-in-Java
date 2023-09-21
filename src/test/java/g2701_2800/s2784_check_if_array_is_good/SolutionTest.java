package g2701_2800.s2784_check_if_array_is_good;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isGood() {
        assertThat(new Solution().isGood(new int[] {2, 1, 3}), equalTo(false));
    }

    @Test
    void isGood2() {
        assertThat(new Solution().isGood(new int[] {1, 3, 3, 2}), equalTo(true));
    }

    @Test
    void isGood3() {
        assertThat(new Solution().isGood(new int[] {1, 1}), equalTo(true));
    }

    @Test
    void isGood4() {
        assertThat(new Solution().isGood(new int[] {3, 4, 4, 1, 2, 1}), equalTo(false));
    }
}
