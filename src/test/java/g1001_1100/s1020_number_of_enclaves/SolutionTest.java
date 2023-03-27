package g1001_1100.s1020_number_of_enclaves;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numEnclaves() {
        assertThat(
                new Solution()
                        .numEnclaves(
                                new int[][] {
                                    {0, 0, 0, 0}, {1, 0, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}
                                }),
                equalTo(3));
    }

    @Test
    void numEnclaves2() {
        assertThat(
                new Solution()
                        .numEnclaves(
                                new int[][] {
                                    {0, 1, 1, 0}, {1, 0, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}
                                }),
                equalTo(0));
    }
}
