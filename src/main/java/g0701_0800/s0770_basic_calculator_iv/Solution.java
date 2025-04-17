package g0701_0800.s0770_basic_calculator_iv;

// #Hard #String #Hash_Table #Math #Stack #Recursion
// #2025_04_17_Time_8_ms_(95.70%)_Space_45.18_MB_(49.46%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    private String s;
    private char[] arr;
    private int[] braces;
    private final Map<String, Integer> variables = new HashMap<>();

    public List<String> basicCalculatorIV(String expression, String[] evalvars, int[] evalints) {
        s = expression;
        arr = s.toCharArray();
        int n = arr.length;
        braces = new int[n];
        Arrays.fill(braces, -1);
        int[] stack = new int[n / 2];
        int index = -1;
        for (int i = 0; i < n; ++i) {
            if (arr[i] == '(') {
                stack[++index] = i;
            } else if (arr[i] == ')') {
                int last = stack[index--];
                braces[last] = i;
                braces[i] = last;
            }
        }
        for (int i = 0; i < evalvars.length; ++i) {
            variables.put(evalvars[i], evalints[i]);
        }
        List<Term> terms = dewIt(0, n - 1);
        Map<String, Integer> map =
                new TreeMap<>(
                        new Comparator<>() {
                            public int compare(String a, String b) {
                                int ca = countStars(a);
                                int cb = countStars(b);
                                if (ca != cb) {
                                    return cb - ca;
                                } else {
                                    return a.compareTo(b);
                                }
                            }

                            private int countStars(String s) {
                                int ans = 0;
                                for (char c : s.toCharArray()) {
                                    if (c == '*') {
                                        ++ans;
                                    }
                                }
                                return ans;
                            }
                        });
        for (Term term : terms) {
            if (term.coeff != 0) {
                String key = term.getKey();
                if (map.containsKey(key)) {
                    int oldCoeff = map.get(key);
                    if (oldCoeff == -term.coeff) {
                        map.remove(key);
                    } else {
                        map.put(key, oldCoeff + term.coeff);
                    }
                } else {
                    map.put(key, term.coeff);
                }
            }
        }
        List<String> ans = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            ans.add(entry.getValue() + entry.getKey());
        }
        return ans;
    }

    private List<Term> dewIt(int a, int b) {
        if (braces[a] == b) {
            return dewIt(a + 1, b - 1);
        }
        List<Term> ans = new ArrayList<>();
        List<Term> buffer = new ArrayList<>();
        buffer.add(new Term(1, new ArrayList<>()));
        for (int i = a; i <= b; ) {
            int j = i;
            List<Term> curr;
            if (arr[i] == '(') {
                j = braces[i] + 1;
                curr = dewIt(i + 1, j - 2);
            } else {
                while (j <= b && arr[j] != ' ') {
                    ++j;
                }
                String exp = s.substring(i, j);
                int val = 1;
                List<String> vars = new ArrayList<>();
                if (variables.containsKey(exp)) {
                    val = variables.get(exp);
                } else if (exp.charAt(0) <= '9') {
                    val = Integer.parseInt(exp);
                } else {
                    vars.add(exp);
                }
                curr = new ArrayList<>();
                curr.add(new Term(val, vars));
            }
            buffer = multiply(buffer, curr);
            if (j > b || arr[j + 1] == '+' || arr[j + 1] == '-') {
                ans.addAll(buffer);
                buffer = new ArrayList<>();
            }
            if (j < b) {
                ++j;
                if (arr[j] == '+') {
                    buffer.add(new Term(1, new ArrayList<>()));
                } else if (arr[j] == '-') {
                    buffer.add(new Term(-1, new ArrayList<>()));
                }
                j += 2;
            }
            i = j;
        }
        return ans;
    }

    private List<Term> multiply(List<Term> a, List<Term> b) {
        List<Term> ans = new ArrayList<>();
        for (Term x : a) {
            for (Term y : b) {
                Term prod = x.copy();
                prod.multiply(y);
                ans.add(prod);
            }
        }
        return ans;
    }

    private static class Term {
        int coeff;
        List<String> vars;

        public Term(int a, List<String> c) {
            this.coeff = a;
            vars = new ArrayList<>();
            vars.addAll(c);
        }

        public String getKey() {
            StringBuilder b = new StringBuilder();
            Collections.sort(vars);
            for (String x : vars) {
                b.append('*');
                b.append(x);
            }
            return b.toString();
        }

        public void multiply(Term that) {
            this.coeff *= that.coeff;
            if (this.coeff == 0) {
                vars.clear();
            } else {
                this.vars.addAll(that.vars);
            }
        }

        public Term copy() {
            return new Term(coeff, vars);
        }
    }
}
