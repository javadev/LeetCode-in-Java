package g1801_1900.s1864_minimum_number_of_swaps_to_make_the_binary_string_alternating;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minSwaps() {
        assertThat(new Solution().minSwaps("111000"), equalTo(1));
    }

    @Test
    void minSwaps2() {
        assertThat(new Solution().minSwaps("010"), equalTo(0));
    }

    @Test
    void minSwaps3() {
        assertThat(new Solution().minSwaps("1110"), equalTo(-1));
    }
}
