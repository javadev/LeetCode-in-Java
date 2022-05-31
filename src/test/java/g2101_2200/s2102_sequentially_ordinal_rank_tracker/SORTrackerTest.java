package g2101_2200.s2102_sequentially_ordinal_rank_tracker;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class SORTrackerTest {
    @Test
    void sortTrackerTest() {
        SORTracker tracker = new SORTracker();
        tracker.add("bradford", 2);
        tracker.add("branford", 3);
        assertThat(tracker.get(), equalTo("branford"));
        tracker.add("alps", 2);
        assertThat(tracker.get(), equalTo("alps"));
        tracker.add("orland", 2);
        assertThat(tracker.get(), equalTo("bradford"));
        tracker.add("orlando", 3);
        assertThat(tracker.get(), equalTo("bradford"));
        tracker.add("alpine", 2);
        assertThat(tracker.get(), equalTo("bradford"));
        assertThat(tracker.get(), equalTo("orland"));
    }
}
