package g3901_4000.s3943_number_of_pairs_after_increment;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfPairs7() {
        int[][] queries = new int[30001][];
        for (int i = 0; i < queries.length - 1; i++) {
            queries[i] = new int[] {1, 0, 0, 100000};
        }
        queries[queries.length - 1] = new int[] {2, 1000000000};
        assertThat(
                new Solution().numberOfPairs(new int[] {1}, new int[] {1}, queries),
                equalTo(new int[] {0}));
    }

    @Test
    void numberOfPairs() {
        assertThat(
                new Solution()
                        .numberOfPairs(
                                new int[] {1, 2},
                                new int[] {3, 4},
                                new int[][] {{2, 5}, {1, 0, 0, 2}, {2, 5}}),
                equalTo(new int[] {2, 1}));
    }

    @Test
    void numberOfPairs2() {
        assertThat(
                new Solution()
                        .numberOfPairs(
                                new int[] {1, 1},
                                new int[] {2, 2, 3},
                                new int[][] {{2, 4}, {1, 0, 1, 1}, {2, 4}}),
                equalTo(new int[] {2, 6}));
    }

    @Test
    void numberOfPairs3() {
        assertThat(
                new Solution()
                        .numberOfPairs(
                                new int[] {2, 5, 8, 4},
                                new int[] {1, 3, 8},
                                new int[][] {{2, 9}, {1, 1, 2, 1}, {2, 10}}),
                equalTo(new int[] {1, 0}));
    }

    @Test
    void numberOfPairs4() {
        assertThat(
                new Solution()
                        .numberOfPairs(
                                new int[] {1},
                                new int[] {1, 2, 3, 4},
                                new int[][] {{1, 1, 2, 1}, {1, 1, 2, 2}, {2, 5}, {2, 6}, {2, 7}}),
                equalTo(new int[] {1, 1, 1}));
    }

    @Test
    void numberOfPairs5() {
        assertThat(
                new Solution()
                        .numberOfPairs(
                                new int[] {1},
                                new int[] {1, 2, 3},
                                new int[][] {{1, 0, 2, 5}, {1, 1, 1, 2}, {2, 7}, {2, 10}, {2, 9}}),
                equalTo(new int[] {1, 1, 1}));
    }

    @Test
    void numberOfPairs6() {
        assertThat(
                new Solution()
                        .numberOfPairs(new int[] {1}, new int[] {1}, new int[][] {{1, 0, 0, 1}}),
                equalTo(new int[] {}));
    }
}
