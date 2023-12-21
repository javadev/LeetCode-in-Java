package g1501_1600.s1534_count_good_triplets;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countGoodTriplets() {
        assertThat(
                new Solution().countGoodTriplets(new int[] {3, 0, 1, 1, 9, 7}, 7, 2, 3),
                equalTo(4));
    }

    @Test
    void countGoodTriplets2() {
        assertThat(
                new Solution().countGoodTriplets(new int[] {1, 1, 2, 2, 3}, 0, 0, 1), equalTo(0));
    }
}
