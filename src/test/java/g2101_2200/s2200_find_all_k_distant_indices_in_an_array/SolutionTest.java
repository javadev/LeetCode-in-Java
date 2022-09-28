package g2101_2200.s2200_find_all_k_distant_indices_in_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findKDistantIndices() {
        assertThat(
                new Solution().findKDistantIndices(new int[] {3, 4, 9, 1, 3, 9, 5}, 9, 1),
                equalTo(Arrays.asList(1, 2, 3, 4, 5, 6)));
    }

    @Test
    void findKDistantIndices2() {
        assertThat(
                new Solution().findKDistantIndices(new int[] {2, 2, 2, 2, 2}, 2, 2),
                equalTo(Arrays.asList(0, 1, 2, 3, 4)));
    }
}
