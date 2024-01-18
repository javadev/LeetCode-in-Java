package g2001_2100.s2089_find_target_indices_after_sorting_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void targetIndices() {
        assertThat(
                new Solution().targetIndices(new int[] {1, 2, 5, 2, 3}, 2),
                equalTo(Arrays.asList(1, 2)));
    }

    @Test
    void targetIndices2() {
        assertThat(
                new Solution().targetIndices(new int[] {1, 2, 5, 2, 3}, 3),
                equalTo(Arrays.asList(3)));
    }

    @Test
    void targetIndices3() {
        assertThat(
                new Solution().targetIndices(new int[] {1, 2, 5, 2, 3}, 5),
                equalTo(Arrays.asList(4)));
    }
}
