package g0401_0500.s0491_increasing_subsequences;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void findSubsequences() {
        List<List<Integer>> expected =
                new ArrayList<>(
                        Arrays.asList(
                                Arrays.asList(4, 6),
                                Arrays.asList(4, 6, 7),
                                Arrays.asList(4, 6, 7, 7),
                                Arrays.asList(4, 7),
                                Arrays.asList(4, 7, 7),
                                Arrays.asList(6, 7),
                                Arrays.asList(6, 7, 7),
                                Arrays.asList(7, 7)));
        List<List<Integer>> result = new Solution().findSubsequences(new int[] {4, 6, 7, 7});
        result.forEach(e -> assertThat(expected.contains(e), equalTo(true)));
    }

    @Test
    void findSubsequences2() {
        List<List<Integer>> expected = new ArrayList<>(Arrays.asList(Arrays.asList(4, 4)));
        assertThat(new Solution().findSubsequences(new int[] {4, 4, 3, 2, 1}), equalTo(expected));
    }
}
