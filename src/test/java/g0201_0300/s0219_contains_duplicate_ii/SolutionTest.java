package g0201_0300.s0219_contains_duplicate_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void containsNearbyDuplicate() {
        assertThat(
                new Solution().containsNearbyDuplicate(new int[] {1, 2, 3, 1}, 3), equalTo(true));
    }

    @Test
    void containsNearbyDuplicate2() {
        assertThat(
                new Solution().containsNearbyDuplicate(new int[] {1, 0, 1, 1}, 1), equalTo(true));
    }

    @Test
    void containsNearbyDuplicate3() {
        assertThat(
                new Solution().containsNearbyDuplicate(new int[] {1, 2, 3, 1, 2, 3}, 2),
                equalTo(false));
    }
}
