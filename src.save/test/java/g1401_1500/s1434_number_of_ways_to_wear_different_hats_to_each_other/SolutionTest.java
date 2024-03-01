package g1401_1500.s1434_number_of_ways_to_wear_different_hats_to_each_other;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberWays() {
        List<List<Integer>> input =
                Arrays.asList(
                        Arrays.asList(3, 4), Arrays.asList(4, 5), Collections.singletonList(5));
        assertThat(new Solution().numberWays(input), equalTo(1));
    }

    @Test
    void numberWays2() {
        List<List<Integer>> input = Arrays.asList(Arrays.asList(3, 5, 1), Arrays.asList(3, 5));
        assertThat(new Solution().numberWays(input), equalTo(4));
    }

    @Test
    void numberWays3() {
        List<List<Integer>> input =
                Arrays.asList(
                        Arrays.asList(1, 2, 3, 4),
                        Arrays.asList(1, 2, 3, 4),
                        Arrays.asList(1, 2, 3, 4),
                        Arrays.asList(1, 2, 3, 4));
        assertThat(new Solution().numberWays(input), equalTo(24));
    }
}
