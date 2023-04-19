package g2501_2600.s2527_find_xor_beauty_of_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void xorBeauty() {
        assertThat(new Solution().xorBeauty(new int[] {1, 4}), equalTo(5));
    }

    @Test
    void xorBeauty2() {
        assertThat(
                new Solution().xorBeauty(new int[] {15, 45, 20, 2, 34, 35, 5, 44, 32, 30}),
                equalTo(34));
    }
}
