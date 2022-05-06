package g0001_0100.s0079_word_search;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void exist() {
        char[][] input = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        assertThat(new Solution().exist(input, "ABCCED"), equalTo(true));
    }

    @Test
    void exist2() {
        char[][] input = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        assertThat(new Solution().exist(input, "SEE"), equalTo(true));
    }

    @Test
    void exist3() {
        char[][] input = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        assertThat(new Solution().exist(input, "ABCB"), equalTo(false));
    }
}
