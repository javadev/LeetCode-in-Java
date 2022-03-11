package g1201_1300.s1219_path_with_maximum_gold;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getMaximumGold() {
        assertThat(
                new Solution().getMaximumGold(new int[][] {{0, 6, 0}, {5, 8, 7}, {0, 9, 0}}),
                equalTo(24));
    }

    @Test
    void getMaximumGold2() {
        assertThat(
                new Solution()
                        .getMaximumGold(
                                new int[][] {
                                    {1, 0, 7}, {2, 0, 6}, {3, 4, 5}, {0, 3, 0}, {9, 0, 20}
                                }),
                equalTo(28));
    }
}
