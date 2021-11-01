package s0033_search_in_rotated_sorted_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void search() {
        assertThat(new Solution().search(new int[] {4, 5, 6, 7, 0, 1, 2}, 0), equalTo(4));
    }
}
