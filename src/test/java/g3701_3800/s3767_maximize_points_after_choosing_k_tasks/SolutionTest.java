package g3701_3800.s3767_maximize_points_after_choosing_k_tasks;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxPoints() {
        assertThat(
                new Solution().maxPoints(new int[] {5, 1, 3}, new int[] {4, 10, 2}, 1),
                equalTo(18L));
    }

    @Test
    void maxPoints2() {
        assertThat(new Solution().maxPoints(new int[] {1, 2}, new int[] {3, 4}, 0), equalTo(7L));
    }

    @Test
    void maxPoints3() {
        assertThat(
                new Solution().maxPoints(new int[] {7, 2, 5}, new int[] {1, 8, 4}, 3),
                equalTo(14L));
    }

    @Test
    void maxPoints4() {
        assertThat(
                new Solution().maxPoints(new int[] {5, 4, 3}, new int[] {3, 4, 1}, 3),
                equalTo(12L));
    }

    @Test
    void maxPoints5() {
        assertThat(
                new Solution().maxPoints(new int[] {1, 2, 3}, new int[] {5, 5, 1}, 1),
                equalTo(13L));
    }

    @Test
    void maxPoints6() {
        assertThat(
                new Solution().maxPoints(new int[] {1, 1, 1, 1}, new int[] {3, 4, 2, 6}, 2),
                equalTo(12L));
    }

    @Test
    void maxPoints7() {
        assertThat(
                new Solution().maxPoints(new int[] {1, 1, 1, 1}, new int[] {6, 5, 4, 0}, 2),
                equalTo(13L));
    }

    @Test
    void maxPoints8() {
        assertThat(
                new Solution().maxPoints(new int[] {7, 8, 9}, new int[] {100, 100, 100}, 3),
                equalTo(24L));
    }
}
