package g2401_2500.s2475_number_of_unequal_triplets_in_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void unequalTriplets() {
        assertThat(new Solution().unequalTriplets(new int[] {4, 4, 2, 4, 3}), equalTo(3));
    }

    @Test
    void unequalTriplets2() {
        assertThat(new Solution().unequalTriplets(new int[] {1, 1, 1, 1, 1}), equalTo(0));
    }
}
