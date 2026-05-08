package g3701_3800.s3774_absolute_difference_between_maximum_and_minimum_k_elements;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void absDifference() {
        assertThat(new Solution().absDifference(new int[] {5, 2, 2, 4}, 2), equalTo(5));
    }

    @Test
    void absDifference2() {
        assertThat(new Solution().absDifference(new int[] {100}, 1), equalTo(0));
    }
}
