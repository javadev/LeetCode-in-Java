package g0301_0400.s0384_shuffle_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void solutionTest() {
        Solution solution = new Solution(new int[] {1, 2, 3});
        int[] shuffled = solution.shuffle();
        Arrays.sort(shuffled);
        assertThat(shuffled, equalTo(new int[] {1, 2, 3}));
        assertThat(solution.reset(), equalTo(new int[] {1, 2, 3}));
    }

    @Test
    void solutionTest2() {
        Solution solution = new Solution(new int[] {5});
        int[] shuffled = solution.shuffle();
        assertThat(shuffled, equalTo(new int[] {5}));
        assertThat(solution.reset(), equalTo(new int[] {5}));
    }

    @Test
    void solutionTest3() {
        Solution solution = new Solution(new int[] {4, -1, 4, 0, -7});
        for (int i = 0; i < 100; i++) {
            int[] shuffled = solution.shuffle();
            Arrays.sort(shuffled);
            assertThat(shuffled, equalTo(new int[] {-7, -1, 0, 4, 4}));
        }
        assertThat(solution.reset(), equalTo(new int[] {4, -1, 4, 0, -7}));
    }
}
