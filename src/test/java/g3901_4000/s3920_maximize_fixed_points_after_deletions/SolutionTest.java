package g3901_4000.s3920_maximize_fixed_points_after_deletions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxFixedPoints() {
        assertThat(new Solution().maxFixedPoints(new int[] {0, 2, 1}), equalTo(2));
    }

    @Test
    void maxFixedPoints2() {
        assertThat(new Solution().maxFixedPoints(new int[] {3, 1, 2}), equalTo(2));
    }

    @Test
    void maxFixedPoints3() {
        assertThat(new Solution().maxFixedPoints(new int[] {1, 0, 1, 2}), equalTo(3));
    }

    @Test
    void maxFixedPoints4() {
        assertThat(new Solution().maxFixedPoints(new int[] {}), equalTo(0));
    }

    @Test
    void maxFixedPoints5() {
        assertThat(new Solution().maxFixedPoints(new int[] {1}), equalTo(0));
    }

    @Test
    void maxFixedPoints6() {
        assertThat(new Solution().maxFixedPoints(new int[] {0}), equalTo(1));
    }

    @Test
    void maxFixedPoints7() {
        assertThat(new Solution().maxFixedPoints(new int[] {5, 5, 5}), equalTo(0));
    }

    @Test
    void maxFixedPoints8() {
        assertThat(new Solution().maxFixedPoints(new int[] {0, 0, 0, 0}), equalTo(1));
    }

    @Test
    void maxFixedPoints9() {
        assertThat(new Solution().maxFixedPoints(new int[] {0, 1, 2, 3, 4}), equalTo(5));
    }

    @Test
    void maxFixedPoints10() {
        assertThat(new Solution().maxFixedPoints(new int[] {0, 0, 1, 2, 3}), equalTo(4));
    }

    @Test
    void maxFixedPoints11() {
        assertThat(new Solution().maxFixedPoints(new int[] {0, 2, 2, 3}), equalTo(3));
    }

    @Test
    void maxFixedPoints12() {
        assertThat(new Solution().maxFixedPoints(new int[] {0, 3, 1, 2}), equalTo(3));
    }

    @Test
    void maxFixedPoints13() {
        assertThat(new Solution().maxFixedPoints(new int[] {0, 3, 2, 1}), equalTo(2));
    }

    @Test
    void maxFixedPoints14() {
        assertThat(new Solution().maxFixedPoints(new int[] {0, 1, 0, 1, 2}), equalTo(3));
    }

    @Test
    void maxFixedPoints15() {
        assertThat(new Solution().maxFixedPoints(new int[] {0, 2, 1, 0, 3}), equalTo(3));
    }

    @Test
    void maxFixedPoints16() {
        assertThat(new Solution().maxFixedPoints(new int[] {0, 4, 1, 2, 3}), equalTo(4));
    }

    @Test
    void maxFixedPoints17() {
        assertThat(new Solution().maxFixedPoints(new int[] {0, 5, 4, 3, 2, 1}), equalTo(2));
    }

    @Test
    void maxFixedPoints18() {
        assertThat(new Solution().maxFixedPoints(new int[] {0, 2, 3, 1, 4}), equalTo(2));
    }

    @Test
    void maxFixedPoints19() {
        assertThat(new Solution().maxFixedPoints(new int[] {0, 1, 3, 2, 4}), equalTo(3));
    }

    @Test
    void maxFixedPoints20() {
        assertThat(new Solution().maxFixedPoints(new int[] {0, 2, 1, 4, 3, 5}), equalTo(3));
    }
}
