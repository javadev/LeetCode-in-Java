package g1701_1800.s1797_design_authentication_manager;

// #Medium #Hash_Table #Design #Programming_Skills_II_Day_19
// #2022_04_25_Time_41_ms_(92.67%)_Space_62.1_MB_(31.08%)

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("java:S3824")
public class AuthenticationManager {
    int inc;
    Map<String, Integer> expireMap;
    Deque<Item> deque;

    public AuthenticationManager(int timeToLive) {
        deque = new ArrayDeque<>();
        expireMap = new HashMap<>();
        inc = timeToLive;
    }

    public void generate(String tokenId, int currentTime) {
        expireMap.put(tokenId, currentTime + inc);
        deque.offerLast(new Item(tokenId, currentTime + inc));
    }

    public void renew(String tokenId, int currentTime) {
        update(currentTime);
        if (expireMap.containsKey(tokenId)) {
            deque.offerLast(new Item(tokenId, currentTime + inc));
            expireMap.put(tokenId, currentTime + inc);
        }
    }

    public int countUnexpiredTokens(int currentTime) {
        update(currentTime);
        return expireMap.size();
    }

    private void update(int curTime) {
        while (!deque.isEmpty() && deque.peekFirst().time <= curTime) {
            String id = deque.peekFirst().id;
            int time = deque.peekFirst().time;
            if (expireMap.containsKey(id) && expireMap.get(id).equals(time)) {
                expireMap.remove(deque.pollFirst().id);
            } else {
                deque.pollFirst();
            }
        }
    }

    private static class Item {
        String id;
        int time;

        Item(String id, int time) {
            this.id = id;
            this.time = time;
        }
    }
}
