package s0047_permutations_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void permuteUnique() {
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 1, 2));
        expected.add(Arrays.asList(1, 2, 1));
        expected.add(Arrays.asList(2, 1, 1));

        List<List<Integer>> actual = new Solution().permuteUnique(new int[] {1, 1, 2});

        for (int i = 0; i < expected.size(); i++) {
            assertThat(
                    Arrays.toString(actual.get(i).toArray()),
                    equalTo(Arrays.toString(expected.get(i).toArray())));
        }
    }
}
