package s0079_submissions;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void exist() {
        assertThat(
                new Solution()
                        .exist(
                                new char[][] {
                                    {'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}
                                },
                                "ABCCED"),
                equalTo(true));
    }
}
