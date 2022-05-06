package g0001_0100.s0080_remove_duplicates_from_sorted_array_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void removeDuplicates() {
        int[] array = {1, 1, 1, 2, 2, 3};
        int end = new Solution().removeDuplicates(array);
        assertThat(Arrays.copyOfRange(array, 0, end), equalTo(new int[] {1, 1, 2, 2, 3}));
    }

    @Test
    void removeDuplicates2() {
        int[] array = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int end = new Solution().removeDuplicates(array);
        assertThat(Arrays.copyOfRange(array, 0, end), equalTo(new int[] {0, 0, 1, 1, 2, 3, 3}));
    }
}
