package g2101_2200.s2101_detonate_the_maximum_bombs;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumDetonation() {
        assertThat(
                new Solution().maximumDetonation(new int[][] {{2, 1, 3}, {6, 1, 4}}), equalTo(2));
    }

    @Test
    void maximumDetonation2() {
        assertThat(
                new Solution().maximumDetonation(new int[][] {{1, 1, 5}, {10, 10, 5}}), equalTo(1));
    }

    @Test
    void maximumDetonation3() {
        assertThat(
                new Solution()
                        .maximumDetonation(
                                new int[][] {
                                    {1, 2, 3}, {2, 3, 1}, {3, 4, 2}, {4, 5, 3}, {5, 6, 4}
                                }),
                equalTo(5));
    }
}
