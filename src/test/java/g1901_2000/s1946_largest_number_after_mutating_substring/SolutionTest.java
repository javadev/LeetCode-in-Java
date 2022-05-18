package g1901_2000.s1946_largest_number_after_mutating_substring;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maximumNumber() {
        assertThat(
                new Solution().maximumNumber("132", new int[] {9, 8, 5, 0, 3, 6, 4, 2, 6, 8}),
                equalTo("832"));
    }

    @Test
    void maximumNumber2() {
        assertThat(
                new Solution().maximumNumber("021", new int[] {9, 4, 3, 5, 7, 2, 1, 9, 0, 6}),
                equalTo("934"));
    }

    @Test
    void maximumNumber3() {
        assertThat(
                new Solution().maximumNumber("5", new int[] {1, 4, 7, 5, 3, 2, 5, 6, 9, 4}),
                equalTo("5"));
    }
}
