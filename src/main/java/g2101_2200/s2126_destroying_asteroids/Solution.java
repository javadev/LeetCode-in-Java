package g2101_2200.s2126_destroying_asteroids;

// #Medium #Array #Sorting #Greedy #2022_06_08_Time_6_ms_(99.27%)_Space_54.1_MB_(97.81%)

public class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        return helper(mass, 0, asteroids);
    }

    private boolean helper(long mass, int startIndex, int[] asteroids) {
        int smallOrEqualIndex = partition(mass, startIndex, asteroids);
        if (smallOrEqualIndex < startIndex) {
            return false;
        }
        if (smallOrEqualIndex >= asteroids.length - 1) {
            return true;
        }
        for (int i = startIndex; i <= smallOrEqualIndex; ++i) {
            mass += asteroids[i];
        }
        return helper(mass, ++smallOrEqualIndex, asteroids);
    }

    private int partition(long mass, int startIndex, int[] asteroids) {
        int length = asteroids.length;
        int smallOrEqualIndex = startIndex - 1;
        for (int i = startIndex; i < length; ++i) {
            if (asteroids[i] <= mass) {
                smallOrEqualIndex++;
                swap(asteroids, i, smallOrEqualIndex);
            }
        }
        return smallOrEqualIndex;
    }

    private void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}
