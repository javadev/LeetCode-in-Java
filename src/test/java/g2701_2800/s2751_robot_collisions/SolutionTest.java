package g2701_2800.s2751_robot_collisions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void survivedRobotsHealths() {
        assertThat(
                new Solution()
                        .survivedRobotsHealths(
                                new int[] {5, 4, 3, 2, 1}, new int[] {2, 17, 9, 15, 10}, "RRRRR"),
                equalTo(Arrays.asList(2, 17, 9, 15, 10)));
    }

    @Test
    void survivedRobotsHealths2() {
        assertThat(
                new Solution()
                        .survivedRobotsHealths(
                                new int[] {3, 5, 2, 6}, new int[] {10, 10, 15, 12}, "RLRL"),
                equalTo(List.of(14)));
    }

    @Test
    void survivedRobotsHealths3() {
        assertThat(
                new Solution()
                        .survivedRobotsHealths(
                                new int[] {1, 2, 5, 6}, new int[] {10, 10, 11, 11}, "RLRL"),
                equalTo(List.of()));
    }

    @Test
    void survivedRobotsHealths4() {
        assertThat(
                new Solution().survivedRobotsHealths(new int[] {1, 40}, new int[] {10, 11}, "RL"),
                equalTo(List.of(10)));
    }
}
