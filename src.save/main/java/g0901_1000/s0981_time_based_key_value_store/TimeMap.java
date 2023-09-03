package g0901_1000.s0981_time_based_key_value_store;

// #Medium #String #Hash_Table #Binary_Search #Design #Binary_Search_II_Day_16
// #2022_03_31_Time_239_ms_(72.78%)_Space_213.8_MB_(76.88%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeMap {
    private Map<String, List<TimeStampData>> map;

    private static class TimeStampData {
        int timestamp;
        String value;

        TimeStampData(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }
    }

    public TimeMap() {
        this.map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        List<TimeStampData> timeStampDataList;
        if (!this.map.containsKey(key)) {
            timeStampDataList = new ArrayList<>();
            timeStampDataList.add(new TimeStampData(timestamp, value));
            map.put(key, timeStampDataList);
        } else {
            this.map.get(key).add(new TimeStampData(timestamp, value));
        }
    }

    public String get(String key, int timestamp) {
        if (!this.map.containsKey(key)) {
            return "";
        }
        List<TimeStampData> list = this.map.get(key);
        int start = 0;
        int end = list.size() - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (list.get(mid).timestamp == timestamp) {
                return list.get(mid).value;
            }
            if (timestamp > list.get(mid).timestamp) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end < 0 ? "" : list.get(end).value;
    }
}

/*
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
