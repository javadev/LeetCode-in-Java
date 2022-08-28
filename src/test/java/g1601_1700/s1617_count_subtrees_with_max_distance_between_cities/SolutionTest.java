package g1601_1700.s1617_count_subtrees_with_max_distance_between_cities;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countSubgraphsForEachDiameter() {
        assertThat(
                new Solution()
                        .countSubgraphsForEachDiameter(4, new int[][] {{1, 2}, {2, 3}, {2, 4}}),
                equalTo(new int[] {3, 4, 0}));
    }

    @Test
    void countSubgraphsForEachDiameter2() {
        assertThat(
                new Solution().countSubgraphsForEachDiameter(2, new int[][] {{1, 2}}),
                equalTo(new int[] {1}));
    }

    @Test
    void countSubgraphsForEachDiameter3() {
        assertThat(
                new Solution().countSubgraphsForEachDiameter(3, new int[][] {{1, 2}, {2, 3}}),
                equalTo(new int[] {2, 1}));
    }
}
