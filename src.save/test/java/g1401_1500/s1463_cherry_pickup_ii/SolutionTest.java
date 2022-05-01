package g1401_1500.s1463_cherry_pickup_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void cherryPickup() {
        assertThat(
                new Solution()
                        .cherryPickup(new int[][] {{3, 1, 1}, {2, 5, 1}, {1, 5, 5}, {2, 1, 1}}),
                equalTo(24));
    }

    @Test
    void cherryPickup2() {
        assertThat(
                new Solution()
                        .cherryPickup(
                                new int[][] {
                                    {1, 0, 0, 0, 0, 0, 1},
                                    {2, 0, 0, 0, 0, 3, 0},
                                    {2, 0, 9, 0, 0, 0, 0},
                                    {0, 3, 0, 5, 4, 0, 0},
                                    {1, 0, 2, 3, 0, 0, 6}
                                }),
                equalTo(28));
    }
}
