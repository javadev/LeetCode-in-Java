package g2801_2900.s2857_count_pairs_of_points_with_distance_k;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countPairs() {
        List<List<Integer>> input =
                Arrays.asList(
                        Arrays.asList(1, 2),
                        Arrays.asList(4, 2),
                        Arrays.asList(1, 3),
                        Arrays.asList(5, 2));
        assertThat(new Solution().countPairs(input, 5), equalTo(2));
    }

    @Test
    void countPairs2() {
        List<List<Integer>> input =
                Arrays.asList(
                        Arrays.asList(1, 3),
                        Arrays.asList(1, 3),
                        Arrays.asList(1, 3),
                        Arrays.asList(1, 3),
                        Arrays.asList(1, 3));
        assertThat(new Solution().countPairs(input, 0), equalTo(10));
    }
}
