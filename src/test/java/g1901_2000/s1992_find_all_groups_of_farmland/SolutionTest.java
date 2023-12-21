package g1901_2000.s1992_find_all_groups_of_farmland;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findFarmland() {
        assertThat(
                new Solution().findFarmland(new int[][] {{1, 0, 0}, {0, 1, 1}, {0, 1, 1}}),
                equalTo(new int[][] {{0, 0, 0, 0}, {1, 1, 2, 2}}));
    }

    @Test
    void findFarmland2() {
        assertThat(
                new Solution().findFarmland(new int[][] {{1, 1}, {1, 1}}),
                equalTo(new int[][] {{0, 0, 1, 1}}));
    }

    @Test
    void findFarmland3() {
        assertThat(new Solution().findFarmland(new int[][] {{0}}), equalTo(new int[][] {}));
    }

    @Test
    void findFarmland4() {
        assertThat(new Solution().findFarmland(new int[][] {}), equalTo(new int[][] {}));
    }

    @Test
    void findFarmland5() {
        assertThat(new Solution().findFarmland(null), equalTo(new int[][] {}));
    }
}
