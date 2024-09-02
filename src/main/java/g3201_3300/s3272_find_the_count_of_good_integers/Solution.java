package g3201_3300.s3272_find_the_count_of_good_integers;

// #Hard #2024_09_02_Time_167_ms_(100.00%)_Space_54.5_MB_(100.00%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
    private List<String> palindromes = new ArrayList<>();

    private long factorial(int n) {
        long res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    private Map<Character, Integer> countDigits(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        return freq;
    }

    private long calculatePermutations(Map<Character, Integer> freq, int length) {
        long totalPermutations = factorial(length);
        for (int count : freq.values()) {
            totalPermutations /= factorial(count);
        }
        return totalPermutations;
    }

    private long calculateValidPermutations(String s) {
        Map<Character, Integer> freq = countDigits(s);
        int n = s.length();
        long totalPermutations = calculatePermutations(freq, n);
        if (freq.getOrDefault('0', 0) > 0) {
            freq.put('0', freq.get('0') - 1);
            long invalidPermutations = calculatePermutations(freq, n - 1);
            totalPermutations -= invalidPermutations;
        }

        return totalPermutations;
    }

    private void generatePalindromes(
            int f, int r, int k, int lb, int sum, StringBuilder ans, int[] rem) {
        if (f > r) {
            if (sum == 0) {
                palindromes.add(ans.toString());
            }
            return;
        }
        for (int i = lb; i <= 9; i++) {
            ans.setCharAt(f, (char) ('0' + i));
            ans.setCharAt(r, (char) ('0' + i));
            int chk = sum;
            chk = (chk + rem[f] * i) % k;
            if (f != r) {
                chk = (chk + rem[r] * i) % k;
            }
            generatePalindromes(f + 1, r - 1, k, 0, chk, ans, rem);
        }
    }

    private List<String> allKPalindromes(int n, int k) {
        StringBuilder ans = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            ans.append('0');
        }
        int[] rem = new int[n];
        rem[0] = 1;
        for (int i = 1; i < n; i++) {
            rem[i] = (rem[i - 1] * 10) % k;
        }

        palindromes.clear();
        generatePalindromes(0, n - 1, k, 1, 0, ans, rem);

        return palindromes;
    }

    public long countGoodIntegers(int n, int k) {
        List<String> ans = allKPalindromes(n, k);
        Set<String> st = new HashSet<>();
        for (String str : ans) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            st.add(new String(arr));
        }

        List<String> v = new ArrayList<>(st);
        long chk = 0;
        for (String str : v) {
            long cc = calculateValidPermutations(str);
            chk += cc;
        }
        return chk;
    }
}
