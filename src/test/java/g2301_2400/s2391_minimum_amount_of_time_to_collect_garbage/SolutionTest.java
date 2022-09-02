package g2301_2400.s2391_minimum_amount_of_time_to_collect_garbage;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void garbageCollection() {
        assertThat(
                new Solution()
                        .garbageCollection(
                                new String[] {"G", "P", "GP", "GG"}, new int[] {2, 4, 3}),
                equalTo(21));
    }

    @Test
    void garbageCollection2() {
        assertThat(
                new Solution()
                        .garbageCollection(new String[] {"MMM", "PGM", "GP"}, new int[] {3, 10}),
                equalTo(37));
    }
}
