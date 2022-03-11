package g1201_1300.s1222_queens_that_can_attack_the_king;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void queensAttacktheKing() {
        List<List<Integer>> actual =
                new Solution()
                        .queensAttacktheKing(
                                new int[][] {{0, 1}, {1, 0}, {4, 0}, {0, 4}, {3, 3}, {2, 4}},
                                new int[] {0, 0});
        List<List<Integer>> expected =
                Arrays.asList(Arrays.asList(0, 1), Arrays.asList(1, 0), Arrays.asList(3, 3));
        assertThat(CommonUtils.compareMatrix(actual, expected), equalTo(true));
    }

    @Test
    void queensAttacktheKing2() {
        List<List<Integer>> actual =
                new Solution()
                        .queensAttacktheKing(
                                new int[][] {
                                    {0, 0}, {1, 1}, {2, 2}, {3, 4}, {3, 5}, {4, 4}, {4, 5}
                                },
                                new int[] {3, 3});
        List<List<Integer>> expected =
                Arrays.asList(Arrays.asList(2, 2), Arrays.asList(3, 4), Arrays.asList(4, 4));
        assertThat(CommonUtils.compareMatrix(actual, expected), equalTo(true));
    }

    @Test
    void queensAttacktheKing3() {
        List<List<Integer>> actual =
                new Solution()
                        .queensAttacktheKing(
                                new int[][] {
                                    {5, 6}, {7, 7}, {2, 1}, {0, 7}, {1, 6}, {5, 1}, {3, 7}, {0, 3},
                                    {4, 0}, {1, 2}, {6, 3}, {5, 0}, {0, 4}, {2, 2}, {1, 1}, {6, 4},
                                    {5, 4}, {0, 0}, {2, 6}, {4, 5}, {5, 2}, {1, 4}, {7, 5}, {2, 3},
                                    {0, 5}, {4, 2}, {1, 0}, {2, 7}, {0, 1}, {4, 6}, {6, 1}, {0, 6},
                                    {4, 3}, {1, 7}
                                },
                                new int[] {3, 4});
        List<List<Integer>> expected =
                Arrays.asList(
                        Arrays.asList(2, 3),
                        Arrays.asList(1, 4),
                        Arrays.asList(1, 6),
                        Arrays.asList(3, 7),
                        Arrays.asList(4, 3),
                        Arrays.asList(5, 4),
                        Arrays.asList(4, 5));
        assertThat(CommonUtils.compareMatrix(actual, expected), equalTo(true));
    }
}
