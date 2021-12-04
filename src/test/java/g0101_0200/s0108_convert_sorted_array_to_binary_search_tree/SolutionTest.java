package g0101_0200.s0108_convert_sorted_array_to_binary_search_tree;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    public void sortedArrayToBST() {
        assertThat(
                new Solution().sortedArrayToBST(new int[] {-10, -3, 0, 5, 9}).toString(),
                equalTo("0,-10,null,-3,5,null,9"));
    }
}
