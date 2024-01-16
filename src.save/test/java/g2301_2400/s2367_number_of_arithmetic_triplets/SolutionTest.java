package g2301_2400.s2367_number_of_arithmetic_triplets;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void arithmeticTriplets() {
        assertThat(new Solution().arithmeticTriplets(new int[] {0, 1, 4, 6, 7, 10}, 3), equalTo(2));
    }

    @Test
    void arithmeticTriplets2() {
        assertThat(new Solution().arithmeticTriplets(new int[] {4, 5, 6, 7, 8, 9}, 2), equalTo(2));
    }
}
