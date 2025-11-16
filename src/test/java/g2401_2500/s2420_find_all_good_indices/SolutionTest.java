package g2401_2500.s2420_find_all_good_indices;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void goodIndices() {
        assertThat(
                new Solution().goodIndices(new int[] {2, 1, 1, 1, 3, 4, 1}, 2),
                equalTo(Arrays.asList(2, 3)));
    }

    @Test
    void goodIndices2() {
        assertThat(
                new Solution().goodIndices(new int[] {2, 1, 1, 2}, 2),
                equalTo(Collections.emptyList()));
    }

    @Test
    void goodIndices3() {
        assertThat(
                new Solution().goodIndices(new int[] {5, 3, 4, 2, 1}, 1),
                equalTo(Arrays.asList(1, 2, 3)));
    }

    @Test
    void goodIndices4() {
        assertThat(new Solution().goodIndices(new int[] {5, 4, 3, 2, 1}, 2), equalTo(List.of()));
    }

    @Test
    void goodIndices5() {
        assertThat(
                new Solution().goodIndices(new int[] {1, 2, 3, 4, 5}, 2),
                equalTo(Collections.emptyList()));
    }

    @Test
    void goodIndices6() {
        assertThat(
                new Solution().goodIndices(new int[] {1, 2}, 2), equalTo(Collections.emptyList()));
    }

    @Test
    void goodIndices7() {
        assertThat(
                new Solution().goodIndices(new int[] {5, 4, 4, 3, 2, 2, 3, 4, 4, 3, 2}, 2),
                equalTo(Arrays.asList(3, 4, 5, 6)));
    }

    @Test
    void goodIndices8() {
        assertThat(
                new Solution().goodIndices(new int[] {3, 2, 1, 2, 3, 2, 1, 2, 3}, 2),
                equalTo(Arrays.asList(2, 6)));
    }

    @Test
    void goodIndices9() {
        assertThat(
                new Solution().goodIndices(new int[] {3, 2, 1, 1, 2, 3}, 2),
                equalTo(Arrays.asList(2, 3)));
    }

    @Test
    void goodIndices10() {
        assertThat(
                new Solution().goodIndices(new int[] {2, 2, 2, 2, 2}, 2),
                equalTo(Arrays.asList(2)));
    }
}
