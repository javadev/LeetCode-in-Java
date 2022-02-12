package g0901_1000.s0981_time_based_key_value_store;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class TimeMapTest {
    @Test
    void timeMap() {
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo", "bar", 1);
        assertThat(timeMap.get("foo", 1), equalTo("bar"));
        assertThat(timeMap.get("foo", 3), equalTo("bar"));
        timeMap.set("foo", "bar2", 4);
        assertThat(timeMap.get("foo", 4), equalTo("bar2"));
        assertThat(timeMap.get("foo", 5), equalTo("bar2"));
    }
}
