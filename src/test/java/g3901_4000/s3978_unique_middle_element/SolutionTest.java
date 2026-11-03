package g3901_4000.s3978_unique_middle_element;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isMiddleElementUnique() {
        assertThat(new Solution().isMiddleElementUnique(new int[] {1, 2, 3}), equalTo(true));
    }

    @Test
    void isMiddleElementUnique2() {
        assertThat(new Solution().isMiddleElementUnique(new int[] {1, 2, 2}), equalTo(false));
    }

    @Test
    void isMiddleElementUnique3() {
        assertThat(new Solution().isMiddleElementUnique(new int[] {7}), equalTo(true));
    }
}
