package g0501_0600.s0576_out_of_boundary_paths;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findPaths() {
        assertThat(new Solution().findPaths(2, 2, 2, 0, 0), equalTo(6));
    }

    @Test
    void findPaths2() {
        assertThat(new Solution().findPaths(1, 3, 3, 0, 1), equalTo(12));
    }
}
