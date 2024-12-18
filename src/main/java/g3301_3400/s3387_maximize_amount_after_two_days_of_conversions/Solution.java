package g3301_3400.s3387_maximize_amount_after_two_days_of_conversions;

// #Medium #Array #String #Depth_First_Search #Breadth_First_Search #Graph
// #2024_12_18_Time_7_ms_(87.88%)_Space_47.5_MB_(43.35%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("java:S3824")
public class Solution {
    private double res;
    private Map<String, List<Pair>> map1;
    private Map<String, List<Pair>> map2;

    private static class Pair {
        String tarcurr;
        double rate;

        Pair(String t, double r) {
            tarcurr = t;
            rate = r;
        }
    }

    private void solve(
            String currCurrency, double value, String targetCurrency, int day, Set<String> used) {
        if (currCurrency.equals(targetCurrency)) {
            res = Math.max(res, value);
            if (day == 2) {
                return;
            }
        }
        List<Pair> list;
        if (day == 1) {
            list = map1.getOrDefault(currCurrency, new ArrayList<>());
        } else {
            list = map2.getOrDefault(currCurrency, new ArrayList<>());
        }
        for (Pair p : list) {
            if (used.add(p.tarcurr)) {
                solve(p.tarcurr, value * p.rate, targetCurrency, day, used);
                used.remove(p.tarcurr);
            }
        }
        if (day == 1) {
            solve(currCurrency, value, targetCurrency, day + 1, new HashSet<>());
        }
    }

    public double maxAmount(
            String initialCurrency,
            List<List<String>> pairs1,
            double[] rates1,
            List<List<String>> pairs2,
            double[] rates2) {
        map1 = new HashMap<>();
        map2 = new HashMap<>();
        int size = pairs1.size();
        for (int i = 0; i < size; i++) {
            List<String> curr = pairs1.get(i);
            String c1 = curr.get(0);
            String c2 = curr.get(1);
            if (!map1.containsKey(c1)) {
                map1.put(c1, new ArrayList<>());
            }
            map1.get(c1).add(new Pair(c2, rates1[i]));
            if (!map1.containsKey(c2)) {
                map1.put(c2, new ArrayList<>());
            }
            map1.get(c2).add(new Pair(c1, 1d / rates1[i]));
        }
        size = pairs2.size();
        for (int i = 0; i < size; i++) {
            List<String> curr = pairs2.get(i);
            String c1 = curr.get(0);
            String c2 = curr.get(1);
            if (!map2.containsKey(c1)) {
                map2.put(c1, new ArrayList<>());
            }
            map2.get(c1).add(new Pair(c2, rates2[i]));
            if (!map2.containsKey(c2)) {
                map2.put(c2, new ArrayList<>());
            }
            map2.get(c2).add(new Pair(c1, 1d / rates2[i]));
        }
        res = 1d;
        solve(initialCurrency, 1d, initialCurrency, 1, new HashSet<>());
        return res;
    }
}
