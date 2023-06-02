package g1101_1200.s1169_invalid_transactions;

// #Medium #Array #String #Hash_Table #Sorting #2023_06_02_Time_9_ms_(98.31%)_Space_44.9_MB_(7.40%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    private static class Transaction {
        String name;
        int time;
        int amount;
        String city;

        Transaction(String trans) {
            String[] s = trans.split(",");
            name = s[0];
            time = Integer.parseInt(s[1]);
            amount = Integer.parseInt(s[2]);
            city = s[3];
        }
    }

    public List<String> invalidTransactions(String[] input) {
        List<String> res = new ArrayList<>();
        if (input == null || input.length == 0) {
            return res;
        }
        Map<String, List<Transaction>> map = new HashMap<>();
        for (String s : input) {
            Transaction trans = new Transaction(s);
            if (!map.containsKey(trans.name)) {
                map.put(trans.name, new ArrayList<>());
            }
            map.get(trans.name).add(trans);
        }
        for (String s : input) {
            Transaction trans = new Transaction(s);
            if (!isValid(trans, map)) {
                res.add(s);
            }
        }
        return res;
    }

    private boolean isValid(Transaction transaction, Map<String, List<Transaction>> map) {
        if (transaction.amount > 1000) {
            return false;
        }
        for (Transaction s : map.get(transaction.name)) {
            if (Math.abs(s.time - transaction.time) <= 60 && !s.city.equals(transaction.city)) {
                return false;
            }
        }
        return true;
    }
}
