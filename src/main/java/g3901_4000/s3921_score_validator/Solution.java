package g3901_4000.s3921_score_validator;

// #Easy #Array #String #Simulation #Mid_Level #Biweekly_Contest_182
// #2026_09_16_Time_2_ms_(91.74%)_Space_47.44_MB_(30.84%)

public class Solution {
    public int[] scoreValidator(String[] events) {
        int counter = 0;
        int score = 0;
        for (String i : events) {
            if (counter == 10) {
                break;
            }
            if (i.equals("WD")) {
                score += 1;
            } else if (i.equals("NB")) {
                score += 1;
            } else if (i.equals("W")) {
                counter += 1;
            } else {
                score += Integer.parseInt(i);
            }
        }
        return new int[] {score, counter};
    }
}
