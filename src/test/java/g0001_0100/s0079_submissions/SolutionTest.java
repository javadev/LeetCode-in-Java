package g0001_0100.s0079_submissions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void exist() {
        char[][] input = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        assertThat(new Solution().exist(input, "ABCCED"), equalTo(true));
    }
}
