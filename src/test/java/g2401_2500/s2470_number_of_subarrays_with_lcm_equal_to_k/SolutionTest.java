package g2401_2500.s2470_number_of_subarrays_with_lcm_equal_to_k;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

class SolutionTest {    @Test
    void subarrayLCM() {
        assertThat(
                new Solution().subarrayLCM(new int[]{3,6,2,7,1}, 6),
                equalTo(4));
    }

    void subarrayLCM2() {
        assertThat(
                new Solution().subarrayLCM(new int[]{3}, 2),
                equalTo(0));
    }
}
