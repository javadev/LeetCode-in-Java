package g3801_3900.s3834_merge_adjacent_equal_elements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void mergeAdjacent() {
        assertThat(
                new Solution().mergeAdjacent(new int[] {3, 1, 1, 2}),
                equalTo(Arrays.asList(3L, 4L)));
    }

    @Test
    void mergeAdjacent2() {
        assertThat(new Solution().mergeAdjacent(new int[] {2, 2, 4}), equalTo(Arrays.asList(8L)));
    }

    @Test
    void mergeAdjacent3() {
        assertThat(
                new Solution().mergeAdjacent(new int[] {3, 7, 5}),
                equalTo(Arrays.asList(3L, 7L, 5L)));
    }
}
