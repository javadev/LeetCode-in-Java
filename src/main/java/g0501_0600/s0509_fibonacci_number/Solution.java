package g0501_0600.s0509_fibonacci_number;

// #Easy #Dynamic_Programming #Math #Recursion #Memoization

import java.util.ArrayList;
import java.util.List;

public class Solution {
    /*
     * Time: O(n)
     * Space: O(n)
     */
    public int fib(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for (int i = 2; i <= n; i++) {
            list.add(list.get(i - 1) + list.get(i - 2));
        }
        return list.get(n);
    }
}
