package g0001_0100.s0057_insert_interval;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void insert() {
        assertThat(
                new Solution().insert(new int[][] {{1, 3}, {6, 9}}, new int[] {2, 5}),
                equalTo(new int[][] {{1, 5}, {6, 9}}));
    }

    @Test
    void insert2() {
        assertThat(
                new Solution()
                        .insert(
                                new int[][] {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}},
                                new int[] {4, 8}),
                equalTo(new int[][] {{1, 2}, {3, 10}, {12, 16}}));
    }
}
