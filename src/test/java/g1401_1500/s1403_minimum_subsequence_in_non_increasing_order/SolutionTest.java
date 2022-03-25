package g1401_1500.s1403_minimum_subsequence_in_non_increasing_order;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void minSubsequence() {
        assertThat(
                new Solution().minSubsequence(new int[] {4, 3, 10, 9, 8}),
                equalTo(Arrays.asList(10, 9)));
    }

    @Test
    void minSubsequence2() {
        assertThat(
                new Solution().minSubsequence(new int[] {4, 4, 7, 6, 7}),
                equalTo(Arrays.asList(7, 7, 6)));
    }

    @Test
    void minSubsequence3() {
        assertThat(
                new Solution().minSubsequence(new int[] {6}),
                equalTo(Collections.singletonList(6)));
    }
}
