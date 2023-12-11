package g2201_2300.s2295_replace_elements_in_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void arrayChange() {
        assertThat(
                new Solution()
                        .arrayChange(new int[] {1, 2, 4, 6}, new int[][] {{1, 3}, {4, 7}, {6, 1}}),
                equalTo(new int[] {3, 2, 7, 1}));
    }

    @Test
    void arrayChange2() {
        assertThat(
                new Solution().arrayChange(new int[] {1, 2}, new int[][] {{1, 3}, {2, 1}, {3, 2}}),
                equalTo(new int[] {2, 1}));
    }
}
