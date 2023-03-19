package g1901_2000.s1929_concatenation_of_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getConcatenation() {
        assertThat(
                new Solution().getConcatenation(new int[] {1, 2, 1}),
                equalTo(new int[] {1, 2, 1, 1, 2, 1}));
    }

    @Test
    void getConcatenation2() {
        assertThat(
                new Solution().getConcatenation(new int[] {1, 3, 2, 1}),
                equalTo(new int[] {1, 3, 2, 1, 1, 3, 2, 1}));
    }
}
