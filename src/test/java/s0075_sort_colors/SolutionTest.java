package s0075_sort_colors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void sortColors() {
        int[] array = {2, 0, 2, 1, 1, 0};
        new Solution().sortColors(array);
        assertThat(array, equalTo(new int[] {0, 0, 1, 1, 2, 2}));
    }
}
