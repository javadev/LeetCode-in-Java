package g0701_0800.s0749_contain_virus;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void containVirus() {
        int[][] input =
                new int[][] {
                    {0, 1, 0, 0, 0, 0, 0, 1},
                    {0, 1, 0, 0, 0, 0, 0, 1},
                    {0, 0, 0, 0, 0, 0, 0, 1},
                    {0, 0, 0, 0, 0, 0, 0, 0}
                };
        assertThat(new Solution().containVirus(input), equalTo(10));
    }

    @Test
    void containVirus2() {
        int[][] input = new int[][] {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        assertThat(new Solution().containVirus(input), equalTo(4));
    }

    @Test
    void containVirus3() {
        int[][] input =
                new int[][] {
                    {1, 1, 1, 0, 0, 0, 0, 0, 0},
                    {1, 0, 1, 0, 1, 1, 1, 1, 1},
                    {1, 1, 1, 0, 0, 0, 0, 0, 0}
                };
        assertThat(new Solution().containVirus(input), equalTo(13));
    }
}
