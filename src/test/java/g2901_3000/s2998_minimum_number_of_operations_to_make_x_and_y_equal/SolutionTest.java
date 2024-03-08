package g2901_3000.s2998_minimum_number_of_operations_to_make_x_and_y_equal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumOperationsToMakeEqual() {
        assertThat(new Solution().minimumOperationsToMakeEqual(26, 1), equalTo(3));
    }

    @Test
    void minimumOperationsToMakeEqual2() {
        assertThat(new Solution().minimumOperationsToMakeEqual(54, 2), equalTo(4));
    }
}
