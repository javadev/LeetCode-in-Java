package g0401_0500.s0482_license_key_formatting;

// #Easy #String

public class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        int occ = 0;
        for (char c : s.toCharArray()) {
            if (c == '-') {
                continue;
            }
            cnt++;
        }
        int l = cnt % k;
        for (char c : s.toCharArray()) {
            if (c == '-') {
                continue;
            }
            if (occ == k) {
                occ = 0;
                sb.append('-');
            } else if (occ == l && l != 0) {
                l = 0;
                occ = 0;
                sb.append('-');
            }
            sb.append(Character.toUpperCase(c));
            occ++;
        }
        return sb.toString();
    }
}