package g3601_3700.s3606_coupon_code_validator;

// #Easy #2025_07_06_Time_6_ms_(96.45%)_Space_45.62_MB_(86.71%)

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        List<String> lt = new ArrayList<>();
        List<List<String>> lst = new ArrayList<>();
        HashSet<String> hs = new HashSet<>();
        hs.add("electronics");
        hs.add("grocery");
        hs.add("pharmacy");
        hs.add("restaurant");
        int n = code.length;
        for (int i = 0; i < n; i++) {
            if (!isActive[i]) {
                continue;
            }
            String s = businessLine[i];
            if (!hs.contains(s)) {
                continue;
            }
            String st = code[i];
            if (st.isEmpty()) {
                continue;
            }
            int a = 0;
            for (int j = 0; j < st.length(); j++) {
                char ch = st.charAt(j);
                if (!((ch == '_')
                        || (ch >= 'a' && ch <= 'z')
                        || (ch >= 'A' && ch <= 'Z')
                        || (ch >= '0' && ch <= '9'))) {
                    a = 1;
                    break;
                }
            }
            if (a == 0) {
                List<String> lst2 = new ArrayList<>();
                lst2.add(code[i]);
                lst2.add(businessLine[i]);
                lst.add(lst2);
            }
        }
        lst.sort(
                (l, m) -> {
                    if (!(l.get(1).equals(m.get(1)))) {
                        return l.get(1).compareTo(m.get(1));
                    } else {
                        return l.get(0).compareTo(m.get(0));
                    }
                });
        for (List<String> strings : lst) {
            lt.add(strings.get(0));
        }
        return lt;
    }
}
