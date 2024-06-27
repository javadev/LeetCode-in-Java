package g3101_3200.s3190_find_minimum_operations_to_make_all_elements_divisible_by_three;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumOperations() {
        assertThat(new Solution().minimumOperations(new int[] {1, 2, 3, 4}), equalTo(3));
    }

    @Test
    void minimumOperations2() {
        assertThat(new Solution().minimumOperations(new int[] {3, 6, 9}), equalTo(0));
    }
}
