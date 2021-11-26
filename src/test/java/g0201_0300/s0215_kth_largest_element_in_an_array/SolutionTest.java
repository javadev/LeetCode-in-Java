package g0201_0300.s0215_kth_largest_element_in_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void findKthLargest() {
        assertThat(new Solution().findKthLargest(new int[] {3, 2, 1, 5, 6, 4}, 2), equalTo(5));
    }
}
