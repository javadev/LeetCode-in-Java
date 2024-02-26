package g3001_3100.s3006_find_beautiful_indices_in_the_given_array_i;

// #Medium #String #Binary_Search #Two_Pointers #Hash_Function #String_Matching #Rolling_Hash
// #2024_02_26_Time_8_ms_(95.86%)_Space_45.8_MB_(80.19%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("java:S6541")
public class Solution {
    public List<Integer> beautifulIndices(String s, String a, String b, int q) {
        char[] sc = s.toCharArray();
        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();
        int[] lpsa = getLps(ac);
        int[] lpsb = getLps(bc);
        int mo;
        int[] comp = new int[sc.length];
        int[] st = new int[sc.length];
        int si = 0;
        int k;
        mo = -bc.length + 1;
        if (bc[0] == sc[0]) {
            comp[0] = 1;
            if (bc.length == 1) {
                st[si++] = mo;
            }
        }
        for (int i = 1; i < comp.length; i++) {
            mo++;
            if (sc[i] == bc[0]) {
                comp[i] = 1;
            }
            k = comp[i - 1];
            if (k == bc.length) {
                k = lpsb[k - 1];
            }
            while (k > 0) {
                if (bc[k] == sc[i]) {
                    comp[i] = k + 1;
                    break;
                }
                k = lpsb[k - 1];
            }
            if (comp[i] == bc.length) {
                st[si++] = mo;
            }
        }
        int sia = 0;
        mo = -ac.length + 1;
        List<Integer> ret = new ArrayList<>();
        if (si == 0) {
            return ret;
        }
        if (sc[0] == ac[0]) {
            comp[0] = 1;
            if (ac.length == 1 && st[0] <= q) {
                ret.add(0);
            }
        } else {
            comp[0] = 0;
        }
        for (int i = 1; i < comp.length; i++) {
            mo++;
            if (sc[i] == ac[0]) {
                comp[i] = 1;
            } else {
                comp[i] = 0;
            }
            k = comp[i - 1];
            if (k == ac.length) {
                k = lpsa[k - 1];
            }
            while (k > 0) {
                if (ac[k] == sc[i]) {
                    comp[i] = k + 1;
                    break;
                }
                k = lpsa[k - 1];
            }
            if (comp[i] == ac.length) {
                while (sia < si && st[sia] + q < mo) {
                    sia++;
                }
                if (sia == si) {
                    break;
                }
                if (mo >= st[sia] - q && mo <= st[sia] + q) {
                    ret.add(mo);
                }
            }
        }
        return ret;
    }

    private int[] getLps(char[] xc) {
        int[] r = new int[xc.length];
        int k;
        for (int i = 1; i < xc.length; i++) {
            if (xc[i] == xc[0]) {
                r[i] = 1;
            }
            k = r[i - 1];
            while (k > 0) {
                if (xc[k] == xc[i]) {
                    r[i] = k + 1;
                    break;
                }
                k = r[k - 1];
            }
        }
        return r;
    }
}
