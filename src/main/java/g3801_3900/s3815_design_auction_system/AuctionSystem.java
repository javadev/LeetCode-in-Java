package g3801_3900.s3815_design_auction_system;

// #Medium #Hash_Table #Design #Heap_Priority_Queue #Ordered_Set #Staff #Weekly_Contest_485
// #2026_06_09_Time_96_ms_(93.30%)_Space_203.51_MB_(92.27%)

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class AuctionSystem {
    private final Map<Long, int[]> bidMap;
    private final Map<Integer, PriorityQueue<int[]>> itemMap;

    public AuctionSystem() {
        bidMap = new HashMap<>();
        itemMap = new HashMap<>();
    }

    public void addBid(int userId, int itemId, int bidAmount) {
        int[] bid = new int[] {userId, itemId, bidAmount};
        bidMap.put((long) userId << 32 | itemId, bid);
        itemMap.computeIfAbsent(
                        itemId,
                        item ->
                                new PriorityQueue<>(
                                        (a, b) -> a[2] == b[2] ? b[0] - a[0] : b[2] - a[2]))
                .add(bid);
    }

    public void updateBid(int userId, int itemId, int newAmount) {
        addBid(userId, itemId, newAmount);
    }

    public void removeBid(int userId, int itemId) {
        bidMap.remove((long) userId << 32 | itemId);
    }

    public int getHighestBidder(int itemId) {
        PriorityQueue<int[]> pq = itemMap.get(itemId);
        if (pq == null || pq.isEmpty()) {
            return -1;
        }
        while (!pq.isEmpty()) {
            int[] top = pq.peek();
            int[] cur = bidMap.get((long) top[0] << 32 | itemId);
            if (Arrays.equals(top, cur)) {
                return top[0];
            }
            pq.poll();
        }
        return -1;
    }
}

/**
 * Your AuctionSystem object will be instantiated and called as such: AuctionSystem obj = new
 * AuctionSystem(); obj.addBid(userId,itemId,bidAmount); obj.updateBid(userId,itemId,newAmount);
 * obj.removeBid(userId,itemId); int param_4 = obj.getHighestBidder(itemId);
 */
