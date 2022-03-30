package g0201_0300.s0220_contains_duplicate_iii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void containsNearbyAlmostDuplicate() {
        assertThat(
                new Solution().containsNearbyAlmostDuplicate(new int[] {1, 2, 3, 1}, 3, 0),
                equalTo(true));
    }

    @Test
    void containsNearbyAlmostDuplicate2() {
        assertThat(
                new Solution().containsNearbyAlmostDuplicate(new int[] {1, 0, 1, 1}, 1, 2),
                equalTo(true));
    }

    @Test
    void containsNearbyAlmostDuplicate3() {
        assertThat(
                new Solution().containsNearbyAlmostDuplicate(new int[] {1, 5, 9, 1, 5, 9}, 2, 3),
                equalTo(false));
    }
}
