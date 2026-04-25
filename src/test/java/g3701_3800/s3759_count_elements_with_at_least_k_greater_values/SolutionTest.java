package g3701_3800.s3759_count_elements_with_at_least_k_greater_values;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countElements() {
        assertThat(new Solution().countElements(new int[] {3, 1, 2}, 1), equalTo(2));
    }

    @Test
    void countElements2() {
        assertThat(new Solution().countElements(new int[] {5, 5, 5}, 2), equalTo(0));
    }
}
