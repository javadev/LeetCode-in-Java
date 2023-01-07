package g2201_2300.s2202_maximize_the_topmost_element_after_k_moves;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumTop() {
        assertThat(new Solution().maximumTop(new int[] {5, 2, 2, 4, 0, 6}, 4), equalTo(5));
    }

    @Test
    void maximumTop2() {
        assertThat(new Solution().maximumTop(new int[] {2}, 1), equalTo(-1));
    }

    @Test
    void maximumTop3() {
        assertThat(new Solution().maximumTop(new int[] {3}, 0), equalTo(3));
    }
}
