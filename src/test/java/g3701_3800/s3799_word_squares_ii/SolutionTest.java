package g3701_3800.s3799_word_squares_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void wordSquares() {
        List<List<String>> result =
                new Solution().wordSquares(new String[] {"able", "area", "echo", "also"});
        assertThat(
                result,
                equalTo(
                        Arrays.asList(
                                Arrays.asList("able", "area", "echo", "also"),
                                Arrays.asList("area", "able", "also", "echo"))));
    }

    @Test
    void wordSquares2() {
        assertThat(
                new Solution().wordSquares(new String[] {"code", "cafe", "eden", "edge"}),
                equalTo(Arrays.asList()));
    }
}
