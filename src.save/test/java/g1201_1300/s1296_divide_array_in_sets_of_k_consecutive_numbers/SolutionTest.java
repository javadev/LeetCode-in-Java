package g1201_1300.s1296_divide_array_in_sets_of_k_consecutive_numbers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isPossibleDivide() {
        assertThat(
                new Solution().isPossibleDivide(new int[] {1, 2, 3, 3, 4, 4, 5, 6}, 4),
                equalTo(true));
    }

    @Test
    void isPossibleDivide2() {
        assertThat(
                new Solution()
                        .isPossibleDivide(new int[] {3, 2, 1, 2, 3, 4, 3, 4, 5, 9, 10, 11}, 3),
                equalTo(true));
    }

    @Test
    void isPossibleDivide3() {
        assertThat(new Solution().isPossibleDivide(new int[] {1, 2, 3, 4}, 3), equalTo(false));
    }
}
