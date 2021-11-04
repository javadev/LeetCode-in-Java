package s0062_unique_paths;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void uniquePaths() {
        assertThat(new Solution().uniquePaths(3, 7), equalTo(28));
    }
}
