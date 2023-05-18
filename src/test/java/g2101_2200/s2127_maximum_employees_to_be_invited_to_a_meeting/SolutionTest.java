package g2101_2200.s2127_maximum_employees_to_be_invited_to_a_meeting;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumInvitations() {
        assertThat(new Solution().maximumInvitations(new int[] {2, 2, 1, 2}), equalTo(3));
    }

    @Test
    void maximumInvitations2() {
        assertThat(new Solution().maximumInvitations(new int[] {1, 2, 0}), equalTo(3));
    }

    @Test
    void maximumInvitations3() {
        assertThat(new Solution().maximumInvitations(new int[] {3, 0, 1, 4, 1}), equalTo(4));
    }
}
