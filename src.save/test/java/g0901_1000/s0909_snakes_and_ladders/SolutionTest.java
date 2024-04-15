package g0901_1000.s0909_snakes_and_ladders;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void snakesAndLadders() {
        assertThat(
                new Solution()
                        .snakesAndLadders(
                                new int[][] {
                                    {-1, -1, -1, -1, -1, -1},
                                    {-1, -1, -1, -1, -1, -1},
                                    {-1, -1, -1, -1, -1, -1},
                                    {-1, 35, -1, -1, 13, -1},
                                    {-1, -1, -1, -1, -1, -1},
                                    {-1, 15, -1, -1, -1, -1}
                                }),
                equalTo(4));
    }

    @Test
    void snakesAndLadders2() {
        assertThat(new Solution().snakesAndLadders(new int[][] {{-1, -1}, {-1, 3}}), equalTo(1));
    }
}
