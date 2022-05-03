package g1801_1900.s1896_minimum_cost_to_change_the_final_value_of_expression;

// #Hard #String #Dynamic_Programming #Math #Stack
// #2022_05_03_Time_29_ms_(95.24%)_Space_63.8_MB_(77.78%)

public class Solution {
    private static class Result {
        int val;
        int minFlips;

        public Result(int val, int minFlips) {
            this.val = val;
            this.minFlips = minFlips;
        }
    }

    private int cur;

    public int minOperationsToFlip(String expression) {
        cur = 0;
        return term(expression).minFlips;
    }

    private Result term(String s) {
        Result res = factor(s);
        while (cur < s.length() && (s.charAt(cur) == '|' || s.charAt(cur) == '&')) {
            char c = s.charAt(cur);
            cur++;
            if (c == '|') {
                res = or(res, factor(s));
            } else {
                res = and(res, factor(s));
            }
        }
        return res;
    }

    private Result factor(String s) {
        if (s.charAt(cur) == '(') {
            cur++;
            Result res = term(s);
            cur++;
            return res;
        }
        return number(s);
    }

    private Result number(String s) {
        if (s.charAt(cur) == '1') {
            cur++;
            return new Result(1, 1);
        } else {
            cur++;
            return new Result(0, 1);
        }
    }

    private Result or(Result res1, Result res2) {
        if (res1.val + res2.val == 0) {
            return new Result(0, Math.min(res1.minFlips, res2.minFlips));
        } else if (res1.val + res2.val == 2) {
            return new Result(1, 1 + Math.min(res1.minFlips, res2.minFlips));
        } else {
            return new Result(1, 1);
        }
    }

    private Result and(Result res1, Result res2) {
        if (res1.val + res2.val == 0) {
            return new Result(0, 1 + Math.min(res1.minFlips, res2.minFlips));
        } else if (res1.val + res2.val == 2) {
            return new Result(1, Math.min(res1.minFlips, res2.minFlips));
        } else {
            return new Result(0, 1);
        }
    }
}
