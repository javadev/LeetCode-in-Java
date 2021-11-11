package g0101_0200.s0118_pascals_triangle;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void pascalTringle() {
        List<List<Integer>> actual = new Solution().generate(5);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(1, 1));
        expected.add(Arrays.asList(1, 2, 1));
        expected.add(Arrays.asList(1, 3, 3, 1));
        expected.add(Arrays.asList(1, 4, 6, 4, 1));
        for (int i = 0; i < expected.size(); i++) {
            assertThat(actual.get(i), equalTo(expected.get(i)));
        }
    }
}
