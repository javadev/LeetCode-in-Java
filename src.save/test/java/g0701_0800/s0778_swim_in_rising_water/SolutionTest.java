package g0701_0800.s0778_swim_in_rising_water;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void swimInWater() {
        assertThat(new Solution().swimInWater(new int[][] {{0, 2}, {1, 3}}), equalTo(3));
    }

    @Test
    void swimInWater2() {
        assertThat(
                new Solution()
                        .swimInWater(
                                new int[][] {
                                    {0, 1, 2, 3, 4},
                                    {24, 23, 22, 21, 5},
                                    {12, 13, 14, 15, 16},
                                    {11, 17, 18, 19, 20},
                                    {10, 9, 8, 7, 6}
                                }),
                equalTo(16));
    }
}
