package g2901_3000.s2902_count_of_sub_multisets_with_bounded_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countSubMultisets() {
        assertThat(new Solution().countSubMultisets(Arrays.asList(1, 2, 2, 3), 6, 6), equalTo(1));
    }

    @Test
    void countSubMultisets2() {
        assertThat(
                new Solution().countSubMultisets(Arrays.asList(2, 1, 4, 2, 7), 1, 5), equalTo(7));
    }

    @Test
    void countSubMultisets3() {
        assertThat(
                new Solution().countSubMultisets(Arrays.asList(1, 2, 1, 3, 5, 2), 3, 5),
                equalTo(9));
    }
}
