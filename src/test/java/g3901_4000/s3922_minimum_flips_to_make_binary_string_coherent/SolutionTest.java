package g3901_4000.s3922_minimum_flips_to_make_binary_string_coherent;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minFlips() {
        assertThat(new Solution().minFlips("1010"), equalTo(1));
    }

    @Test
    void minFlips2() {
        assertThat(new Solution().minFlips("0110"), equalTo(1));
    }

    @Test
    void minFlips3() {
        assertThat(new Solution().minFlips("1000"), equalTo(0));
    }

    @Test
    void minFlips4() {
        assertThat(new Solution().minFlips("0"), equalTo(0));
    }

    @Test
    void minFlips5() {
        assertThat(new Solution().minFlips("1111"), equalTo(0));
    }

    @Test
    void minFlips6() {
        assertThat(new Solution().minFlips("0000"), equalTo(0));
    }

    @Test
    void minFlips7() {
        assertThat(new Solution().minFlips("10001"), equalTo(0));
    }

    @Test
    void minFlips8() {
        assertThat(new Solution().minFlips("01010"), equalTo(1));
    }

    @Test
    void minFlips9() {
        assertThat(new Solution().minFlips("011110"), equalTo(2));
    }
}
