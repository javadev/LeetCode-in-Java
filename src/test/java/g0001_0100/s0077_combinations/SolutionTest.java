package g0001_0100.s0077_combinations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void combine() {
        int[][] expected = {{1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4}, {3, 4}};
        List<List<Integer>> expectedList = new ArrayList<>();
        for (int[] value : expected) {
            List<Integer> expectedItem = new ArrayList<>();
            expectedList.add(expectedItem);
            for (int item : value) {
                expectedItem.add(item);
            }
        }
        assertThat(new Solution().combine(4, 2), equalTo(expectedList));
    }
}
