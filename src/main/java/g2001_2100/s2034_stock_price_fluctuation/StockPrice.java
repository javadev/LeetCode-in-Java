package g2001_2100.s2034_stock_price_fluctuation;

// #Medium #Hash_Table #Design #Heap_Priority_Queue #Ordered_Set #Data_Stream
// #2022_05_25_Time_163_ms_(65.51%)_Space_155.8_MB_(37.90%)

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class StockPrice {
    private static class Record {
        Integer time;
        Integer price;

        Record(Integer time, Integer price) {
            this.time = time;
            this.price = price;
        }
    }

    Map<Integer, Integer> map;
    PriorityQueue<Record> maxHeap;
    PriorityQueue<Record> minHeap;
    Integer latestTimestamp = 0;

    public StockPrice() {
        map = new HashMap<>();
        maxHeap =
                new PriorityQueue<Record>(
                        (r1, r2) -> {
                            if (r1.price.equals(r2.price)) {
                                return 0;
                            } else {
                                return r1.price > r2.price ? -1 : 1;
                            }
                        });
        minHeap =
                new PriorityQueue<Record>(
                        (r1, r2) -> {
                            if (r1.price.equals(r2.price)) {
                                return 0;
                            } else {
                                return r1.price < r2.price ? -1 : 1;
                            }
                        });
    }

    public void update(int timestamp, int price) {
        latestTimestamp = Math.max(timestamp, latestTimestamp);
        maxHeap.offer(new Record(timestamp, price));
        minHeap.offer(new Record(timestamp, price));
        map.put(timestamp, price);
    }

    public int current() {
        return map.get(latestTimestamp);
    }

    public int maximum() {
        while (true) {
            Record r = maxHeap.peek();
            if (map.get(r.time).equals(r.price)) {
                return r.price;
            }
            maxHeap.poll();
        }
    }

    public int minimum() {
        while (true) {
            Record r = minHeap.peek();
            if (map.get(r.time).equals(r.price)) {
                return r.price;
            }
            minHeap.poll();
        }
    }
}
