package g3401_3500.s3484_design_spreadsheet;

// #Medium #2025_03_16_Time_109_ms_(100.00%)_Space_56.41_MB_(100.00%)

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unused")
public class Spreadsheet {
    private final Map<String, Integer> data = new HashMap<>();

    public Spreadsheet(int rows) {}

    public void setCell(String cell, int value) {
        data.put(cell, value);
    }

    public void resetCell(String cell) {
        data.put(cell, 0);
    }

    public int getValue(String formula) {
        int index = formula.indexOf('+');
        String left = formula.substring(1, index);
        String right = formula.substring(index + 1);
        int x =
                Character.isLetter(left.charAt(0))
                        ? data.getOrDefault(left, 0)
                        : Integer.parseInt(left);
        int y =
                Character.isLetter(right.charAt(0))
                        ? data.getOrDefault(right, 0)
                        : Integer.parseInt(right);
        return x + y;
    }
}

/*
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */
