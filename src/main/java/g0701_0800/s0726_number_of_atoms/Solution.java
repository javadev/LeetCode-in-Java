package g0701_0800.s0726_number_of_atoms;

// #Hard #String #Hash_Table #Stack

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

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
        for (int i = formula.length() - 1; i >= 0; --i) {
            char c = formula.charAt(i);
            if (c == '(') {
                product /= mlrStack.pop();
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
