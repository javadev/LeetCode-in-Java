package g1701_1800.s1769_minimum_number_of_operations_to_move_all_balls_to_each_box;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minOperations() {
        assertThat(new Solution().minOperations("110"), equalTo(new int[] {1, 1, 3}));
    }

    @Test
    void minOperations2() {
        assertThat(new Solution().minOperations("001011"), equalTo(new int[] {11, 8, 5, 4, 3, 4}));
    }
}
