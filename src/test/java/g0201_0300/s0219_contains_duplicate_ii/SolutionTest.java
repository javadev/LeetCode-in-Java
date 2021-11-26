package g0201_0300.s0219_contains_duplicate_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void containsNearbyDuplicate() {
        assertThat(
                new Solution().containsNearbyDuplicate(new int[] {1, 2, 3, 1}, 3), equalTo(true));
    }
}
