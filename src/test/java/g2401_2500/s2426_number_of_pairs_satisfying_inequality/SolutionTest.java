package g2401_2500.s2426_number_of_pairs_satisfying_inequality;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numberOfPairs() {
        assertThat(
                new Solution().numberOfPairs(new int[] {3, 2, 5}, new int[] {2, 2, 1}, 1),
                equalTo(3L));
    }

    @Test
    void numberOfPairs2() {
        assertThat(
                new Solution().numberOfPairs(new int[] {3, -1}, new int[] {-2, 2}, -1),
                equalTo(0L));
    }
}
