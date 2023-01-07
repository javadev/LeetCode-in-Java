package g0101_0200.s0162_find_peak_element;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findPeakElement() {
        assertThat(new Solution().findPeakElement(new int[] {1, 2, 3, 1}), equalTo(2));
    }

    @Test
    void findPeakElement2() {
        assertThat(new Solution().findPeakElement(new int[] {1, 2, 1, 3, 5, 6, 4}), equalTo(5));
    }
}
