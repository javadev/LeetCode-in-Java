package g1501_1600.s1577_number_of_ways_where_square_of_number_is_equal_to_product_of_two_numbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numTriplets() {
        assertThat(
                new Solution().numTriplets(new int[] {7, 4}, new int[] {5, 2, 8, 9}), equalTo(1));
    }

    @Test
    void numTriplets2() {
        assertThat(new Solution().numTriplets(new int[] {1, 1}, new int[] {1, 1, 1}), equalTo(9));
    }

    @Test
    void numTriplets3() {
        assertThat(
                new Solution().numTriplets(new int[] {7, 7, 8, 3}, new int[] {1, 2, 9, 7}),
                equalTo(2));
    }
}
