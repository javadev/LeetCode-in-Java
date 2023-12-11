package g1801_1900.s1846_maximum_element_after_decreasing_and_rearranging;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumElementAfterDecrementingAndRearranging() {
        assertThat(
                new Solution()
                        .maximumElementAfterDecrementingAndRearranging(new int[] {2, 2, 1, 2, 1}),
                equalTo(2));
    }

    @Test
    void maximumElementAfterDecrementingAndRearranging2() {
        assertThat(
                new Solution()
                        .maximumElementAfterDecrementingAndRearranging(new int[] {100, 1, 1000}),
                equalTo(3));
    }

    @Test
    void maximumElementAfterDecrementingAndRearranging3() {
        assertThat(
                new Solution()
                        .maximumElementAfterDecrementingAndRearranging(new int[] {1, 2, 3, 4, 5}),
                equalTo(5));
    }
}
