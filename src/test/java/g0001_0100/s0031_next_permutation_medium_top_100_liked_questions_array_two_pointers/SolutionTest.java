package g0001_0100.s0031_next_permutation_medium_top_100_liked_questions_array_two_pointers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void nextPermutation() {
        int[] array = new int[] {1, 2, 3};
        new Solution().nextPermutation(array);
        assertThat(array, equalTo(new int[] {1, 3, 2}));
    }
}
