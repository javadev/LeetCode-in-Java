package g2301_2400.s2398_maximum_number_of_robots_within_budget;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumRobots() {
        assertThat(
                new Solution()
                        .maximumRobots(new int[] {3, 6, 1, 3, 4}, new int[] {2, 1, 3, 4, 5}, 25),
                equalTo(3));
    }

    @Test
    void maximumRobots2() {
        assertThat(
                new Solution().maximumRobots(new int[] {11, 12, 19}, new int[] {10, 8, 7}, 19),
                equalTo(0));
    }
}
