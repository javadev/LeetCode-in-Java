package g2401_2500.s2420_find_all_good_indices;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
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
}
