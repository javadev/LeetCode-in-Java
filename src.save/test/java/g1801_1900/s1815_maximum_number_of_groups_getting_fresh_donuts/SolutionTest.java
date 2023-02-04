package g1801_1900.s1815_maximum_number_of_groups_getting_fresh_donuts;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxHappyGroups() {
        assertThat(new Solution().maxHappyGroups(3, new int[] {1, 2, 3, 4, 5, 6}), equalTo(4));
    }

    @Test
    void maxHappyGroups2() {
        assertThat(
                new Solution().maxHappyGroups(4, new int[] {1, 3, 2, 5, 2, 2, 1, 6}), equalTo(4));
    }
}
