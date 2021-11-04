package s0060_permutation_sequence;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void getPermutation() {
        assertThat(new Solution().getPermutation(3, 3), equalTo("213"));
    }
}
