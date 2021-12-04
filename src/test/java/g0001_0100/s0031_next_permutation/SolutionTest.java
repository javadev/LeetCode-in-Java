package g0001_0100.s0031_next_permutation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void nextPermutation() {
        int[] array = new int[] {1, 2, 3};
        new Solution().nextPermutation(array);
        assertThat(array, equalTo(new int[] {1, 3, 2}));
    }
}
