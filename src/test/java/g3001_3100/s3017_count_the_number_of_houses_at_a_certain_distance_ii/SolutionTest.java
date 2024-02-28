package g3001_3100.s3017_count_the_number_of_houses_at_a_certain_distance_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countOfPairs() {
        assertThat(new Solution().countOfPairs(3, 1, 3), equalTo(new long[] {6, 0, 0}));
    }

    @Test
    void countOfPairs2() {
        assertThat(new Solution().countOfPairs(5, 2, 4), equalTo(new long[] {10, 8, 2, 0, 0}));
    }

    @Test
    void countOfPairs3() {
        assertThat(new Solution().countOfPairs(4, 1, 1), equalTo(new long[] {6, 4, 2, 0}));
    }
}
