package g3401_3500.s3435_frequencies_of_shortest_supersequences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void supersequences() {
        assertThat(
                new Solution().supersequences(new String[] {"ab", "ba"}),
                equalTo(
                        List.of(
                                List.of(
                                        2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                                        0, 0, 0, 0, 0, 0),
                                List.of(
                                        1, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                                        0, 0, 0, 0, 0, 0))));
    }

    @Test
    void supersequences2() {
        assertThat(
                new Solution().supersequences(new String[] {"aa", "ac"}),
                equalTo(
                        List.of(
                                List.of(
                                        2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                                        0, 0, 0, 0, 0, 0))));
    }

    @Test
    void supersequences3() {
        assertThat(
                new Solution().supersequences(new String[] {"aa", "bb", "cc"}),
                equalTo(
                        List.of(
                                List.of(
                                        2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                                        0, 0, 0, 0, 0, 0))));
    }
}
