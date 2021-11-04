package s0039_combination_sum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void combinationSum() {
        List<List<Integer>> expected = new ArrayList<>();

        List<Integer> sublist1 = new ArrayList<>();
        sublist1.add(7);
        List<Integer> sublist2 = new ArrayList<>();
        sublist2.addAll(Arrays.asList(3, 2, 2));

        expected.add(sublist1);
        expected.add(sublist2);

        List<List<Integer>> actual = new Solution().combinationSum(new int[] {2, 3, 6, 7}, 7);

        for (int i = 0; i < expected.size(); i++) {
            assertThat(actual.get(i).toArray(), equalTo(expected.get(i).toArray()));
        }
    }
}
