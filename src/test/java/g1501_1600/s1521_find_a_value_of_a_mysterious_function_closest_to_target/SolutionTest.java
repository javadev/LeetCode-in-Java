package g1501_1600.s1521_find_a_value_of_a_mysterious_function_closest_to_target;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void closestToTarget() {
        assertThat(new Solution().closestToTarget(new int[] {9, 12, 3, 7, 15}, 5), equalTo(2));
    }

    @Test
    void closestToTarget2() {
        assertThat(
                new Solution().closestToTarget(new int[] {1000000, 1000000, 1000000}, 1),
                equalTo(999999));
    }

    @Test
    void closestToTarget3() {
        assertThat(new Solution().closestToTarget(new int[] {1, 2, 4, 8, 16}, 0), equalTo(0));
    }
}
