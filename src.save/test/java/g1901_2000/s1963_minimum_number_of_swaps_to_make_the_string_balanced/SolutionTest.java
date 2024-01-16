package g1901_2000.s1963_minimum_number_of_swaps_to_make_the_string_balanced;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minSwaps() {
        assertThat(new Solution().minSwaps("][]["), equalTo(1));
    }

    @Test
    void minSwaps2() {
        assertThat(new Solution().minSwaps("]]][[["), equalTo(2));
    }

    @Test
    void minSwaps3() {
        assertThat(new Solution().minSwaps("[]"), equalTo(0));
    }
}
