package g1201_1300.s1238_circular_permutation_in_binary_representation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import com_github_leetcode.CommonUtils;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void circularPermutation() {
        List<Integer> actual = new Solution().circularPermutation(2, 3);
        assertThat(CommonUtils.compareArray(actual, Arrays.asList(3, 2, 0, 1)), equalTo(true));
    }

    @Test
    void circularPermutation2() {
        List<Integer> actual = new Solution().circularPermutation(3, 2);
        assertThat(
                CommonUtils.compareArray(actual, Arrays.asList(2, 6, 7, 5, 4, 0, 1, 3)),
                equalTo(true));
    }
}
