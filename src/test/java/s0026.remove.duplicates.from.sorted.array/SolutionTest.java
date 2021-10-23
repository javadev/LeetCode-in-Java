package s0026.remove.duplicates.from.sorted.array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void removeDuplicates() {
        int[] array = new int[] {1, 1, 2};
        int end = new Solution().removeDuplicates(array);
        assertThat(Arrays.toString(Arrays.copyOfRange(array, 0, end)), equalTo("[1, 2]"));
    }
}
