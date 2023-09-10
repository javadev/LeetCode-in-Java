package g2601_2700.s2671_frequency_tracker;

// #Medium #Hash_Table #Design #2023_09_10_Time_31_ms_(83.08%)_Space_111.8_MB_(59.70%)

import java.util.HashMap;
import java.util.Map;

public class FrequencyTracker {
    private final Map<Integer, Integer> numCount;
    private final Map<Integer, Integer> frequencies;

    public FrequencyTracker() {
        numCount = new HashMap<>();
        frequencies = new HashMap<>();
    }

    public void add(int number) {
        int newCount = numCount.merge(number, 1, Integer::sum);
        frequencies.merge(newCount, 1, Integer::sum);
        if (newCount > 1) {
            frequencies.merge(newCount - 1, -1, Integer::sum);
        }
    }

    public void deleteOne(int number) {
        Integer currentVal = numCount.get(number);
        if (currentVal != null && currentVal > 0) {
            int newCount = numCount.merge(number, -1, Integer::sum);
            frequencies.merge(newCount, 1, Integer::sum);
            frequencies.merge(newCount + 1, -1, Integer::sum);
        }
    }

    public boolean hasFrequency(int frequency) {
        Integer existing = frequencies.get(frequency);
        return existing != null && existing > 0;
    }
}

/*
 * Your FrequencyTracker object will be instantiated and called as such:
 * FrequencyTracker obj = new FrequencyTracker();
 * obj.add(number);
 * obj.deleteOne(number);
 * boolean param_3 = obj.hasFrequency(frequency);
 */
