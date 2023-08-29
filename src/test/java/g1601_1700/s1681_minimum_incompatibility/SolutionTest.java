package g1601_1700.s1681_minimum_incompatibility;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minimumIncompatibility() {
        assertThat(new Solution().minimumIncompatibility(new int[] {1, 2, 1, 4}, 2), equalTo(4));
    }

    @Test
    void minimumIncompatibility2() {
        assertThat(
                new Solution().minimumIncompatibility(new int[] {6, 3, 8, 1, 3, 1, 2, 2}, 4),
                equalTo(6));
    }

    @Test
    void minimumIncompatibility3() {
        assertThat(
                new Solution().minimumIncompatibility(new int[] {5, 3, 3, 6, 3, 3}, 3),
                equalTo(-1));
    }
}
