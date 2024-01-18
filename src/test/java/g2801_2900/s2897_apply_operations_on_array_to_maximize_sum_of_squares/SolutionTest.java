package g2801_2900.s2897_apply_operations_on_array_to_maximize_sum_of_squares;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxSum() {
        assertThat(new Solution().maxSum(Arrays.asList(2, 6, 5, 8), 2), equalTo(261));
    }

    @Test
    void maxSum2() {
        assertThat(new Solution().maxSum(Arrays.asList(4, 5, 4, 7), 3), equalTo(90));
    }
}
