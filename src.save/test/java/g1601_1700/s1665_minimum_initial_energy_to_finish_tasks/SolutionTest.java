package g1601_1700.s1665_minimum_initial_energy_to_finish_tasks;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumEffort() {
        assertThat(new Solution().minimumEffort(new int[][] {{1, 2}, {2, 4}, {4, 8}}), equalTo(8));
    }

    @Test
    void minimumEffort2() {
        assertThat(
                new Solution()
                        .minimumEffort(new int[][] {{1, 3}, {2, 4}, {10, 11}, {10, 12}, {8, 9}}),
                equalTo(32));
    }

    @Test
    void minimumEffort3() {
        assertThat(
                new Solution()
                        .minimumEffort(
                                new int[][] {{1, 7}, {2, 8}, {3, 9}, {4, 10}, {5, 11}, {6, 12}}),
                equalTo(27));
    }
}
