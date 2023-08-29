package g0301_0400.s0321_create_maximum_number;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxNumber() {
        assertThat(
                new Solution().maxNumber(new int[] {3, 4, 6, 5}, new int[] {9, 1, 2, 5, 8, 3}, 5),
                equalTo(new int[] {9, 8, 6, 5, 3}));
    }

    @Test
    void maxNumber2() {
        assertThat(
                new Solution().maxNumber(new int[] {6, 7}, new int[] {6, 0, 4}, 5),
                equalTo(new int[] {6, 7, 6, 0, 4}));
    }

    @Test
    void maxNumber3() {
        assertThat(
                new Solution().maxNumber(new int[] {3, 9}, new int[] {8, 9}, 3),
                equalTo(new int[] {9, 8, 9}));
    }
}
