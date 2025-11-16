package g2501_2600.s2540_minimum_common_value;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getCommon() {
        assertThat(new Solution().getCommon(new int[] {1, 2, 3}, new int[] {2, 4}), equalTo(2));
    }

    @Test
    void getCommon2() {
        assertThat(
                new Solution().getCommon(new int[] {1, 2, 3, 6}, new int[] {2, 3, 4, 5}),
                equalTo(2));
    }

    @Test
    void getCommon3() {
        assertThat(new Solution().getCommon(new int[] {1, 2, 3}, new int[] {4, 5, 6}), equalTo(-1));
    }

    @Test
    void getCommon4() {
        assertThat(
                new Solution().getCommon(new int[] {1, 3, 5, 7}, new int[] {0, 2, 4, 7}),
                equalTo(7));
    }

    @Test
    void getCommon5() {
        assertThat(new Solution().getCommon(new int[] {2, 3, 4}, new int[] {2, 5, 6}), equalTo(2));
    }

    @Test
    void getCommon6() {
        assertThat(new Solution().getCommon(new int[] {5}, new int[] {5}), equalTo(5));
    }

    @Test
    void getCommon7() {
        assertThat(new Solution().getCommon(new int[] {5}, new int[] {6}), equalTo(-1));
    }

    @Test
    void getCommon8() {
        assertThat(
                new Solution().getCommon(new int[] {1, 2, 3, 4}, new int[] {2, 3, 4}), equalTo(2));
    }

    @Test
    void getCommon9() {
        assertThat(new Solution().getCommon(new int[] {1, 2}, new int[] {100, 200}), equalTo(-1));
    }

    @Test
    void getCommon10() {
        assertThat(new Solution().getCommon(new int[] {50, 60}, new int[] {1, 2, 3}), equalTo(-1));
    }

    @Test
    void getCommon11() {
        assertThat(new Solution().getCommon(new int[] {1, 2, 5}, new int[] {3, 4, 6}), equalTo(-1));
    }
}
