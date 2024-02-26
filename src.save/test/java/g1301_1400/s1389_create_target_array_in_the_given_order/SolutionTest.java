package g1301_1400.s1389_create_target_array_in_the_given_order;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void createTargetArray() {
        assertThat(
                new Solution()
                        .createTargetArray(new int[] {0, 1, 2, 3, 4}, new int[] {0, 1, 2, 2, 1}),
                equalTo(new int[] {0, 4, 1, 3, 2}));
    }

    @Test
    void createTargetArray2() {
        assertThat(
                new Solution()
                        .createTargetArray(new int[] {1, 2, 3, 4, 0}, new int[] {0, 1, 2, 3, 0}),
                equalTo(new int[] {0, 1, 2, 3, 4}));
    }
}
