package g3801_3900.s3875_construct_uniform_parity_array_i;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void constructsAUniformParityArrayWhenPossible() {
        Solution solution = new Solution();

        assertThat(solution.uniformArray(new int[] {2, 3}), equalTo(true));
        assertThat(solution.uniformArray(new int[] {4, 6}), equalTo(true));
        assertThat(solution.uniformArray(new int[] {7}), equalTo(true));
    }
}
