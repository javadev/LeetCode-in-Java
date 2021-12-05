package g0001_0100.s0057_insert_interval_medium_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void insert() {
        int[][] expected = {{1, 5}, {6, 9}};
        int[][] actual = new Solution().insert(new int[][] {{1, 3}, {6, 9}}, new int[] {2, 5});
        assertThat(actual, equalTo(expected));
    }
}
