package g0001_0100.s0026_remove_duplicates_from_sorted_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void removeDuplicates() {
        int[] array = new int[] {1, 1, 2};
        int end = new Solution().removeDuplicates(array);
        assertThat(Arrays.toString(Arrays.copyOfRange(array, 0, end)), equalTo("[1, 2]"));
    }

    @Test
    void removeDuplicates2() {
        int[] array = new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int end = new Solution().removeDuplicates(array);
        assertThat(Arrays.toString(Arrays.copyOfRange(array, 0, end)), equalTo("[0, 1, 2, 3, 4]"));
    }
}
