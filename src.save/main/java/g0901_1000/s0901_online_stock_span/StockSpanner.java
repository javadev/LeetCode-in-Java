package g0901_1000.s0901_online_stock_span;

// #Medium #Stack #Design #Monotonic_Stack #Data_Stream
// #2022_03_28_Time_47_ms_(76.17%)_Space_88.8_MB_(5.16%)

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class StockSpanner {
    private final Map<Integer, Integer> map;
    private final Deque<Integer> stocks;
    private int index;

    public StockSpanner() {
        stocks = new LinkedList<>();
        index = -1;
        map = new HashMap<>();
        stocks.push(-1);
    }

    public int next(int price) {
        if (index != -1) {
            stocks.push(index);
        }
        map.put(++index, price);
        if (stocks.size() == 1) {
            return (index - stocks.peek());
        }
        while (stocks.size() > 1 && map.get(stocks.peek()) <= price) {
            stocks.pop();
        }
        return (index - stocks.peek());
    }
}

/*
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
