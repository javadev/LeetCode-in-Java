package g1001_1100.s1010_pairs_of_songs_with_total_durations_divisible_by_60;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void numPairsDivisibleBy60() {
        assertThat(
                new Solution().numPairsDivisibleBy60(new int[] {30, 20, 150, 100, 40}), equalTo(3));
    }

    @Test
    void numPairsDivisibleBy602() {
        assertThat(new Solution().numPairsDivisibleBy60(new int[] {60, 60, 60}), equalTo(3));
    }
}
