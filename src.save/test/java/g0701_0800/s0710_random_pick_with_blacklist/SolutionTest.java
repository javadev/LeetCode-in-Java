package g0701_0800.s0710_random_pick_with_blacklist;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void solutionTest() {
        int[] expected = new int[] {0, 1, 4, 6};
        Solution solution = new Solution(7, new int[] {2, 3, 5});
        for (int i = 0; i < 7; i++) {
            assertThat(checkContain(expected, solution.pick()), equalTo(true));
        }
    }

    private boolean checkContain(int[] array, int value) {
        for (int j : array) {
            if (j == value) {
                return true;
            }
        }
        return false;
    }
}
