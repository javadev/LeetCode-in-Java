package g1401_1500.s1499_max_value_of_equation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findMaxValueOfEquation() {
        assertThat(
                new Solution()
                        .findMaxValueOfEquation(new int[][] {{1, 3}, {2, 0}, {5, 10}, {6, -10}}, 1),
                equalTo(4));
    }

    @Test
    void findMaxValueOfEquation2() {
        assertThat(
                new Solution().findMaxValueOfEquation(new int[][] {{0, 0}, {3, 0}, {9, 2}}, 3),
                equalTo(3));
    }
}
