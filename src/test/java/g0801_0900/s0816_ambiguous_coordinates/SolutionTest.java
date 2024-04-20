package g0801_0900.s0816_ambiguous_coordinates;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void ambiguousCoordinates() {
        assertThat(
                new Solution().ambiguousCoordinates("(123)"),
                equalTo(Arrays.asList("(1, 23)", "(1, 2.3)", "(12, 3)", "(1.2, 3)")));
    }

    @Test
    void ambiguousCoordinates2() {
        assertThat(
                new Solution().ambiguousCoordinates("(0123)"),
                equalTo(
                        Arrays.asList(
                                "(0, 123)",
                                "(0, 1.23)",
                                "(0, 12.3)",
                                "(0.1, 23)",
                                "(0.1, 2.3)",
                                "(0.12, 3)")));
    }

    @Test
    void ambiguousCoordinates3() {
        assertThat(
                new Solution().ambiguousCoordinates("(00011)"),
                equalTo(Arrays.asList("(0, 0.011)", "(0.001, 1)")));
    }
}
