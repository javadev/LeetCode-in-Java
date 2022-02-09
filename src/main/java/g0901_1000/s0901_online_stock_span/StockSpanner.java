package g0901_1000.s0901_online_stock_span;

// #Medium #Stack #Design #Monotonic_Stack #Data_Stream

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StockSpanner {
    private final Map<Integer, Integer> map;
    private final Stack<Integer> stocks;
    private int index;

    public StockSpanner() {
        stocks = new Stack<>();
        index = -1;
        map = new HashMap<>();
        stocks.push(-1);
    }

    public int next(int price) {
        if (index != -1) stocks.push(index);
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
