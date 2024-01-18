package g0701_0800.s0770_basic_calculator_iv;

// #Hard #String #Hash_Table #Math #Stack #Recursion
// #2022_04_30_Time_8_ms_(96.92%)_Space_42.9_MB_(93.85%)

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    private static class Result {
        private Map<List<String>, Integer> map;

        Result() {
            map = new HashMap<>();
        }

        Result(Map<List<String>, Integer> map) {
            this.map = map;
        }

        void update(List<String> key, int val) {
            map.put(key, map.getOrDefault(key, 0) + val);
        }

        Map<List<String>, Integer> getMap() {
            return map;
        }

        List<String> toList() {
            List<List<String>> keyList = new ArrayList<>(map.keySet());
            Map<List<String>, String> list2String = new HashMap<>();
            for (List<String> key : keyList) {
                StringBuilder sb = new StringBuilder();
                for (String k : key) {
                    sb.append(k).append("*");
                }
                list2String.put(key, sb.toString());
            }
            keyList.sort(
                    (a, b) ->
                            (a.size() == b.size()
                                    ? list2String.get(a).compareTo(list2String.get(b))
                                    : b.size() - a.size()));
            List<String> res = new ArrayList<>();
            for (List<String> key : keyList) {
                if (map.get(key) == 0) {
                    continue;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(map.get(key));
                for (String k : key) {
                    sb.append("*").append(k);
                }
                res.add(sb.toString());
            }
            return res;
        }
    }

    private Map<String, Integer> evalMap;
    private int i = 0;

    public List<String> basicCalculatorIV(String expression, String[] evalvars, int[] evalints) {
        evalMap = new HashMap<>();
        for (int j = 0; j < evalvars.length; j++) {
            evalMap.put(evalvars[j], evalints[j]);
        }
        i = -1;
        next(expression);
        Result res = expression(expression);
        return res.toList();
    }

    private Result expression(String s) {
        Result res = term(s);
        while (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            int c = s.charAt(i);
            next(s);
            if (c == '+') {
                res = add(res, term(s));
            } else {
                res = subtract(res, term(s));
            }
        }
        return res;
    }

    private Result term(String s) {
        Result res = factor(s);
        while (i < s.length() && s.charAt(i) == '*') {
            next(s);
            res = multiply(res, factor(s));
        }
        return res;
    }

    private Result multiply(Result r1, Result r2) {
        Map<List<String>, Integer> map1 = r1.getMap();
        Map<List<String>, Integer> map2 = r2.getMap();
        Map<List<String>, Integer> map = new HashMap<>();
        for (Map.Entry<List<String>, Integer> entry1 : map1.entrySet()) {
            for (Map.Entry<List<String>, Integer> entry2 : map2.entrySet()) {
                List<String> key = new ArrayList<>(entry1.getKey());
                key.addAll(entry2.getKey());
                Collections.sort(key);
                map.put(key, map.getOrDefault(key, 0) + entry1.getValue() * entry2.getValue());
            }
        }
        return new Result(map);
    }

    private Result add(Result r1, Result r2) {
        Map<List<String>, Integer> map1 = r1.getMap();
        Map<List<String>, Integer> map2 = r2.getMap();
        Map<List<String>, Integer> map = new HashMap<>();
        for (Map.Entry<List<String>, Integer> entry1 : map1.entrySet()) {
            map.put(entry1.getKey(), map.getOrDefault(entry1.getKey(), 0) + entry1.getValue());
        }
        for (Map.Entry<List<String>, Integer> entry2 : map2.entrySet()) {
            map.put(entry2.getKey(), map.getOrDefault(entry2.getKey(), 0) + entry2.getValue());
        }
        return new Result(map);
    }

    private Result subtract(Result r1, Result r2) {
        Map<List<String>, Integer> map1 = r1.getMap();
        Map<List<String>, Integer> map2 = r2.getMap();
        Map<List<String>, Integer> map = new HashMap<>();
        for (Map.Entry<List<String>, Integer> entry1 : map1.entrySet()) {
            map.put(entry1.getKey(), map.getOrDefault(entry1.getKey(), 0) + entry1.getValue());
        }
        for (Map.Entry<List<String>, Integer> entry2 : map2.entrySet()) {
            map.put(entry2.getKey(), map.getOrDefault(entry2.getKey(), 0) - entry2.getValue());
        }
        return new Result(map);
    }

    private Result factor(String s) {
        Result res = new Result();
        if (s.charAt(i) == '(') {
            next(s);
            res = expression(s);
            next(s);
            return res;
        }
        if (Character.isLowerCase(s.charAt(i))) {
            return identifier(s);
        }
        res.update(new ArrayList<>(), number(s));
        return res;
    }

    private Result identifier(String s) {
        Result res = new Result();
        StringBuilder sb = new StringBuilder();
        while (i < s.length() && Character.isLowerCase(s.charAt(i))) {
            sb.append(s.charAt(i));
            i++;
        }
        i--;
        next(s);
        String variable = sb.toString();
        if (evalMap.containsKey(variable)) {
            res.update(new ArrayList<>(), evalMap.get(variable));
        } else {
            List<String> key = new ArrayList<>();
            key.add(variable);
            res.update(key, 1);
        }
        return res;
    }

    private int number(String s) {
        int res = 0;
        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            res = res * 10 + (s.charAt(i) - '0');
            i++;
        }
        i--;
        next(s);
        return res;
    }

    private void next(String s) {
        i++;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }
    }
}
