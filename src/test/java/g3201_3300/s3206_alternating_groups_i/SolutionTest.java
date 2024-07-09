package g3201_3300.s3206_alternating_groups_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfAlternatingGroups() {
        assertThat(new Solution().numberOfAlternatingGroups(new int[] {1, 1, 1}), equalTo(0));
    }

    @Test
    void numberOfAlternatingGroups2() {
        assertThat(new Solution().numberOfAlternatingGroups(new int[] {0, 1, 0, 0, 1}), equalTo(3));
    }
}
