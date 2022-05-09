package g1801_1900.s1894_find_the_student_that_will_replace_the_chalk;

// #Medium #Array #Binary_Search #Simulation #Prefix_Sum #Binary_Search_II_Day_2
// #2022_05_09_Time_2_ms_(76.67%)_Space_55.6_MB_(67.06%)

public class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long localSum = sum(chalk);
        int currentIndex = 0;
        if (localSum != 0) {
            int localK = (int) (k % localSum);
            while (chalk[currentIndex] <= localK) {
                localK -= chalk[currentIndex++];
            }
        }
        return currentIndex;
    }

    private long sum(int[] chalk) {
        long sum = 0;
        for (int i : chalk) {
            sum += i;
        }
        return sum;
    }
}
