package g2201_2300.s2232_minimize_result_by_adding_parentheses_to_expression;

// #Medium #String #Enumeration #2022_06_12_Time_1_ms_(99.60%)_Space_40.1_MB_(100.00%)

public class Solution {
    // Variables for final solution, to avoid create combination Strings
    private int currentLeft = 0;
    private int currentRight = 0;
    private int currentMin = Integer.MAX_VALUE;

    public String minimizeResult(String expression) {
        // Identify our starting point, to apply the expansion technique
        int plusIndex = expression.indexOf("+");
        // We start expanding from the first values to the left and right of the center (plus sign).
        expand(plusIndex - 1, plusIndex + 1, expression);
        // Build the final String. We add the parentheses to our expression in the already
        // calculated indices, defined as global variables.
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < expression.length(); i++) {
            if (i == currentLeft) {
                stringBuilder.append('(');
            }
            stringBuilder.append(expression.charAt(i));
            if (i == currentRight) {
                stringBuilder.append(')');
            }
        }
        return stringBuilder.toString();
    }

    // With this function, we calculate all possible combinations of parentheses from two pointers,
    // left and right.
    private void expand(int left, int right, String expression) {
        if (left < 0 || right >= expression.length()) {
            return;
        }
        // from zero to first parentheses
        int a = evaluate(0, left, expression);
        // from first parentheses to right parentheses (+1 means inclusive)
        int b = evaluate(left, right + 1, expression);
        // from right parentheses to the end of expression (+1 means inclusive)
        int c = evaluate(right + 1, expression.length(), expression);
        // If the expression a * b * c is less than our current minimum
        // this is our solution, we replace the variables with these new values.
        if ((a * b * c) < currentMin) {
            currentMin = a * b * c;
            currentLeft = left;
            currentRight = right;
        }
        // Move parentheses left only
        expand(left - 1, right, expression);
        // Move parentheses right only
        expand(left, right + 1, expression);
        // Move parentheses left and right
        expand(left - 1, right + 1, expression);
    }

    /* This function is responsible for calculating the expressions of each variable.

    a = (0, left) // from the start of the expression to the first parentheses
    b = (left, right) // between parentheses, include plus sign
    c = (right, end of expression) // from the last parentheses to the end
    */
    private int evaluate(int left, int right, String expression) {
        // This means that the parentheses are at the beginning or end of the expression and are
        // equal to the range of the expression to be evaluated. Return 1 to avoid zero factors in
        // equation (a * b * c).
        if (left == right) {
            return 1;
        }
        int number = 0;
        for (int i = left; i < right; i++) {
            // If we find a sign, we must add both parts, therefore, we convert the expression to (a
            // + b).
            // We return the variable (a) wich is (number) and add to what follows after the sign (i
            // + 1).
            // We call the same function to calculate the b value.
            if (expression.charAt(i) == '+') {
                return number + evaluate(i + 1, right, expression);
            } else {
                number = (number * 10) + (expression.charAt(i) - '0');
            }
        }
        return number;
    }
}
