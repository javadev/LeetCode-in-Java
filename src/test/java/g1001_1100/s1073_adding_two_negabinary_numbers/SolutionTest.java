package g1001_1100.s1073_adding_two_negabinary_numbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void addNegabinary() {
        assertThat(
                new Solution().addNegabinary(new int[] {1, 1, 1, 1, 1}, new int[] {1, 0, 1}),
                equalTo(new int[] {1, 0, 0, 0, 0}));
    }

    @Test
    void addNegabinary2() {
        assertThat(
                new Solution().addNegabinary(new int[] {0}, new int[] {0}), equalTo(new int[] {0}));
    }

    @Test
    void addNegabinary3() {
        assertThat(
                new Solution().addNegabinary(new int[] {0}, new int[] {1}), equalTo(new int[] {1}));
    }
}
