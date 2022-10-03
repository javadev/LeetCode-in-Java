package g1801_1900.s1854_maximum_population_year;

// #Easy #Array #Counting #2022_05_10_Time_0_ms_(100.00%)_Space_42.7_MB_(24.42%)

public class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];
        for (int[] log : logs) {
            arr[log[0] - 1950]++;
            arr[log[1] - 1950]--;
        }
        for (int i = 1; i < 101; i++) {
            arr[i] += arr[i - 1];
        }
        int maxyear = 1950;
        int max = 0;
        for (int i = 0; i < 101; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxyear = i + 1950;
            }
        }
        return maxyear;
    }
}
