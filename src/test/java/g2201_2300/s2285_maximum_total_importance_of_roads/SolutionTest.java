package g2201_2300.s2285_maximum_total_importance_of_roads;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumImportance() {
        assertThat(
                new Solution()
                        .maximumImportance(
                                5, new int[][] {{0, 1}, {1, 2}, {2, 3}, {0, 2}, {1, 3}, {2, 4}}),
                equalTo(43L));
    }

    @Test
    void maximumImportance2() {
        assertThat(
                new Solution().maximumImportance(5, new int[][] {{0, 3}, {2, 4}, {1, 3}}),
                equalTo(20L));
    }
}
