package g2601_2700.s2602_minimum_operations_to_make_all_array_elements_equal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(
                new Solution().minOperations(new int[] {3, 1, 6, 8}, new int[] {1, 5}),
                equalTo(Arrays.asList(14L, 10L)));
    }

    @Test
    void minOperations2() {
        assertThat(
                new Solution().minOperations(new int[] {2, 9, 6, 3}, new int[] {10}),
                equalTo(List.of(20L)));
    }
}
