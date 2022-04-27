package g0701_0800.s0770_basic_calculator_iv;

// #Hard #String #Hash_Table #Math #Stack #Recursion
// #2022_03_26_Time_17_ms_(66.18%)_Space_45.8_MB_(60.29%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@SuppressWarnings("java:S1104")
public class Solution {
    public List<String> basicCalculatorIV(String expression, String[] evalvars, int[] evalints) {
        Map<String, Integer> knownVars = new HashMap<>();
        for (int i = 0; i < evalvars.length; i++) {
            knownVars.put(evalvars[i], evalints[i]);
        }
        LinkedList<Expr> expressions = new LinkedList<>();
        LinkedList<String> ops = new LinkedList<>();
        for (String token : parseExpression(expression)) {
            if (Character.isDigit(token.charAt(0))) {
                expressions.push(new Expr("", Integer.parseInt(token)));
            } else if (token.equals("(")) {
                ops.push("(");
            } else if (token.equals(")")) {
                while (!ops.peek().equals("(")) {
                    doOneEval(ops, expressions);
                }
                ops.pop();
            } else if (token.equals("+") || token.equals("-") || token.equals("*")) {
                int rank = getRank(token);
                while (!ops.isEmpty() && !ops.peek().equals("(") && getRank(ops.peek()) >= rank) {
                    doOneEval(ops, expressions);
                }
                ops.push(token);
            } else if (knownVars.containsKey(token)) {
                expressions.push(new Expr("", knownVars.get(token)));
            } else {
                expressions.push(new Expr(token, 1));
            }
        }
        while (!ops.isEmpty()) {
            doOneEval(ops, expressions);
        }
        Expr expr = expressions.peek();
        List<String> output = new ArrayList<>();
        for (String term : expr.terms.keySet()) {
            if (expr.terms.get(term) != 0) {
                output.add("" + expr.terms.get(term) + (term.equals("") ? "" : "*" + term));
            }
        }
        output.sort(
                (a, b) -> {
                    int aStar = 0;
                    int bStar = 0;
                    for (int i = 0; i < a.length(); i++) {
                        if (a.charAt(i) == '*') {
                            aStar++;
                        }
                    }
                    for (int i = 0; i < b.length(); i++) {
                        if (b.charAt(i) == '*') {
                            bStar++;
                        }
                    }
                    if (aStar != bStar) {
                        return bStar - aStar;
                    }
                    return a.split("\\*", 2)[1].compareTo(b.split("\\*", 2)[1]);
                });
        return output;
    }

    private int getRank(String op) {
        if (op.equals("+") || op.equals("-")) {
            return 1;
        }
        // *
        return 2;
    }

    private List<String> parseExpression(String s) {
        List<String> output = new ArrayList<>();
        for (String token : s.split(" ")) {
            int opening = 0;
            for (; token.charAt(opening) == '('; opening++) {
                output.add("(");
            }
            int closing = 0;
            while (token.charAt(token.length() - 1 - closing) == ')') {
                closing++;
            }
            output.add(token.substring(opening, token.length() - closing));
            while (closing-- > 0) {
                output.add(")");
            }
        }
        return output;
    }

    private void doOneEval(LinkedList<String> ops, LinkedList<Expr> expressions) {
        Expr e2 = expressions.pop();
        Expr e1 = expressions.pop();
        Expr res = new Expr("", 0);
        String op = ops.pop();
        if (op.equals("+") || op.equals("-")) {
            int sign = op.equals("-") ? -1 : 1;
            res.terms = e1.terms;
            for (String term : e2.terms.keySet()) {
                res.terms.put(term, sign * e2.terms.get(term) + res.terms.getOrDefault(term, 0));
            }
        } else {
            // *
            for (String t1 : e1.terms.keySet()) {
                for (String t2 : e2.terms.keySet()) {
                    String resTerm = generateTerm(t1, t2);
                    res.terms.put(
                            resTerm,
                            e1.terms.get(t1) * e2.terms.get(t2)
                                    + res.terms.getOrDefault(resTerm, 0));
                }
            }
        }
        expressions.push(res);
    }

    private String generateTerm(String t1, String t2) {
        if (t1.equals("")) {
            return t2;
        }
        if (t2.equals("")) {
            return t1;
        }
        List<String> parts = new ArrayList<>();
        Collections.addAll(parts, t1.split("\\*"));
        Collections.addAll(parts, t2.split("\\*"));
        Collections.sort(parts);
        StringBuilder sb = new StringBuilder();
        for (String part : parts) {
            sb.append(part + "*");
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    private static class Expr {
        public Map<String, Integer> terms;

        public Expr(String term, int val) {
            terms = new HashMap<>();
            terms.put(term, val);
        }
    }
}
