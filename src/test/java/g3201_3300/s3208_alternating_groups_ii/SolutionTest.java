package g3201_3300.s3208_alternating_groups_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfAlternatingGroups() {
        assertThat(
                new Solution().numberOfAlternatingGroups(new int[] {0, 1, 0, 1, 0}, 3), equalTo(3));
    }

    @Test
    void numberOfAlternatingGroups2() {
        assertThat(
                new Solution().numberOfAlternatingGroups(new int[] {0, 1, 0, 0, 1, 0, 1}, 6),
                equalTo(2));
    }

    @Test
    void numberOfAlternatingGroups3() {
        assertThat(new Solution().numberOfAlternatingGroups(new int[] {1, 1, 0, 1}, 4), equalTo(0));
    }
}
