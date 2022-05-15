package g0101_0200.s0168_excel_sheet_column_title;

// #Easy #String #Math #Acceptance_34.0% #2022_03_04_Time_0_ms_(100.00%)_Space_40.7_MB_(51.16%)

public class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            int remainder = n % 26;
            if (remainder == 0) {
                remainder += 26;
            }
            if (n >= remainder) {
                n -= remainder;
                sb.append((char) (remainder + 64));
            }
            n /= 26;
        }
        return sb.reverse().toString();
    }
}
