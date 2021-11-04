package g0001_0100.s0046_permutations;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void permutations() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2, 3));
        expected.add(Arrays.asList(1, 3, 2));
        expected.add(Arrays.asList(2, 1, 3));
        expected.add(Arrays.asList(2, 3, 1));
        expected.add(Arrays.asList(3, 1, 2));
        expected.add(Arrays.asList(3, 2, 1));

        List<List<Integer>> actual = new Solution().permute(new int[] {1, 2, 3});

        for (int i = 0; i < expected.size(); i++) {
            assertThat(
                    Arrays.toString(actual.get(i).toArray()),
                    equalTo(Arrays.toString(expected.get(i).toArray())));
        }
    }
}
