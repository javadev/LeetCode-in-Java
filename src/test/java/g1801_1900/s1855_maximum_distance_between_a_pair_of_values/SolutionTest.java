package g1801_1900.s1855_maximum_distance_between_a_pair_of_values;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxDistance() {
        assertThat(
                new Solution()
                        .maxDistance(new int[] {55, 30, 5, 4, 2}, new int[] {100, 20, 10, 10, 5}),
                equalTo(2));
    }

    @Test
    void maxDistance2() {
        assertThat(
                new Solution().maxDistance(new int[] {2, 2, 2}, new int[] {10, 10, 1}), equalTo(1));
    }

    @Test
    void maxDistance3() {
        assertThat(
                new Solution()
                        .maxDistance(new int[] {30, 29, 19, 5}, new int[] {25, 25, 25, 25, 25}),
                equalTo(2));
    }
}
