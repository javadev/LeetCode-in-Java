package s0034_find_first_and_last_position_of_element_in_sorted_array;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void findFirstAndLastPosOfElementInSortedArray() {
        int[] expected = new int[] {3, 4};
        int[] actual = new Solution().searchRange(new int[] {5, 7, 7, 8, 8, 10}, 8);
        Assert.assertArrayEquals(expected, actual);
    }
}
