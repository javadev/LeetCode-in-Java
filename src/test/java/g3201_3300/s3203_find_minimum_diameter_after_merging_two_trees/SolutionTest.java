package g3201_3300.s3203_find_minimum_diameter_after_merging_two_trees;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumDiameterAfterMerge() {
        assertThat(
                new Solution()
                        .minimumDiameterAfterMerge(
                                new int[][] {{0, 1}, {0, 2}, {0, 3}}, new int[][] {{0, 1}}),
                equalTo(3));
    }

    @Test
    void minimumDiameterAfterMerge2() {
        assertThat(
                new Solution()
                        .minimumDiameterAfterMerge(
                                new int[][] {
                                    {0, 1}, {0, 2}, {0, 3}, {2, 4}, {2, 5}, {3, 6}, {2, 7}
                                },
                                new int[][] {
                                    {0, 1}, {0, 2}, {0, 3}, {2, 4}, {2, 5}, {3, 6}, {2, 7}
                                }),
                equalTo(5));
    }
}
