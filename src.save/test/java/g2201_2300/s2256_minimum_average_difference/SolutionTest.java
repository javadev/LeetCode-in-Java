package g2201_2300.s2256_minimum_average_difference;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumAverageDifference() {
        assertThat(
                new Solution().minimumAverageDifference(new int[] {2, 5, 3, 9, 5, 3}), equalTo(3));
    }

    @Test
    void minimumAverageDifference2() {
        assertThat(new Solution().minimumAverageDifference(new int[] {0}), equalTo(0));
    }

    @Test
    void minimumAverageDifference3() {
        assertThat(new Solution().minimumAverageDifference(new int[] {4, 2, 0}), equalTo(2));
    }
}
