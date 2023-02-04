package g2201_2300.s2276_count_integers_in_intervals;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class CountIntervalsTest {
    @Test
    void countIntervalsTest() {
        CountIntervals countIntervals = new CountIntervals();
        countIntervals.add(2, 3);
        countIntervals.add(7, 10);
        assertThat(countIntervals.count(), equalTo(6));
        countIntervals.add(5, 8);
        assertThat(countIntervals.count(), equalTo(8));
    }
}
