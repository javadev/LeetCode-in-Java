package s0033_search_in_rotated_sorted_array;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void searchInRotatedSortedArray() {
        Assert.assertEquals(4, new Solution().search(new int[] {4, 5, 6, 7, 0, 1, 2}, 0));
    }
}
