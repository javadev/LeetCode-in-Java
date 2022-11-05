package g1401_1500.s1442_count_triplets_that_can_form_two_arrays_of_equal_xor;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countTriplets() {
        assertThat(new Solution().countTriplets(new int[] {2, 3, 1, 6, 7}), equalTo(4));
    }

    @Test
    void countTriplets2() {
        assertThat(new Solution().countTriplets(new int[] {1, 1, 1, 1, 1}), equalTo(10));
    }
}
