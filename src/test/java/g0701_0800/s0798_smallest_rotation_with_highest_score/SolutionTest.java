package g0701_0800.s0798_smallest_rotation_with_highest_score;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void bestRotation() {
        assertThat(new Solution().bestRotation(new int[] {2, 3, 1, 4, 0}), equalTo(3));
    }

    @Test
    void bestRotation2() {
        assertThat(new Solution().bestRotation(new int[] {1, 3, 0, 2, 4}), equalTo(0));
    }
}
