package g3201_3300.s3289_the_two_sneaky_numbers_of_digitville;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getSneakyNumbers() {
        assertThat(
                new Solution().getSneakyNumbers(new int[] {0, 1, 1, 0}), equalTo(new int[] {0, 1}));
    }

    @Test
    void getSneakyNumbers2() {
        assertThat(
                new Solution().getSneakyNumbers(new int[] {0, 3, 2, 1, 3, 2}),
                equalTo(new int[] {2, 3}));
    }

    @Test
    void getSneakyNumbers3() {
        assertThat(
                new Solution().getSneakyNumbers(new int[] {7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2}),
                equalTo(new int[] {4, 5}));
    }
}
