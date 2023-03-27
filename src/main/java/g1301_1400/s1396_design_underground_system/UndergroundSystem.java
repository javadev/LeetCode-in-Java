package g1301_1400.s1396_design_underground_system;

// #Medium #String #Hash_Table #Design #2022_03_17_Time_89_ms_(89.64%)_Space_55.2_MB_(88.83%)

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class UndergroundSystem {
    private static class StationAndTime {
        String stationName;
        int t;

        public StationAndTime(String stationName, int t) {
            this.stationName = stationName;
            this.t = t;
        }

        public String getStation() {
            return this.stationName;
        }

        public int getTime() {
            return this.t;
        }
    }

    private Map<String, double[]> averageTimeMap;
    private Map<Integer, LinkedList<StationAndTime>> travelerMap;

    public UndergroundSystem() {
        averageTimeMap = new HashMap<>();
        travelerMap = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        travelerMap.putIfAbsent(id, new LinkedList<>());
        travelerMap.get(id).add(new StationAndTime(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        LinkedList<StationAndTime> list = travelerMap.get(id);
        StationAndTime stationAndTime = list.getLast();
        String startToEndStation = stationAndTime.getStation() + "->" + stationName;
        int duration = t - stationAndTime.getTime();
        if (averageTimeMap.containsKey(startToEndStation)) {
            double[] pair = averageTimeMap.get(startToEndStation);
            double newAverage = (pair[0] * pair[1] + duration) / (pair[1] + 1);
            averageTimeMap.put(startToEndStation, new double[] {newAverage, pair[1] + 1});
        } else {
            averageTimeMap.put(startToEndStation, new double[] {duration, 1});
        }
    }

    public double getAverageTime(String startStation, String endStation) {
        return averageTimeMap.get(startStation + "->" + endStation)[0];
    }
}

/*
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
