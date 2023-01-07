package g2101_2200.s2161_partition_array_according_to_given_pivot;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void pivotArray() {
        assertThat(
                new Solution().pivotArray(new int[] {9, 12, 5, 10, 14, 3, 10}, 10),
                equalTo(new int[] {9, 5, 3, 10, 10, 12, 14}));
    }

    @Test
    void pivotArray2() {
        assertThat(
                new Solution().pivotArray(new int[] {-3, 4, 3, 2}, 2),
                equalTo(new int[] {-3, 2, 4, 3}));
    }
}
