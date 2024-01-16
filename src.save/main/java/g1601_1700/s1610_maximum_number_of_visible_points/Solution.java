package g1601_1700.s1610_maximum_number_of_visible_points;

// #Hard #Array #Math #Sorting #Sliding_Window #Geometry
// #2022_04_12_Time_122_ms_(97.44%)_Space_86.3_MB_(94.58%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int visiblePoints(List<List<Integer>> points, int angle, List<Integer> location) {
        int max = 0;
        int count = 0;
        List<Double> angles = new ArrayList<>(points.size());
        for (List<Integer> point : points) {
            double a = calculateAngle(location, point);
            if (a == 360.0) {
                count++;
            } else {
                angles.add(a);
            }
        }
        Collections.sort(angles);
        int s = 0;
        int e = 0;
        int size;
        int n = angles.size();
        while (s < n && max < n) {
            while (true) {
                int index = (e + 1) % n;
                if (s == index || (360 + angles.get(index) - angles.get(s)) % 360 > angle) {
                    break;
                }
                e = index;
            }
            size = e >= s ? (e - s + 1) : (n - s + e + 1);
            max = Math.max(max, size);
            if (e == s) {
                e++;
            }
            s++;
        }
        return max + count;
    }

    private double calculateAngle(List<Integer> location, List<Integer> point) {
        int x1 = location.get(0);
        int y1 = location.get(1);
        int x2 = point.get(0);
        int y2 = point.get(1);
        if (x1 == x2) {
            if (y2 > y1) {
                return 90.0;
            }
            if (y2 < y1) {
                return 270.0;
            }
            return 360.0;
        }
        double angle = Math.toDegrees(Math.atan((double) (y2 - y1) / (x2 - x1)));
        if (x2 > x1) {
            angle = (angle + 360.0) % 360.0;
        } else {
            angle += 180.0;
        }
        return angle;
    }
}
