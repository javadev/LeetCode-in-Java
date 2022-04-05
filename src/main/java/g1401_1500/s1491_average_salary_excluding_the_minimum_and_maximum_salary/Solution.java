package g1401_1500.s1491_average_salary_excluding_the_minimum_and_maximum_salary;

// #Easy #Array #Sorting #Programming_Skills_I_Day_1_Basic_Data_Type
// #2022_04_05_Time_0_ms_(100.00%)_Space_42.1_MB_(23.90%)

public class Solution {
    public double average(int[] salary) {
        int n = salary.length;
        int min = salary[0];
        int max = salary[0];
        int sum = salary[0];
        for (int i = 1; i < n; ++i) {
            if (salary[i] < min) {
                min = salary[i];
            } else if (salary[i] > max) {
                max = salary[i];
            }
            sum += salary[i];
        }
        return (double) (sum - min - max) / (n - 2);
    }
}
