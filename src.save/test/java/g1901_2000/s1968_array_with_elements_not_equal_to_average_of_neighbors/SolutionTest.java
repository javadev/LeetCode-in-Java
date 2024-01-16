package g1901_2000.s1968_array_with_elements_not_equal_to_average_of_neighbors;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void rearrangeArray() {
        assertThat(
                CommonUtils.compareArray(
                        new Solution().rearrangeArray(new int[] {1, 2, 3, 4, 5}),
                        new int[] {1, 2, 4, 5, 3}),
                equalTo(true));
    }

    @Test
    void rearrangeArray2() {
        assertThat(
                CommonUtils.compareArray(
                        new Solution().rearrangeArray(new int[] {6, 2, 0, 9, 7}),
                        new int[] {6, 2, 0, 9, 7}),
                equalTo(true));
    }
}
