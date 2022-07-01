package g1801_1900.s1900_the_earliest_and_latest_rounds_where_players_compete;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void earliestAndLatest() {
        assertThat(new Solution().earliestAndLatest(11, 2, 4), equalTo(new int[] {3, 4}));
    }

    @Test
    void earliestAndLatest2() {
        assertThat(new Solution().earliestAndLatest(5, 1, 5), equalTo(new int[] {1, 1}));
    }
}
