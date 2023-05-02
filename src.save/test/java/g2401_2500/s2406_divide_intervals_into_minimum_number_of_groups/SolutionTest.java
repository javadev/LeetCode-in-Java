package g2401_2500.s2406_divide_intervals_into_minimum_number_of_groups;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minGroups() {
        assertThat(
                new Solution().minGroups(new int[][] {{5, 10}, {6, 8}, {1, 5}, {2, 3}, {1, 10}}),
                equalTo(3));
    }

    @Test
    void minGroups2() {
        assertThat(
                new Solution().minGroups(new int[][] {{1, 3}, {5, 6}, {8, 10}, {11, 13}}),
                equalTo(1));
    }
}
