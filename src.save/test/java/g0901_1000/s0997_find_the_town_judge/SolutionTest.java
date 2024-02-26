package g0901_1000.s0997_find_the_town_judge;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findJudge() {
        assertThat(new Solution().findJudge(2, new int[][] {{1, 2}}), equalTo(2));
    }

    @Test
    void findJudge2() {
        assertThat(new Solution().findJudge(3, new int[][] {{1, 3}, {2, 3}}), equalTo(3));
    }
}
