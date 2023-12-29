package g2901_3000.s2924_find_champion_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findChampion() {
        assertThat(new Solution().findChampion(3, new int[][] {{0, 1}, {1, 2}}), equalTo(0));
    }

    @Test
    void findChampion2() {
        assertThat(
                new Solution().findChampion(4, new int[][] {{0, 2}, {1, 3}, {1, 2}}), equalTo(-1));
    }
}
