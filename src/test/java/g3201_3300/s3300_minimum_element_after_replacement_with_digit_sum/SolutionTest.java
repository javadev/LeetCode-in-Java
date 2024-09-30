package g3201_3300.s3300_minimum_element_after_replacement_with_digit_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minElement() {
        assertThat(new Solution().minElement(new int[] {10, 12, 13, 14}), equalTo(1));
    }

    @Test
    void minElement2() {
        assertThat(new Solution().minElement(new int[] {1, 2, 3, 4}), equalTo(1));
    }

    @Test
    void minElement3() {
        assertThat(new Solution().minElement(new int[] {999, 19, 199}), equalTo(10));
    }
}
