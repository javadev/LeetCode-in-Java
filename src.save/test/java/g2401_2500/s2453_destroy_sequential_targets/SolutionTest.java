package g2401_2500.s2453_destroy_sequential_targets;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void destroyTargets() {
        assertThat(new Solution().destroyTargets(new int[] {3, 7, 8, 1, 1, 5}, 2), equalTo(1));
    }

    @Test
    void destroyTargets2() {
        assertThat(new Solution().destroyTargets(new int[] {1, 3, 5, 2, 4, 6}, 2), equalTo(1));
    }

    @Test
    void destroyTargets3() {
        assertThat(new Solution().destroyTargets(new int[] {6, 2, 5}, 100), equalTo(2));
    }
}
