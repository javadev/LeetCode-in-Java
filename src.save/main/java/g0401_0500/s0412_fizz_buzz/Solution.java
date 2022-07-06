package g0401_0500.s0412_fizz_buzz;

// #Easy #Top_Interview_Questions #String #Math #Simulation #Udemy_Integers
// #2022_03_18_Time_3_ms_(32.80%)_Space_49_MB_(8.43%)

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(Integer.toString(i));
            }
        }
        return result;
    }
}
