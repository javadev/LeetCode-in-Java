package g0701_0800.s0736_parse_lisp_expression;

// #Hard #String #Hash_Table #Stack #Recursion #2022_03_25_Time_4_ms_(95.58%)_Space_42_MB_(93.81%)

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Solution {
    static class Exp {
        Deque<Exp> exps;
        String op;
        Exp parent;

        public Exp(Exp from) {
            this.exps = new LinkedList<>();
            this.parent = from;
        }

        private int evaluate(Map<String, Integer> vars) {
            if (op.equalsIgnoreCase("add")) {
                return exps.pop().evaluate(vars) + exps.pop().evaluate(vars);
            } else if (op.equalsIgnoreCase("mult")) {
                return exps.pop().evaluate(vars) * exps.pop().evaluate(vars);
            } else if (op.equalsIgnoreCase("let")) {
                Map<String, Integer> nextVars = new HashMap<>(vars);
                while (exps.size() > 1) {
                    String varName = exps.pop().op;
                    int val = exps.pop().evaluate(nextVars);
                    nextVars.put(varName, val);
                }
                return exps.pop().evaluate(nextVars);
            } else {
                if (Character.isLetter(op.charAt(0))) {
                    return vars.get(op);
                } else {
                    return Integer.parseInt(op);
                }
            }
        }
    }

    private Exp buildTree(String exp) {
        Exp root = new Exp(null);
        Exp cur = root;
        int n = exp.length() - 1;
        while (n >= 0) {
            char c = exp.charAt(n);
            if (c == ')') {
                Exp next = new Exp(cur);
                cur.exps.push(next);
                cur = next;
            } else if (c == '(') {
                cur.op = cur.exps.pop().op;
                cur = cur.parent;
            } else if (c != ' ') {
                int pre = n;
                while (pre >= 0 && exp.charAt(pre) != '(' && exp.charAt(pre) != ' ') {
                    pre--;
                }
                Exp next = new Exp(cur);
                next.op = exp.substring(pre + 1, n + 1);
                cur.exps.push(next);
                n = pre + 1;
            }
            n--;
        }
        return root.exps.pop();
    }

    public int evaluate(String exp) {
        return buildTree(exp).evaluate(new HashMap<>());
    }
}
