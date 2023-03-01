package g2401_2500.s2483_minimum_penalty_for_a_shop;

// #Medium #String #Prefix_Sum #2023_01_25_Time_17_ms_(69.62%)_Space_43.8_MB_(77.08%)

public class Solution {
    public int bestClosingTime(String customers) {
        int[] yes = new int[customers.length() + 1];
        int[] no = new int[customers.length() + 1];
        int count = 0;
        for (int i = customers.length() - 1; i >= 0; i--) {
            if (customers.charAt(i) == 'Y') {
                count++;
            }
            yes[i] = count;
        }
        count = 0;
        for (int i = 0; i < customers.length(); i++) {
            if (customers.charAt(i) == 'N') {
                count++;
            }
            no[i + 1] = count;
        }
        int min = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0; i < yes.length; i++) {
            int sum = yes[i] + no[i];
            if (min > sum) {
                min = sum;
                res = i;
            }
        }
        return res;
    }
}
