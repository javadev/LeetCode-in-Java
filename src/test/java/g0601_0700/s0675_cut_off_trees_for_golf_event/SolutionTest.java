package g0601_0700.s0675_cut_off_trees_for_golf_event;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void cutOffTree() {
        List<List<Integer>> input =
                Arrays.asList(
                        Arrays.asList(1, 2, 3), Arrays.asList(0, 0, 4), Arrays.asList(7, 6, 5));
        assertThat(new Solution().cutOffTree(input), equalTo(6));
    }

    @Test
    void cutOffTree2() {
        List<List<Integer>> input =
                Arrays.asList(
                        Arrays.asList(1, 2, 3), Arrays.asList(0, 0, 0), Arrays.asList(7, 6, 5));
        assertThat(new Solution().cutOffTree(input), equalTo(-1));
    }

    @Test
    void cutOffTree3() {
        List<List<Integer>> input =
                Arrays.asList(
                        Arrays.asList(2, 3, 4), Arrays.asList(0, 0, 5), Arrays.asList(8, 7, 6));
        assertThat(new Solution().cutOffTree(input), equalTo(6));
    }
}
