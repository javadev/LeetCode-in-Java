package g2401_2500.s2440_create_components_with_same_value;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void componentValue() {
        assertThat(
                new Solution()
                        .componentValue(
                                new int[] {6, 2, 2, 2, 6},
                                new int[][] {{0, 1}, {1, 2}, {1, 3}, {3, 4}}),
                equalTo(2));
    }

    @Test
    void componentValue2() {
        assertThat(new Solution().componentValue(new int[] {2}, new int[][] {}), equalTo(0));
    }
}
