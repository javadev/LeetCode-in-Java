package g2001_2100.s2034_stock_price_fluctuation;

// #Medium #Hash_Table #Design #Heap_Priority_Queue #Ordered_Set #Data_Stream
// #2022_05_25_Time_163_ms_(65.51%)_Space_155.8_MB_(37.90%)

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class StockPrice {
    private static class Record {
        int time;
        int price;

        Record(int time, int price) {
            this.time = time;
            this.price = price;
        }
    }

    private Map<Integer, Integer> map;
    private PriorityQueue<Record> maxHeap;
    private PriorityQueue<Record> minHeap;
    private int latestTimestamp = 0;

    public StockPrice() {
        map = new HashMap<>();
        maxHeap = new PriorityQueue<>((r1, r2) -> Integer.compare(r2.price, r1.price));
        minHeap = new PriorityQueue<>((r1, r2) -> Integer.compare(r1.price, r2.price));
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
            Record record = maxHeap.peek();
            if (map.get(record.time).equals(record.price)) {
                return record.price;
            }
            maxHeap.poll();
        }
    }

    public int minimum() {
        while (true) {
            Record record = minHeap.peek();
            if (map.get(record.time).equals(record.price)) {
                return record.price;
            }
            minHeap.poll();
        }
    }
}
