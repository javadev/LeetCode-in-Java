package g1101_1200.s1125_smallest_sufficient_team;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.ArrayUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void smallestSufficientTeam() {
        assertThat(
                new Solution()
                        .smallestSufficientTeam(
                                new String[] {"java", "nodejs", "reactjs"},
                                ArrayUtils.getLists(
                                        new String[][] {
                                            {"java"}, {"nodejs"}, {"nodejs", "reactjs"}
                                        })),
                equalTo(new int[] {0, 2}));
    }

    @Test
    void smallestSufficientTeam2() {
        assertThat(
                new Solution()
                        .smallestSufficientTeam(
                                new String[] {
                                    "algorithms", "math", "java", "reactjs", "csharp", "aws"
                                },
                                ArrayUtils.getLists(
                                        new String[][] {
                                            {"algorithms", "math", "java"},
                                            {"algorithms", "math", "reactjs"},
                                            {"java", "csharp", "aws"},
                                            {"reactjs", "csharp"},
                                            {"csharp", "math"},
                                            {"aws", "java"}
                                        })),
                equalTo(new int[] {1, 2}));
    }
}
