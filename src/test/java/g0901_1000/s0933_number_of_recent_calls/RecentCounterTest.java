package g0901_1000.s0933_number_of_recent_calls;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class RecentCounterTest {

    @Test
    void recentCounterTest() {
        RecentCounter recentCounter = new RecentCounter();
        assertThat(recentCounter.ping(1), equalTo(1));
        assertThat(recentCounter.ping(100), equalTo(2));
        assertThat(recentCounter.ping(3001), equalTo(3));
        assertThat(recentCounter.ping(3002), equalTo(3));
    }
}
