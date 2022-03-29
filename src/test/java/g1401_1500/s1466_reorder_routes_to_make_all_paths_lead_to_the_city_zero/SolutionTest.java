package g1401_1500.s1466_reorder_routes_to_make_all_paths_lead_to_the_city_zero;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minReorder() {
        assertThat(
                new Solution().minReorder(6, new int[][] {{0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}}),
                equalTo(3));
    }

    @Test
    void minReorder2() {
        assertThat(
                new Solution().minReorder(5, new int[][] {{1, 0}, {1, 2}, {3, 2}, {3, 4}}),
                equalTo(2));
    }

    @Test
    void minReorder3() {
        assertThat(new Solution().minReorder(6, new int[][] {{1, 0}, {2, 0}}), equalTo(0));
    }
}
