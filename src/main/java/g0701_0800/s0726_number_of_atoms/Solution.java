package g0701_0800.s0726_number_of_atoms;

// #Hard #String #Hash_Table #Sorting #Stack #2022_03_24_Time_4_ms_(87.22%)_Space_42.7_MB_(28.23%)

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

@SuppressWarnings({"java:S135", "java:S1149"})
public class Solution {
    private boolean isLower(char c) {
        return c >= 97 && c <= 122;
    }

    private boolean isDigit(char c) {
        return c >= 48 && c <= 57;
    }

    public String countOfAtoms(String formula) {
        int product = 1;
        Stack<Integer> mlrStack = new Stack<>();
        Map<String, Integer> count = new HashMap<>();
        int i = formula.length() - 1;
        while (i >= 0) {
            char c = formula.charAt(i);
            if (c == '(') {
                product /= mlrStack.pop();
                i--;
                continue;
            }
            int rank = 1;
            int mlr = 0;
            while (isDigit(c)) {
                mlr += rank * (c - 48);
                rank *= 10;
                c = formula.charAt(--i);
            }
            if (mlr == 0) {
                ++mlr;
            }
            mlrStack.push(mlr);
            product *= mlr;
            if (c == ')') {
                i--;
                continue;
            }
            StringBuilder atom = new StringBuilder();
            while (isLower(c)) {
                atom.insert(0, c);
                c = formula.charAt(--i);
            }
            atom.insert(0, c);
            String name = atom.toString();
            count.put(name, count.getOrDefault(name, 0) + product);
            product /= mlrStack.pop();
            i--;
        }
        List<String> atomList = new ArrayList<>(count.keySet());
        atomList.sort(Comparator.naturalOrder());
        StringBuilder res = new StringBuilder();
        for (String atom : atomList) {
            res.append(atom);
            if (count.get(atom) > 1) {
                res.append(count.get(atom));
            }
        }
        return res.toString();
    }
}
