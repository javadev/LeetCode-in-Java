package g3901_4000.s3910_count_connected_subgraphs_with_even_node_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void evenSumSubgraphs() {
        assertThat(
                new Solution().evenSumSubgraphs(new int[] {1, 0, 1}, new int[][] {{0, 1}, {1, 2}}),
                equalTo(2));
    }

    @Test
    void evenSumSubgraphs2() {
        assertThat(new Solution().evenSumSubgraphs(new int[] {1}, new int[][] {}), equalTo(0));
    }

    @Test
    void evenSumSubgraphs3() {
        assertThat(new Solution().evenSumSubgraphs(new int[] {0}, new int[][] {}), equalTo(1));
    }

    @Test
    void evenSumSubgraphs4() {
        assertThat(
                new Solution().evenSumSubgraphs(new int[] {0, 1, 0}, new int[][] {}), equalTo(2));
    }

    @Test
    void evenSumSubgraphs5() {
        assertThat(
                new Solution()
                        .evenSumSubgraphs(
                                new int[] {0, 0, 0}, new int[][] {{0, 1}, {1, 2}, {0, 2}}),
                equalTo(7));
    }

    @Test
    void evenSumSubgraphs6() {
        assertThat(
                new Solution()
                        .evenSumSubgraphs(
                                new int[] {1, 1, 1}, new int[][] {{0, 1}, {1, 2}, {0, 2}}),
                equalTo(3));
    }

    @Test
    void evenSumSubgraphs7() {
        assertThat(
                new Solution()
                        .evenSumSubgraphs(new int[] {1, 1, 0, 0}, new int[][] {{0, 1}, {2, 3}}),
                equalTo(4));
    }
}
