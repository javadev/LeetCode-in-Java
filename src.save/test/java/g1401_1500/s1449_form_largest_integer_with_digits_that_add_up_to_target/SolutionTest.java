package g1401_1500.s1449_form_largest_integer_with_digits_that_add_up_to_target;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void largestNumber() {
        assertThat(
                new Solution().largestNumber(new int[] {4, 3, 2, 5, 6, 7, 2, 5, 5}, 9),
                equalTo("7772"));
    }

    @Test
    void largestNumber2() {
        assertThat(
                new Solution().largestNumber(new int[] {7, 6, 5, 5, 5, 6, 8, 7, 8}, 12),
                equalTo("85"));
    }

    @Test
    void largestNumber3() {
        assertThat(
                new Solution().largestNumber(new int[] {2, 4, 6, 2, 4, 6, 4, 4, 4}, 5),
                equalTo("0"));
    }
}
