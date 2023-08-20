package g2101_2200.s2179_count_good_triplets_in_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void goodTriplets() {
        assertThat(
                new Solution().goodTriplets(new int[] {2, 0, 1, 3}, new int[] {0, 1, 2, 3}),
                equalTo(1L));
    }

    @Test
    void goodTriplets2() {
        assertThat(
                new Solution().goodTriplets(new int[] {4, 0, 1, 3, 2}, new int[] {4, 1, 0, 2, 3}),
                equalTo(4L));
    }
}
