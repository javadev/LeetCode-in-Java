package g2601_2700.s2657_find_the_prefix_common_array_of_two_arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findThePrefixCommonArray() {
        assertThat(
                new Solution()
                        .findThePrefixCommonArray(new int[] {1, 3, 2, 4}, new int[] {3, 1, 2, 4}),
                equalTo(new int[] {0, 2, 3, 4}));
    }

    @Test
    void findThePrefixCommonArray2() {
        assertThat(
                new Solution().findThePrefixCommonArray(new int[] {2, 3, 1}, new int[] {3, 1, 2}),
                equalTo(new int[] {0, 1, 3}));
    }
}
