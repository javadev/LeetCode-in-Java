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

    @Test
    void xorAllNums3() {
        assertThat(new Solution().xorAllNums(new int[] {7}, new int[] {1, 2, 3}), equalTo(7));
    }

    @Test
    void xorAllNums4() {
        assertThat(new Solution().xorAllNums(new int[] {1, 2, 3}, new int[] {5}), equalTo(5));
    }

    @Test
    void xorAllNums5() {
        assertThat(new Solution().xorAllNums(new int[] {8}, new int[] {6}), equalTo(14));
    }

    @Test
    void xorAllNums6() {
        assertThat(new Solution().xorAllNums(new int[] {}, new int[] {1, 2, 3}), equalTo(0));
    }

    @Test
    void xorAllNums7() {
        assertThat(new Solution().xorAllNums(new int[] {4, 5, 6}, new int[] {}), equalTo(0));
    }

    @Test
    void xorAllNums8() {
        assertThat(new Solution().xorAllNums(new int[] {}, new int[] {}), equalTo(0));
    }
}
