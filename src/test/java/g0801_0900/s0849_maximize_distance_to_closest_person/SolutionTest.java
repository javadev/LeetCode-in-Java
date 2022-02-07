package g0801_0900.s0849_maximize_distance_to_closest_person;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxDistToClosest() {
        assertThat(new Solution().maxDistToClosest(new int[] {1, 0, 0, 0, 1, 0, 1}), equalTo(2));
    }

    @Test
    void maxDistToClosest2() {
        assertThat(new Solution().maxDistToClosest(new int[] {1, 0, 0, 0}), equalTo(3));
    }

    @Test
    void maxDistToClosest3() {
        assertThat(new Solution().maxDistToClosest(new int[] {0, 1}), equalTo(1));
    }
}
