package g2201_2300.s2258_escape_the_spreading_fire;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumMinutes() {
        assertThat(
                new Solution()
                        .maximumMinutes(
                                new int[][] {
                                    {0, 2, 0, 0, 0, 0, 0},
                                    {0, 0, 0, 2, 2, 1, 0},
                                    {0, 2, 0, 0, 1, 2, 0},
                                    {0, 0, 2, 2, 2, 0, 2},
                                    {0, 0, 0, 0, 0, 0, 0}
                                }),
                equalTo(3));
    }

    @Test
    void maximumMinutes2() {
        assertThat(
                new Solution()
                        .maximumMinutes(new int[][] {{0, 0, 0, 0}, {0, 1, 2, 0}, {0, 2, 0, 0}}),
                equalTo(-1));
    }

    @Test
    void maximumMinutes3() {
        assertThat(
                new Solution().maximumMinutes(new int[][] {{0, 0, 0}, {2, 2, 0}, {1, 2, 0}}),
                equalTo(1000000000));
    }
}
