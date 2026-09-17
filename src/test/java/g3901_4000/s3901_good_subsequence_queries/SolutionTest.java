package g3901_4000.s3901_good_subsequence_queries;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countGoodSubseq() {
        int[] nums = new int[21];
        java.util.Arrays.fill(nums, 2);
        assertThat(
                new Solution().countGoodSubseq(nums, 2, new int[][] {{0, 4}, {20, 3}}), equalTo(2));
    }

    @Test
    void countGoodSubseq2() {
        assertThat(
                new Solution()
                        .countGoodSubseq(new int[] {4, 8, 12, 16}, 2, new int[][] {{0, 3}, {2, 6}}),
                equalTo(1));
    }

    @Test
    void countGoodSubseq3() {
        assertThat(
                new Solution()
                        .countGoodSubseq(
                                new int[] {4, 5, 7, 8}, 3, new int[][] {{0, 6}, {1, 9}, {2, 3}}),
                equalTo(2));
    }

    @Test
    void countGoodSubseq4() {
        assertThat(
                new Solution()
                        .countGoodSubseq(new int[] {5, 7, 9}, 2, new int[][] {{1, 4}, {2, 8}}),
                equalTo(0));
    }

    @Test
    void countGoodSubseq5() {
        assertThat(
                new Solution().countGoodSubseq(new int[] {6, 10, 15}, 1, new int[][] {{0, 6}}),
                equalTo(0));
    }

    @Test
    void countGoodSubseq6() {
        assertThat(
                new Solution()
                        .countGoodSubseq(
                                new int[] {2, 4}, 2, new int[][] {{0, 3}, {1, 2}, {1, 5}, {0, 2}}),
                equalTo(2));
    }

    @Test
    void countGoodSubseq7() {
        assertThat(
                new Solution().countGoodSubseq(new int[] {6, 10, 14}, 2, new int[][] {{0, 6}}),
                equalTo(1));
    }
}
