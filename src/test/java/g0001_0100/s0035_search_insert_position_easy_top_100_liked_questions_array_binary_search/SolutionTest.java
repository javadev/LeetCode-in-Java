package g0001_0100.s0035_search_insert_position;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void searchInsert() {
        assertThat(new Solution().searchInsert(new int[] {1, 3, 5, 6}, 5), equalTo(2));
    }
}
