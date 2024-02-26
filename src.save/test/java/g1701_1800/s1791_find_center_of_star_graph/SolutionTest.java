package g1701_1800.s1791_find_center_of_star_graph;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findCenter() {
        assertThat(new Solution().findCenter(new int[][] {{1, 2}, {2, 3}, {4, 2}}), equalTo(2));
    }

    @Test
    void findCenter2() {
        assertThat(
                new Solution().findCenter(new int[][] {{1, 2}, {5, 1}, {1, 3}, {1, 4}}),
                equalTo(1));
    }
}
