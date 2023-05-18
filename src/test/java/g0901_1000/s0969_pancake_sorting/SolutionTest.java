package g0901_1000.s0969_pancake_sorting;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void pancakeSort() {
        assertThat(
                new Solution().pancakeSort(new int[] {3, 2, 4, 1}),
                equalTo(Arrays.asList(3, 4, 2, 3, 1, 2, 1, 1)));
    }

    @Test
    void pancakeSort2() {
        assertThat(
                new Solution().pancakeSort(new int[] {1, 2, 3}),
                equalTo(Arrays.asList(3, 3, 2, 2, 1, 1)));
    }
}
