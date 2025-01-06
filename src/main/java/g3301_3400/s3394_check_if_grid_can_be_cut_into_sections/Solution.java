package g3301_3400.s3394_check_if_grid_can_be_cut_into_sections;

// #Medium #Geometry #Line_Sweep #2025_01_06_Time_143_(30.90%)_Space_127.26_(32.16%)

import java.util.Arrays;

@SuppressWarnings({"unused", "java:S1172"})
public class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {
        int m = rectangles.length;
        int[][] xAxis = new int[m][2];
        int[][] yAxis = new int[m][2];
        int ind = 0;
        for (int[] axis : rectangles) {
            int startX = axis[0];
            int startY = axis[1];
            int endX = axis[2];
            int endY = axis[3];
            xAxis[ind] = new int[] {startX, endX};
            yAxis[ind] = new int[] {startY, endY};
            ind++;
        }
        Arrays.sort(xAxis, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        Arrays.sort(yAxis, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        int verticalCuts = findSections(xAxis);
        if (verticalCuts > 2) {
            return true;
        }
        int horizontalCuts = findSections(yAxis);
        return horizontalCuts > 2;
    }

    private int findSections(int[][] axis) {
        int end = axis[0][1];
        int sections = 1;
        for (int i = 1; i < axis.length; i++) {
            if (end > axis[i][0]) {
                end = Math.max(end, axis[i][1]);
            } else {
                sections++;
                end = axis[i][1];
            }
            if (sections > 2) {
                return sections;
            }
        }
        return sections;
    }
}
