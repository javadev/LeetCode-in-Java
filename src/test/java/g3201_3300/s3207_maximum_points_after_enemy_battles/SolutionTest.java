package g3201_3300.s3207_maximum_points_after_enemy_battles;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumPoints() {
        assertThat(new Solution().maximumPoints(new int[] {3, 2, 2}, 2), equalTo(3L));
    }

    @Test
    void maximumPoints2() {
        assertThat(new Solution().maximumPoints(new int[] {2}, 10), equalTo(5L));
    }
}
