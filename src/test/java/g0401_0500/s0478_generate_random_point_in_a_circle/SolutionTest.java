package g0401_0500.s0478_generate_random_point_in_a_circle;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void randPoint() {
        Solution solution = new Solution(1.0, 0.0, 0.0);
        solution.randPoint();
        solution.randPoint();
        solution.randPoint();
        assertThat(solution, equalTo(solution));
    }
}
