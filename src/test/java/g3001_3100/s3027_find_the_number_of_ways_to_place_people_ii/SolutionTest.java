package g3001_3100.s3027_find_the_number_of_ways_to_place_people_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfPairs() {
        assertThat(new Solution().numberOfPairs(new int[][] {{1, 1}, {2, 2}, {3, 3}}), equalTo(0));
    }

    @Test
    void numberOfPairs2() {
        assertThat(new Solution().numberOfPairs(new int[][] {{6, 2}, {4, 4}, {2, 6}}), equalTo(2));
    }

    @Test
    void numberOfPairs3() {
        assertThat(new Solution().numberOfPairs(new int[][] {{3, 1}, {1, 3}, {1, 1}}), equalTo(2));
    }
}
