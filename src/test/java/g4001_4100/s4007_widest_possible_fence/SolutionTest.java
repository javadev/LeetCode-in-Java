package g4001_4100.s4007_widest_possible_fence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumWidth() {
        assertThat(
                new Solution().maximumWidth(new int[] {1, 3, 2, 5, 7, 5, 4, 2, 1}), equalTo(4));
    }

    @Test
    void maximumWidth2() {
        assertThat(new Solution().maximumWidth(new int[] {2, 3, 7}), equalTo(1));
    }
}
