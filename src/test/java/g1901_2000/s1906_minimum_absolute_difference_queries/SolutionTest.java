package g1901_2000.s1906_minimum_absolute_difference_queries;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testSingleElementInput() {
        int[] nums = {1};
        SegmentTree st = new SegmentTree(nums, nums.length);
        assertEquals(-1, st.findMinAbsDiff(0, 0, 0, nums.length - 1, 0));
    }

    @Test
    public void testTwoElementInput() {
        int[] nums = {1, 2};
        SegmentTree st = new SegmentTree(nums, nums.length);
        assertEquals(1, st.findMinAbsDiff(0, 1, 0, nums.length - 1, 0));
        assertEquals(-1, st.findMinAbsDiff(0, 0, 0, nums.length - 1, 0));
        assertEquals(-1, st.findMinAbsDiff(1, 1, 0, nums.length - 1, 0));
    }

    @Test
    public void testAllSameElementInput() {
        int[] nums = {1, 1, 1, 1};
        SegmentTree st = new SegmentTree(nums, nums.length);
        assertEquals(-1, st.findMinAbsDiff(0, 3, 0, nums.length - 1, 0));
    }

    @Test
    public void testAllDistinctElementInput() {
        int[] nums = {1, 2, 3, 4};
        SegmentTree st = new SegmentTree(nums, nums.length);
        assertEquals(1, st.findMinAbsDiff(0, 3, 0, nums.length - 1, 0));
    }

    @Test
    public void testLargeInput() {
        int[] nums = new int[100000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        SegmentTree st = new SegmentTree(nums, nums.length);
        assertEquals(1, st.findMinAbsDiff(0, 99999, 0, nums.length - 1, 0));
        assertEquals(-1, st.findMinAbsDiff(0, 0, 0, nums.length - 1, 0));
        assertEquals(-1, st.findMinAbsDiff(99999, 99999, 0, nums.length - 1, 0));
    }
}
