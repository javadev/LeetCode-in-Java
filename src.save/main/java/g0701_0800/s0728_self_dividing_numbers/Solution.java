package g0701_0800.s0728_self_dividing_numbers;

// #Easy #Math

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDividingNumbers = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int num = i;
            boolean dividing = false;
            if (num % 10 != 0) {
                while (num > 0) {
                    int temp = num % 10;
                    if (i % temp == 0) {
                        dividing = true;
                    } else {
                        dividing = false;
                        break;
                    }
                    num = num / 10;
                }
                if (dividing) {
                    selfDividingNumbers.add(i);
                }
            }
        }
        return selfDividingNumbers;
    }
}
