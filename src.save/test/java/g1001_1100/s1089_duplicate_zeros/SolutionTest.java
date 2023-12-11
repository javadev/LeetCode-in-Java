package g1001_1100.s1089_duplicate_zeros;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void duplicateZeros() {
        int[] input = {1, 0, 2, 3, 0, 4, 5, 0};
        new Solution().duplicateZeros(input);
        assertThat(input, equalTo(new int[] {1, 0, 0, 2, 3, 0, 0, 4}));
    }

    @Test
    void duplicateZeros2() {
        int[] input = {1, 2, 3};
        new Solution().duplicateZeros(input);
        assertThat(input, equalTo(new int[] {1, 2, 3}));
    }
}
