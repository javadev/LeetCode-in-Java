package g0301_0400.s0398_random_pick_index;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void pick() {
        int[] input = {1, 2, 3, 3, 3};
        Solution solution = new Solution(input);
        assertThat(Arrays.asList(2, 3, 4).contains(solution.pick(3)), equalTo(true));
        assertThat(solution.pick(1), equalTo(0));
        assertThat(Arrays.asList(2, 3, 4).contains(solution.pick(3)), equalTo(true));
    }

    @Test
    void pick2() {
        int[] input = {7, -2, 5, 0};
        Solution solution = new Solution(input);
        assertThat(solution.pick(7), equalTo(0));
        assertThat(solution.pick(-2), equalTo(1));
        assertThat(solution.pick(5), equalTo(2));
        assertThat(solution.pick(0), equalTo(3));
    }

    @Test
    void pick3() {
        int[] input = {4, 1, 4, 2, 4, 4};
        Solution solution = new Solution(input);
        List<Integer> expected = Arrays.asList(0, 2, 4, 5);
        Set<Integer> picked = new HashSet<>();
        for (int i = 0; i < 1000; i++) {
            int index = solution.pick(4);
            assertThat(expected.contains(index), equalTo(true));
            picked.add(index);
        }
        assertThat(picked, equalTo(new HashSet<>(expected)));
        assertThat(solution.pick(1), equalTo(1));
        assertThat(solution.pick(2), equalTo(3));
    }
}
