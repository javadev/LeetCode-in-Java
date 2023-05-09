package g1101_1200.s1169_invalid_transactions;

// #Medium #Array #String #Hash_Table #Sorting
// #2022_03_05_Time_11_ms_(89.89%)_Space_43.2_MB_(79.45%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public List<String> invalidTransactions(String[] transactions) {
        Map<String, TreeMap<Integer, Transaction>> map = new HashMap<>();
        List<String> result = new ArrayList<>();
        for (String transaction : transactions) {
            String[] split = transaction.split(",");
            String name = split[0];
            int time = Integer.parseInt(split[1]);
            String city = split[3];
            map.putIfAbsent(name, new TreeMap<>());
            map.get(name).put(time, new Transaction(time, city));
        }
        for (String transaction : transactions) {
            String[] split = transaction.split(",");
            String name = split[0];
            int time = Integer.parseInt(split[1]);
            int amount = Integer.parseInt(split[2]);
            String city = split[3];
            if (amount > 1000) {
                result.add(transaction);
                continue;
            }
            for (Map.Entry<Integer, Transaction> entry :
                    map.get(name).subMap(time - 60, time + 60).entrySet()) {
                if (Math.abs(time - entry.getKey()) <= 60 && !entry.getValue().city.equals(city)) {
                    result.add(transaction);
                    break;
                }
            }
        }
        return result;
    }

    private static class Transaction {
        int amount;
        String city;

        public Transaction(int amount, String city) {
            this.amount = amount;
            this.city = city;
        }
    }
}
