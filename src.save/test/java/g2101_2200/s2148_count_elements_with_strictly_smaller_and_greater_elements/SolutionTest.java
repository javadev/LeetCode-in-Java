package g2101_2200.s2148_count_elements_with_strictly_smaller_and_greater_elements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countElements() {
        assertThat(new Solution().countElements(new int[] {11, 7, 2, 15}), equalTo(2));
    }

    @Test
    void countElements2() {
        assertThat(new Solution().countElements(new int[] {-3, 3, 3, 90}), equalTo(2));
    }

    @Test
    void countElements3() {
        assertThat(new Solution().countElements(new int[] {-71, -71, 93, -71, 40}), equalTo(1));
    }
}
