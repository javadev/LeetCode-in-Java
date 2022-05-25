package g1801_1900.s1888_minimum_number_of_flips_to_make_the_binary_string_alternating;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minFlips() {
        assertThat(new Solution().minFlips("111000"), equalTo(2));
    }

    @Test
    void minFlips2() {
        assertThat(new Solution().minFlips("010"), equalTo(0));
    }

    @Test
    void minFlips3() {
        assertThat(new Solution().minFlips("1110"), equalTo(1));
    }
}
