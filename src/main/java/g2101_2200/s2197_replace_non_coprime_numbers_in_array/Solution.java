package g2101_2200.s2197_replace_non_coprime_numbers_in_array;

// #Hard #Array #Math #Stack #Number_Theory #2022_06_06_Time_60_ms_(85.52%)_Space_88.9_MB_(80.09%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("java:S2234")
public class Solution {
    //introducing explaining variable refactoring technique
    public List<Integer> replaceNonCoprimes(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        int currentIndex = 1;
        result.add(nums[0]);
        while (currentIndex < nums.length) {
            int previousNumber = result.get(result.size() - 1);
            int currentNumber = nums[currentIndex];
            int gcd = gcd(previousNumber, currentNumber);
            boolean numbersAreNotCoprime = gcd > 1;
            if (numbersAreNotCoprime) {
                long lcm = ((long) previousNumber * (long) currentNumber) / gcd;
                if (!result.isEmpty()) {
                    result.remove(result.size() - 1);
                }
                result.add((int) lcm);
                recursivelyCheck(result);
            } else {
                result.add(currentNumber);
            }
            currentIndex++;
        }
        return result;
    }

    private int gcd(int a, int b) {
        if (a > b) {
            return gcd(b, a);
        }
        if (b % a == 0) {
            return a;
        }
        return gcd(b % a, a);
    }

    private void recursivelyCheck(ArrayList<Integer> list) {
        if (list.size() < 2) {
            return;
        }
        int a = list.remove(list.size() - 1);
        int b = list.remove(list.size() - 1);
        int gcd = gcd(a, b);
        if (gcd > 1) {
            long lcm = ((long) (a) * (long) (b)) / gcd;
            list.add((int) lcm);
            recursivelyCheck(list);
        } else {
            list.add(b);
            list.add(a);
        }
    }
}
