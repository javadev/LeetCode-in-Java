package g3101_3200.s3152_special_array_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void isArraySpecial() {
        assertThat(
                new Solution().isArraySpecial(new int[] {3, 4, 1, 2, 6}, new int[][] {{0, 4}}),
                equalTo(new boolean[] {false}));
    }

    @Test
    void isArraySpecial2() {
        assertThat(
                new Solution().isArraySpecial(new int[] {4, 3, 1, 6}, new int[][] {{0, 2}, {2, 3}}),
                equalTo(new boolean[] {false, true}));
    }
}
