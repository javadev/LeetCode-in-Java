package g1601_1700.s1691_maximum_height_by_stacking_cuboids;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxHeight() {
        assertThat(
                new Solution().maxHeight(new int[][] {{50, 45, 20}, {95, 37, 53}, {45, 23, 12}}),
                equalTo(190));
    }

    @Test
    void maxHeight2() {
        assertThat(new Solution().maxHeight(new int[][] {{38, 25, 45}, {76, 35, 3}}), equalTo(76));
    }

    @Test
    void maxHeight3() {
        assertThat(
                new Solution()
                        .maxHeight(
                                new int[][] {
                                    {7, 11, 17},
                                    {7, 17, 11},
                                    {11, 7, 17},
                                    {11, 17, 7},
                                    {17, 7, 11},
                                    {17, 11, 7}
                                }),
                equalTo(102));
    }
}
