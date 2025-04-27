package g3501_3600.s3528_unit_conversion_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void baseUnitConversions() {
        assertThat(
                new Solution().baseUnitConversions(new int[][] {{0, 1, 2}, {1, 2, 3}}),
                equalTo(new int[] {1, 2, 6}));
    }

    @Test
    void baseUnitConversions2() {
        assertThat(
                new Solution()
                        .baseUnitConversions(
                                new int[][] {
                                    {0, 1, 2}, {0, 2, 3}, {1, 3, 4}, {1, 4, 5}, {2, 5, 2},
                                    {4, 6, 3}, {5, 7, 4}
                                }),
                equalTo(new int[] {1, 2, 3, 8, 10, 6, 30, 24}));
    }
}
