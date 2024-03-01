package g1801_1900.s1899_merge_triplets_to_form_target_triplet;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mergeTriplets() {
        assertThat(
                new Solution()
                        .mergeTriplets(
                                new int[][] {{2, 5, 3}, {1, 8, 4}, {1, 7, 5}}, new int[] {2, 7, 5}),
                equalTo(true));
    }

    @Test
    void mergeTriplets2() {
        assertThat(
                new Solution()
                        .mergeTriplets(new int[][] {{3, 4, 5}, {4, 5, 6}}, new int[] {3, 2, 5}),
                equalTo(false));
    }

    @Test
    void mergeTriplets3() {
        assertThat(
                new Solution()
                        .mergeTriplets(
                                new int[][] {{2, 5, 3}, {2, 3, 4}, {1, 2, 5}, {5, 2, 3}},
                                new int[] {5, 5, 5}),
                equalTo(true));
    }
}
