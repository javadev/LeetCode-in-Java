package g2401_2500.s2425_bitwise_xor_of_all_pairings;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void xorAllNums() {
        assertThat(
                new Solution().xorAllNums(new int[] {2, 1, 3}, new int[] {10, 2, 5, 0}),
                equalTo(13));
    }

    @Test
    void xorAllNums2() {
        assertThat(new Solution().xorAllNums(new int[] {1, 2}, new int[] {3, 4}), equalTo(0));
    }
}
