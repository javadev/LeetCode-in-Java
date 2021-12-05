package g0001_0100.s0080_remove_duplicates_from_sorted_array_ii_medium_array_two_pointers;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void removeDuplicates() {
        int[] array = {1, 1, 1, 2, 2, 3};
        int end = new Solution().removeDuplicates(array);
        assertThat(Arrays.copyOfRange(array, 0, end), equalTo(new int[] {1, 1, 2, 2, 3}));
    }
}
