package g3601_3700.s3684_maximize_sum_of_at_most_k_distinct_elements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void maxKDistinct() {
        assertThat(
                new Solution().maxKDistinct(new int[] {84, 93, 100, 77, 90}, 3),
                equalTo(new int[] {100, 93, 90}));
    }

    @Test
    void maxKDistinct2() {
        assertThat(
                new Solution().maxKDistinct(new int[] {84, 93, 100, 77, 93}, 3),
                equalTo(new int[] {100, 93, 84}));
    }

    @Test
    void maxKDistinct3() {
        assertThat(
                new Solution().maxKDistinct(new int[] {1, 1, 1, 2, 2, 2}, 6),
                equalTo(new int[] {2, 1}));
    }
}
