package g0301_0400.s0384_shuffle_an_array;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void solutionTest() {
        List<int[]> result = new ArrayList<>();
        int[] initial = new int[] {1, 2, 3};
        result.add(null);
        Solution solution = new Solution(new int[] {1, 2, 3});
        result.add(solution.shuffle());
        boolean equal = Arrays.equals(solution.reset(), initial);
        result.add(solution.shuffle());
        boolean valid = true;
        for (int i = 1; i < result.size(); i++) {
            for (int j = 0; j < initial.length; j++) {
                int finalJ = j;
                if (!IntStream.of(result.get(i)).anyMatch(x -> x == initial[finalJ])) {
                    valid = false;
                }
            }
        }
        boolean isValid = valid && equal;
        assertThat(isValid, equalTo(true));
    }
}
