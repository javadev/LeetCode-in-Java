package s0040_combination_sum_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void combinationSum2() {
        List<List<Integer>> expected = new ArrayList<>();

        List<Integer> sub1 = new ArrayList<>();
        sub1.addAll(Arrays.asList(1, 1, 6));

        List<Integer> sub2 = new ArrayList<>();
        sub2.addAll(Arrays.asList(1, 2, 5));

        List<Integer> sub3 = new ArrayList<>();
        sub3.addAll(Arrays.asList(1, 7));

        List<Integer> sub4 = new ArrayList<>();
        sub4.addAll(Arrays.asList(2, 6));

        expected.add(sub1);
        expected.add(sub2);
        expected.add(sub3);
        expected.add(sub4);

        List<List<Integer>> actual =
                new Solution().combinationSum2(new int[] {10, 1, 2, 7, 6, 1, 5}, 8);

        for (int i = 0; i < expected.size(); i++) {
            assertThat(actual.get(i).toArray(), equalTo(expected.get(i).toArray()));
        }
    }
}
