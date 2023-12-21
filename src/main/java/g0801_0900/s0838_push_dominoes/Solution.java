package g0801_0900.s0838_push_dominoes;

// #Medium #String #Dynamic_Programming #Two_Pointers
// #2022_03_24_Time_21_ms_(73.78%)_Space_54.4_MB_(50.10%)

public class Solution {
    public String pushDominoes(String dominoes) {
        char[] ch = new char[dominoes.length() + 2];
        ch[0] = 'L';
        ch[ch.length - 1] = 'R';
        for (int k = 1; k < ch.length - 1; k++) {
            ch[k] = dominoes.charAt(k - 1);
        }
        int i = 0;
        int j = 1;
        while (j < ch.length) {
            while (ch[j] == '.') {
                j++;
            }
            if (ch[i] == 'L' && ch[j] == 'L') {
                while (i != j) {
                    ch[i] = 'L';
                    i++;
                }
                j++;
            } else if (ch[i] == 'R' && ch[j] == 'R') {
                while (i != j) {
                    ch[i] = 'R';
                    i++;
                }
                j++;
            } else if (ch[i] == 'L' && ch[j] == 'R') {
                i = j;
                j++;
            } else if (ch[i] == 'R' && ch[j] == 'L') {
                int rTemp = i + 1;
                int lTemp = j - 1;
                while (rTemp < lTemp) {
                    ch[rTemp] = 'R';
                    ch[lTemp] = 'L';
                    rTemp++;
                    lTemp--;
                }
                i = j;
                j++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int k = 1; k < ch.length - 1; k++) {
            sb.append(ch[k]);
        }
        return sb.toString();
    }
}
