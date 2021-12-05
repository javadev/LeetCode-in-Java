package g0201_0300.s0275_h_index_ii_medium_array_binary_search;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void hindex() {
        assertThat(new Solution().hindex(new int[] {0, 1, 3, 5, 6}), equalTo(3));
    }
}
