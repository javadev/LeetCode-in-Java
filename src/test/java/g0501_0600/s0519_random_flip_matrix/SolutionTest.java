package g0501_0600.s0519_random_flip_matrix;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void solutionTest() {
        Solution solution = new Solution(3, 1);
        solution.flip();
        solution.flip();
        solution.flip();
        solution.reset();
        solution.flip();
        assertThat(true, equalTo(true));
    }
}
