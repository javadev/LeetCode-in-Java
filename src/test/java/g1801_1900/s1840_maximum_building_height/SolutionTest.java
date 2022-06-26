package g1801_1900.s1840_maximum_building_height;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxBuilding() {
        assertThat(new Solution().maxBuilding(5, new int[][] {{2, 1}, {4, 1}}), equalTo(2));
    }

    @Test
    void maxBuilding2() {
        assertThat(new Solution().maxBuilding(6, new int[][] {}), equalTo(5));
    }

    @Test
    void maxBuilding3() {
        assertThat(
                new Solution().maxBuilding(5, new int[][] {{5, 3}, {2, 5}, {7, 4}, {10, 3}}),
                equalTo(5));
    }
}
