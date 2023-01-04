package g1301_1400.s1337_the_k_weakest_rows_in_a_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void kWeakestRows() {
        int[][] mat =
                new int[][] {
                    {1, 1, 0, 0, 0},
                    {1, 1, 1, 1, 0},
                    {1, 0, 0, 0, 0},
                    {1, 1, 0, 0, 0},
                    {1, 1, 1, 1, 1}
                };
        assertThat(new Solution().kWeakestRows(mat, 3), equalTo(new int[] {2, 0, 3}));
    }

    @Test
    void kWeakestRows2() {
        int[][] mat = new int[][] {{1, 0, 0, 0}, {1, 1, 1, 1}, {1, 0, 0, 0}, {1, 0, 0, 0}};
        assertThat(new Solution().kWeakestRows(mat, 2), equalTo(new int[] {0, 2}));
    }
}
