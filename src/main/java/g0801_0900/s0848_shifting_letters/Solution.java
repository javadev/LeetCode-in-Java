package g0801_0900.s0848_shifting_letters;

// #Medium #Array #String

public class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n = shifts.length;
        int runningSum = 0;
        for (int i = n - 1; i >= 0; i--) {
            shifts[i] = (shifts[i] + runningSum) % 26;
            runningSum = shifts[i];
        }
        StringBuilder str = new StringBuilder();
        int i = 0;
        for (char c : s.toCharArray()) {
            int correctShift = (c - 'a' + shifts[i]) % 26;
            str.append((char) ('a' + correctShift));
            i++;
        }
        return str.toString();
    }
}
