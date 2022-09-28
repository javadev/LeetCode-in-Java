package g1301_1400.s1348_tweet_counts_per_frequency;

// #Medium #Hash_Table #Sorting #Binary_Search #Design #Ordered_Set
// #2022_03_21_Time_86_ms_(99.44%)_Space_53.5_MB_(82.58%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TweetCounts {
    private static final int MINUTE = 60;
    private static final int HOUR = 3600;
    private static final int DAY = 86400;

    private final Map<String, Map<Integer, Map<Integer, Map<Integer, List<Integer>>>>> store;

    public TweetCounts() {
        this.store = new HashMap<>();
    }

    public void recordTweet(String tweetName, int time) {
        int d = time / DAY;
        int h = (time - d * DAY) / HOUR;
        int m = (time - d * DAY - h * HOUR) / MINUTE;
        Map<Integer, Map<Integer, Map<Integer, List<Integer>>>> dstore =
                store.computeIfAbsent(tweetName, k -> new HashMap<>());
        Map<Integer, Map<Integer, List<Integer>>> hstore =
                dstore.computeIfAbsent(d, k -> new HashMap<>());
        Map<Integer, List<Integer>> mstore = hstore.computeIfAbsent(h, k -> new HashMap<>());
        mstore.computeIfAbsent(m, k -> new ArrayList<>()).add(time);
    }

    public List<Integer> getTweetCountsPerFrequency(
            String freq, String tweetName, int startTime, int endTime) {
        int sfreq = convFreqToSecond(freq);
        Map<Integer, Map<Integer, Map<Integer, List<Integer>>>> dstore = store.get(tweetName);
        int[] chunks = new int[(endTime - startTime) / sfreq + 1];
        int sd = startTime / DAY;
        int ed = endTime / DAY;
        for (int d = sd; d <= ed; d++) {
            if (!dstore.containsKey(d)) {
                continue;
            }
            int sh = startTime <= (d * DAY) ? 0 : ((startTime - d * DAY) / HOUR);
            int eh = endTime > ((d + 1) * DAY) ? (DAY / HOUR) : ((endTime - d * DAY) / HOUR + 1);
            Map<Integer, Map<Integer, List<Integer>>> hstore = dstore.get(d);
            for (int h = sh; h < eh; h++) {
                if (!hstore.containsKey(h)) {
                    continue;
                }
                int sm =
                        startTime <= (d * DAY + h * HOUR)
                                ? 0
                                : ((startTime - d * DAY - h * HOUR) / MINUTE);
                int em =
                        endTime > (d * DAY + (h + 1) * HOUR)
                                ? (HOUR / MINUTE)
                                : ((endTime - d * DAY - h * HOUR) / MINUTE + 1);
                Map<Integer, List<Integer>> mstore = hstore.get(h);
                for (int m = sm; m <= em; m++) {
                    if (!mstore.containsKey(m)) {
                        continue;
                    }
                    for (Integer rc : mstore.get(m)) {
                        if (startTime <= rc && rc <= endTime) {
                            chunks[(rc - startTime) / sfreq]++;
                        }
                    }
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int chunk : chunks) {
            ans.add(chunk);
        }
        return ans;
    }

    private int convFreqToSecond(String freq) {
        switch (freq) {
            case "minute":
                return MINUTE;
            case "hour":
                return HOUR;
            case "day":
                return DAY;
            default:
                return 0;
        }
    }
}
