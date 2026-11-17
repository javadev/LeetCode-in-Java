package g3901_4000.s3996_even_number_of_knight_moves;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void canReach() {
        assertThat(new Solution().canReach(new int[] {1, 1}, new int[] {2, 2}), equalTo(true));
    }

    @Test
    void canReach2() {
        assertThat(new Solution().canReach(new int[] {4, 5}, new int[] {6, 6}), equalTo(false));
    }
}
