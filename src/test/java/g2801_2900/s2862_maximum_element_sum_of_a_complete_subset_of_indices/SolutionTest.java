package g2801_2900.s2862_maximum_element_sum_of_a_complete_subset_of_indices;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumSum() {
        assertThat(new Solution().maximumSum(Arrays.asList(8, 7, 3, 5, 7, 2, 4, 9)), equalTo(16L));
    }

    @Test
    void maximumSum2() {
        assertThat(
                new Solution().maximumSum(Arrays.asList(5, 10, 3, 10, 1, 13, 7, 9, 4)),
                equalTo(19L));
    }
}
