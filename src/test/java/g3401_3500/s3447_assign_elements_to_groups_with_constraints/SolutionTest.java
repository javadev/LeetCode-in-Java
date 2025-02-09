package g3401_3500.s3447_assign_elements_to_groups_with_constraints;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void assignElements() {
        assertThat(
                new Solution().assignElements(new int[] {8, 4, 3, 2, 4}, new int[] {4, 2}),
                equalTo(new int[] {0, 0, -1, 1, 0}));
    }

    @Test
    void assignElements2() {
        assertThat(
                new Solution().assignElements(new int[] {2, 3, 5, 7}, new int[] {5, 3, 3}),
                equalTo(new int[] {-1, 1, 0, -1}));
    }

    @Test
    void assignElements3() {
        assertThat(
                new Solution().assignElements(new int[] {10, 21, 30, 41}, new int[] {2, 1}),
                equalTo(new int[] {0, 1, 0, 1}));
    }
}
