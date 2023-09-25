package g2001_2100.s2071_maximum_number_of_tasks_you_can_assign;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxTaskAssign() {
        assertThat(
                new Solution().maxTaskAssign(new int[] {3, 2, 1}, new int[] {0, 3, 3}, 1, 1),
                equalTo(3));
    }

    @Test
    void maxTaskAssign2() {
        assertThat(
                new Solution().maxTaskAssign(new int[] {5, 4}, new int[] {0, 0, 0}, 1, 5),
                equalTo(1));
    }

    @Test
    void maxTaskAssign3() {
        assertThat(
                new Solution()
                        .maxTaskAssign(
                                new int[] {10, 15, 30}, new int[] {0, 10, 10, 10, 10}, 3, 10),
                equalTo(2));
    }
}
