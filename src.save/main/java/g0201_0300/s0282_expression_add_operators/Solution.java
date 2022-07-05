package g0201_0300.s0282_expression_add_operators;

// #Hard #String #Math #Backtracking #2022_07_06_Time_9_ms_(98.48%)_Space_45.3_MB_(73.71%)

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("java:S107")
public class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> res = new ArrayList<>();
        if (num.length() == 0 || Long.valueOf(num) > Integer.MAX_VALUE) {
            return res;
        }
        char[] list = num.toCharArray();
        dfs(res, list, 0, 0, target, new char[2 * list.length - 1], 0, 1, '+', 0);
        return res;
    }

    private void dfs(
            List<String> res,
            char[] list,
            int i,
            int j,
            int target,
            char[] arr,
            int val,
            int mul,
            char preOp,
            int join) {
        arr[j++] = list[i];
        int digit = 10 * join + (list[i] - '0');
        int result = val + mul * digit;
        if (preOp == '-') {
            result = val - mul * digit;
        }
        if (i == list.length - 1) {
            if (result == target) {
                StringBuilder sb = new StringBuilder();
                for (int k = 0; k < j; k++) {
                    sb.append(arr[k]);
                }
                res.add(sb.toString());
            }
            return;
        }
        if (preOp == '+') {
            arr[j] = '+';
            dfs(res, list, i + 1, j + 1, target, arr, val + mul * digit, 1, '+', 0);
            arr[j] = '-';
            dfs(res, list, i + 1, j + 1, target, arr, val + mul * digit, 1, '-', 0);
            arr[j] = '*';
            dfs(res, list, i + 1, j + 1, target, arr, val, mul * digit, '+', 0);
            if (digit != 0) {
                dfs(res, list, i + 1, j, target, arr, val, mul, '+', digit);
            }
        } else {
            arr[j] = '+';
            dfs(res, list, i + 1, j + 1, target, arr, val - mul * digit, 1, '+', 0);
            arr[j] = '-';
            dfs(res, list, i + 1, j + 1, target, arr, val - mul * digit, 1, '-', 0);
            arr[j] = '*';
            dfs(res, list, i + 1, j + 1, target, arr, val, mul * digit, '-', 0);
            if (digit != 0) {
                dfs(res, list, i + 1, j, target, arr, val, mul, '-', digit);
            }
        }
    }
}
