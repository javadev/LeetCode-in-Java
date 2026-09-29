package g3901_4000.s3941_password_strength;

// #Medium #String #Hash_Table #Senior #Weekly_Contest_503
// #2026_09_29_Time_2_ms_(100.00%)_Space_47.21_MB_(40.64%)

public class Solution {
    public int passwordStrength(String password) {
        int strength = 0;
        boolean[] present = new boolean[256];
        for (int i = 0; i < password.length(); i++) {
            present[password.charAt(i)] = true;
        }
        for (int i = 97; i <= 122; i++) {
            if (present[i]) {
                strength++;
            }
        }
        for (int i = 65; i <= 90; i++) {
            if (present[i]) {
                strength += 2;
            }
        }
        for (int i = 48; i <= 57; i++) {
            if (present[i]) {
                strength += 3;
            }
        }
        if (present['!']) {
            strength += 5;
        }
        if (present['@']) {
            strength += 5;
        }
        if (present['#']) {
            strength += 5;
        }
        if (present['$']) {
            strength += 5;
        }
        return strength;
    }
}
