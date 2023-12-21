package g2701_2800.s2789_largest_element_in_an_array_after_merge_operations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxArrayValue() {
        int[] input1 = {2, 3, 7, 9, 3};
        long expected1 = 21L;
        assertThat(new Solution().maxArrayValue(input1), equalTo(expected1));
    }

    @Test
    void maxArrayValue2() {
        int[] input2 = {5, 3, 3};
        long expected2 = 11L;
        assertThat(new Solution().maxArrayValue(input2), equalTo(expected2));
    }
}
