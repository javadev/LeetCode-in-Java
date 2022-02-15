package g0901_1000.s0970_powerful_integers;

// #Medium #Hash_Table #Math

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        int i_bound = (x == 1 ? 1 : (int) (Math.log10(bound) / Math.log10(x)));
        int j_bound = (y == 1 ? 1 : (int) (Math.log10(bound) / Math.log10(y)));
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i <= i_bound; i++)
            for (int j = 0; j <= j_bound; j++) {
                int number = (int) (Math.pow(x, i) + Math.pow(y, j));
                if (number <= bound) set.add(number);
            }
        return new ArrayList<>(set);
    }
}
