package g1401_1500.s1432_max_difference_you_can_get_from_changing_an_integer;

// #Medium #Math #Greedy #2022_03_28_Time_2_ms_(65.28%)_Space_42.1_MB_(13.89%)

public class Solution {
    public int maxDiff(int num) {
        int smallest = getSmallest(num);
        int biggest = getBiggest(num);
        return biggest - smallest;
    }

    private int getBiggest(int num) {
        int firstDigit = Integer.parseInt(Integer.toString(num).substring(0, 1));
        if (firstDigit == 9) {
            String remainder = Integer.toString(num).substring(1);
            int numberToChangeToNine = 0;
            for (char c : remainder.toCharArray()) {
                if (c != '9') {
                    numberToChangeToNine = Integer.parseInt("" + c);
                    break;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append('9');
            for (char c : remainder.toCharArray()) {
                if (Integer.parseInt(c + "") == numberToChangeToNine) {
                    sb.append("9");
                } else {
                    sb.append(c);
                }
            }
            return Integer.parseInt(sb.toString());
        } else {
            StringBuilder sb = new StringBuilder();
            for (char c : Integer.toString(num).toCharArray()) {
                if (Integer.parseInt("" + c) == firstDigit) {
                    sb.append("9");
                } else {
                    sb.append(c);
                }
            }
            return Integer.parseInt(sb.toString());
        }
    }

    private int getSmallest(int num) {
        int firstDigit = Integer.parseInt(Integer.toString(num).substring(0, 1));
        if (firstDigit == 1) {
            String remainder = Integer.toString(num).substring(1);
            int numberToChangeToZero = 0;
            for (char c : remainder.toCharArray()) {
                if (c != '0' && c != '1') {
                    numberToChangeToZero = Integer.parseInt("" + c);
                    break;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append('1');
            for (char c : remainder.toCharArray()) {
                if (Integer.parseInt(c + "") == numberToChangeToZero) {
                    sb.append("0");
                } else {
                    sb.append(c);
                }
            }
            return Integer.parseInt(sb.toString());
        } else {
            StringBuilder sb = new StringBuilder();
            for (char c : Integer.toString(num).toCharArray()) {
                if (Integer.parseInt("" + c) == firstDigit) {
                    sb.append("1");
                } else {
                    sb.append(c);
                }
            }
            return Integer.parseInt(sb.toString());
        }
    }
}
