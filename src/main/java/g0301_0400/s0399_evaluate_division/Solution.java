package g0301_0400.s0399_evaluate_division;

// #Medium #Array #Depth_First_Search #Breadth_First_Search #Graph #Union_Find #Shortest_Path
// #2022_07_15_Time_1_ms_(99.52%)_Space_43_MB_(20.05%)

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    private Map<String, String> root;
    private Map<String, Double> rate;

    public double[] calcEquation(
            List<List<String>> equations, double[] values, List<List<String>> queries) {
        root = new HashMap<>();
        rate = new HashMap<>();
        int n = equations.size();
        for (List<String> equation : equations) {
            String x = equation.get(0);
            String y = equation.get(1);
            root.put(x, x);
            root.put(y, y);
            rate.put(x, 1.0);
            rate.put(y, 1.0);
        }
        for (int i = 0; i < n; ++i) {
            String x = equations.get(i).get(0);
            String y = equations.get(i).get(1);
            union(x, y, values[i]);
        }
        double[] result = new double[queries.size()];
        for (int i = 0; i < queries.size(); ++i) {
            String x = queries.get(i).get(0);
            String y = queries.get(i).get(1);
            if (!root.containsKey(x) || !root.containsKey(y)) {
                result[i] = -1;
                continue;
            }
            String rootX = findRoot(x, x, 1.0);
            String rootY = findRoot(y, y, 1.0);
            result[i] = rootX.equals(rootY) ? rate.get(x) / rate.get(y) : -1.0;
        }
        return result;
    }

    private void union(String x, String y, double v) {
        String rootX = findRoot(x, x, 1.0);
        String rootY = findRoot(y, y, 1.0);
        root.put(rootX, rootY);
        double r1 = rate.get(x);
        double r2 = rate.get(y);
        rate.put(rootX, v * r2 / r1);
    }

    private String findRoot(String originalX, String x, double r) {
        if (root.get(x).equals(x)) {
            root.put(originalX, x);
            rate.put(originalX, r * rate.get(x));
            return x;
        }
        return findRoot(originalX, root.get(x), r * rate.get(x));
    }
}
