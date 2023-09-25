package g2301_2400.s2358_maximum_number_of_groups_entering_a_competition;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumGroups() {
        assertThat(new Solution().maximumGroups(new int[] {10, 6, 12, 7, 3, 5}), equalTo(3));
    }

    @Test
    void maximumGroups2() {
        assertThat(new Solution().maximumGroups(new int[] {8, 8}), equalTo(1));
    }
}
