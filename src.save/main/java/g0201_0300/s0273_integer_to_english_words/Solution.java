package g0201_0300.s0273_integer_to_english_words;

// #Hard #String #Math #Recursion #Udemy_Strings
// #2022_07_06_Time_3_ms_(95.67%)_Space_40.6_MB_(97.59%)

import java.util.StringJoiner;

public class Solution {
    private String[] ones = {
        "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine "
    };
    private String[] teens = {
        "Ten ",
        "Eleven ",
        "Twelve ",
        "Thirteen ",
        "Fourteen ",
        "Fifteen ",
        "Sixteen ",
        "Seventeen ",
        "Eighteen ",
        "Nineteen "
    };
    private String[] twenties = {
        "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "
    };

    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        StringJoiner joiner = new StringJoiner("");
        processThreeDigits(joiner, num / 1_000_000_000, "Billion ");
        processThreeDigits(joiner, num / 1_000_000, "Million ");
        processThreeDigits(joiner, num / 1_000, "Thousand ");
        processThreeDigits(joiner, num, null);
        return joiner.toString().trim();
    }

    private void processThreeDigits(StringJoiner joiner, int input, String name) {
        int threeDigit = input % 1000;
        if (threeDigit > 0) {
            if (threeDigit / 100 > 0) {
                joiner.add(ones[threeDigit / 100 - 1]);
                String hundred = "Hundred ";
                joiner.add(hundred);
            }
            if (threeDigit % 100 >= 20) {
                joiner.add(twenties[(threeDigit % 100) / 10 - 2]);
                if (threeDigit % 10 > 0) {
                    joiner.add(ones[threeDigit % 10 - 1]);
                }
            } else if (threeDigit % 100 >= 10 && threeDigit % 100 < 20) {
                joiner.add(teens[threeDigit % 10]);
            } else if (threeDigit % 100 > 0 && threeDigit % 100 < 10) {
                joiner.add(ones[threeDigit % 10 - 1]);
            }
            if (name != null) {
                joiner.add(name);
            }
        }
    }
}
