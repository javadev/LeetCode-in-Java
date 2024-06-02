package g3101_3200.s3164_find_the_number_of_good_pairs_ii;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfPairs() {
        assertThat(
                new Solution().numberOfPairs(new int[] {1, 3, 4}, new int[] {1, 3, 4}, 1),
                equalTo(5L));
    }

    @Test
    void numberOfPairs2() {
        assertThat(
                new Solution().numberOfPairs(new int[] {1, 2, 4, 12}, new int[] {2, 4}, 3),
                equalTo(2L));
    }
}
