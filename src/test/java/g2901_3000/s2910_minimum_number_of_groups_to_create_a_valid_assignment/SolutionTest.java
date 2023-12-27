package g2901_3000.s2910_minimum_number_of_groups_to_create_a_valid_assignment;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minGroupsForValidAssignment() {
        assertThat(
                new Solution().minGroupsForValidAssignment(new int[] {3, 2, 3, 2, 3}), equalTo(2));
    }

    @Test
    void minGroupsForValidAssignment2() {
        assertThat(
                new Solution().minGroupsForValidAssignment(new int[] {10, 10, 10, 3, 1, 1}),
                equalTo(4));
    }
}
