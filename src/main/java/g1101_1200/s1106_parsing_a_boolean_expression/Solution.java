package g1101_1200.s1106_parsing_a_boolean_expression;

// #Hard #String #Stack #Recursion #2023_06_01_Time_6_ms_(78.72%)_Space_43.7_MB_(14.89%)

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Solution {
    private String source;
    private int index;

    public boolean parseBoolExpr(String expression) {
        this.source = expression;
        this.index = 0;
        return expr();
    }

    private boolean expr() {
        boolean res;
        if (match('!')) {
            res = not();
        } else if (match('&')) {
            res = and();
        } else if (match('|')) {
            res = or();
        } else {
            res = bool();
        }
        return res;
    }

    private boolean not() {
        consume('!', "Expect '!'");
        return !group().get(0);
    }

    private boolean or() {
        consume('|', "Expect '|'");
        boolean res = false;
        for (boolean e : group()) {
            res |= e;
        }
        return res;
    }

    private boolean and() {
        consume('&', "Expect '&'");
        boolean res = true;
        for (boolean e : group()) {
            res &= e;
        }
        return res;
    }

    private List<Boolean> group() {
        consume('(', "Expect '('");
        List<Boolean> res = new ArrayList<>();
        while (!match(')')) {
            res.add(expr());
            if (match(',')) {
                advance();
            }
        }
        consume(')', "Expect ')'");
        return res;
    }

    private boolean bool() {
        boolean isTrue = match('t');
        advance();
        return isTrue;
    }

    private boolean isAtEnd() {
        return index >= source.length();
    }

    private void advance() {
        if (isAtEnd()) {
            return;
        }
        index++;
    }

    private char peek() {
        return source.charAt(index);
    }

    private boolean match(char ch) {
        if (isAtEnd()) {
            return false;
        }
        return peek() == ch;
    }

    private void consume(char ch, String message) {
        if (!match(ch)) {
            Logger.getLogger(Solution.class.getName()).log(Level.SEVERE, () -> message);
            return;
        }
        advance();
    }
}
