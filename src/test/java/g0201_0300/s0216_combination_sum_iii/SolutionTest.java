package g0201_0300.s0216_combination_sum_iii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void combinationSum3() {
        List<List<Integer>> output = new Solution().combinationSum3(3, 7);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2, 4));

        for (int i = 0; i < expected.size(); i++) {
            assertThat(output.get(i), equalTo(expected.get(i)));
        }
    }
}
