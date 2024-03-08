package g2901_3000.s2956_find_common_elements_between_two_arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findIntersectionValues() {
        assertThat(
                new Solution()
                        .findIntersectionValues(
                                new int[] {4, 3, 2, 3, 1}, new int[] {2, 2, 5, 2, 3, 6}),
                equalTo(new int[] {3, 4}));
    }

    @Test
    void findIntersectionValues2() {
        assertThat(
                new Solution().findIntersectionValues(new int[] {3, 4, 2, 3}, new int[] {1, 5}),
                equalTo(new int[] {0, 0}));
    }
}
