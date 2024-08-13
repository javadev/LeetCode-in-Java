package g3201_3300.s3251_find_the_count_of_monotonic_pairs_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void countOfPairs() {
        assertThat(new Solution().countOfPairs(new int[] {2, 3, 2}), equalTo(4));
    }

    @Test
    void countOfPairs2() {
        assertThat(new Solution().countOfPairs(new int[] {5, 5, 5, 5}), equalTo(126));
    }
}
