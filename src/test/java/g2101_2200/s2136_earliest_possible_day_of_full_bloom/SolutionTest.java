package g2101_2200.s2136_earliest_possible_day_of_full_bloom;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void earliestFullBloom() {
        assertThat(
                new Solution().earliestFullBloom(new int[] {1, 4, 3}, new int[] {2, 3, 1}),
                equalTo(9));
    }

    @Test
    void earliestFullBloom2() {
        assertThat(
                new Solution().earliestFullBloom(new int[] {1, 2, 3, 2}, new int[] {2, 1, 2, 1}),
                equalTo(9));
    }

    @Test
    void earliestFullBloom3() {
        assertThat(new Solution().earliestFullBloom(new int[] {1}, new int[] {1}), equalTo(2));
    }
}
