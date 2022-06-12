package g2201_2300.s2212_maximum_points_in_an_archery_competition;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumBobPoints() {
        assertThat(
                new Solution().maximumBobPoints(9, new int[] {1, 1, 0, 1, 0, 0, 2, 1, 0, 1, 2, 0}),
                equalTo(new int[] {0, 0, 0, 0, 1, 1, 0, 0, 1, 2, 3, 1}));
    }

    @Test
    void maximumBobPoints2() {
        assertThat(
                new Solution().maximumBobPoints(3, new int[] {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 2}),
                equalTo(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0}));
    }
}
