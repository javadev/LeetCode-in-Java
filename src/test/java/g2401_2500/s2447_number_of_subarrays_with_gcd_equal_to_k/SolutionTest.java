package g2401_2500.s2447_number_of_subarrays_with_gcd_equal_to_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void subarrayGCD() {
        assertThat(new Solution().subarrayGCD(new int[] {9, 3, 1, 2, 6, 3}, 3), equalTo(4));
    }

    @Test
    void subarrayGCD2() {
        assertThat(new Solution().subarrayGCD(new int[] {4}, 7), equalTo(0));
    }
}
