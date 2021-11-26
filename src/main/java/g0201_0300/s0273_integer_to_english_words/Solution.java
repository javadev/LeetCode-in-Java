package g0201_0300.s0273_integer_to_english_words;

public class Solution {

    String[] ones = {
        "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine "
    };
    String[] teens = {
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
    String[] twenties = {
        "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "
    };

    String zero = "Zero";
    String hundred = "Hundred ";
    String thousand = "Thousand ";
    String million = "Million ";
    String billion = "Billion ";

    public String numberToWords(int num) {
        if (num == 0) {
            return zero;
        }

        StringBuilder sb = new StringBuilder();

        processThreeDigits(sb, num / 1_000_000_000, billion);
        processThreeDigits(sb, num / 1_000_000, million);
        processThreeDigits(sb, num / 1_000, thousand);
        processThreeDigits(sb, num, null);

        return sb.toString().trim();
    }

    private void processThreeDigits(StringBuilder sb, int input, String name) {
        int threeDigit = input % 1000;

        if (threeDigit > 0) {
            if (threeDigit / 100 > 0) {
                sb.append(ones[threeDigit / 100 - 1]);
                sb.append(hundred);
            }

            if (threeDigit % 100 >= 20) {
                sb.append(twenties[(threeDigit % 100) / 10 - 2]);
                if (threeDigit % 10 > 0) {
                    sb.append(ones[threeDigit % 10 - 1]);
                }
            } else if (threeDigit % 100 >= 10 && threeDigit % 100 < 20) {
                sb.append(teens[threeDigit % 10]);
            } else if (threeDigit % 100 > 0 && threeDigit % 100 < 10) {
                sb.append(ones[threeDigit % 10 - 1]);
            }

            if (name != null) {
                sb.append(name);
            }
        }
    }
}
