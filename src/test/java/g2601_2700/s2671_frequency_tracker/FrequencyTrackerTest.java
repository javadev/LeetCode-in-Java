package g2601_2700.s2671_frequency_tracker;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class FrequencyTrackerTest {
    @Test
    void frequencyTrackerTest() {
        FrequencyTracker frequencyTracker = new FrequencyTracker();
        frequencyTracker.add(3);
        frequencyTracker.add(3);
        assertThat(frequencyTracker.hasFrequency(2), equalTo(true));
    }

    @Test
    void frequencyTrackerTest2() {
        FrequencyTracker frequencyTracker = new FrequencyTracker();
        frequencyTracker.add(1);
        frequencyTracker.deleteOne(1);
        assertThat(frequencyTracker.hasFrequency(1), equalTo(false));
    }
}
