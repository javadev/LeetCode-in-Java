package s0078_subsets;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void subsets() {
        int[][] expected = {{}, {1}, {1, 2}, {1, 2, 3}, {1, 3}, {2}, {2, 3}, {3}};
        List<List<Integer>> expectedList = new ArrayList<>();
        for (int[] value : expected) {
            List<Integer> expectedItem = new ArrayList<>();
            expectedList.add(expectedItem);
            for (int item : value) {
                expectedItem.add(item);
            }
        }
        assertThat(new Solution().subsets(new int[] {1, 2, 3}), equalTo(expectedList));
    }
}
