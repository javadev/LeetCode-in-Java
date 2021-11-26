package g0201_0300.s0218_the_skyline_problem;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void theSkylineProblem() {
        int[][] buildings = {{2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8}};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(2, 10));
        expected.add(Arrays.asList(3, 15));
        expected.add(Arrays.asList(7, 12));
        expected.add(Arrays.asList(12, 0));
        expected.add(Arrays.asList(15, 10));
        expected.add(Arrays.asList(20, 8));
        expected.add(Arrays.asList(24, 0));

        List<List<Integer>> output = new Solution().getSkyline(buildings);

        for (int i = 0; i < expected.size(); i++) {
            assertThat(output.get(i), equalTo(expected.get(i)));
        }
    }
}
