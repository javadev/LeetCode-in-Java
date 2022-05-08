package g1801_1900.s1848_minimum_distance_to_the_target_element;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getMinDistance() {
        assertThat(new Solution().getMinDistance(new int[] {1, 2, 3, 4, 5}, 5, 3), equalTo(1));
    }

    @Test
    void getMinDistance2() {
        assertThat(new Solution().getMinDistance(new int[] {1}, 1, 0), equalTo(0));
    }

    @Test
    void getMinDistance3() {
        assertThat(
                new Solution().getMinDistance(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 5, 3),
                equalTo(0));
    }
}
