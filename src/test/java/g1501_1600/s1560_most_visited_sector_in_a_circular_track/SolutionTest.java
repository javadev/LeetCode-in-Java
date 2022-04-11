package g1501_1600.s1560_most_visited_sector_in_a_circular_track;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mostVisited() {
        assertThat(
                new Solution().mostVisited(4, new int[] {1, 3, 1, 2}),
                equalTo(Arrays.asList(1, 2)));
    }

    @Test
    void mostVisited2() {
        assertThat(
                new Solution().mostVisited(2, new int[] {2, 1, 2, 1, 2, 1, 2, 1, 2}),
                equalTo(Collections.singletonList(2)));
    }

    @Test
    void mostVisited3() {
        assertThat(
                new Solution().mostVisited(7, new int[] {1, 3, 5, 7}),
                equalTo(Arrays.asList(1, 2, 3, 4, 5, 6, 7)));
    }
}
