package g0601_0700.s0658_find_k_closest_elements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findClosestElements() {
        assertThat(
                new Solution().findClosestElements(new int[] {1, 2, 3, 4, 5}, 4, 3),
                equalTo(Arrays.asList(1, 2, 3, 4)));
    }

    @Test
    void findClosestElements2() {
        assertThat(
                new Solution().findClosestElements(new int[] {1, 2, 3, 4, 5}, 4, -1),
                equalTo(Arrays.asList(1, 2, 3, 4)));
    }
}
