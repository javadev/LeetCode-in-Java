package g3301_3400.s3342_find_minimum_time_to_reach_last_room_ii;

// #Medium #Array #Matrix #Heap_Priority_Queue #Graph #Shortest_Path
// #2024_11_05_Time_495_ms_(37.48%)_Space_126.6_MB_(8.65%)

import java.util.PriorityQueue;

public class Solution {
    private static class Node {
        int x;
        int y;
        int t;
        int turn;
    }

    private final int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int minTimeToReach(int[][] moveTime) {
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.t - b.t);
        int m = moveTime.length;
        int n = moveTime[0].length;
        Node node = new Node();
        node.x = 0;
        node.y = 0;
        int t = 0;
        node.t = t;
        node.turn = 0;
        pq.add(node);
        moveTime[0][0] = -1;
        while (!pq.isEmpty()) {
            Node curr = pq.poll();
            for (int i = 0; i < 4; i++) {
                int x = curr.x + dir[i][0];
                int y = curr.y + dir[i][1];
                if (x == m - 1 && y == n - 1) {
                    t = Math.max(curr.t, moveTime[x][y]) + 1 + curr.turn;
                    return t;
                }
                if (x >= 0 && x < m && y < n && y >= 0 && moveTime[x][y] != -1) {
                    Node newNode = new Node();
                    t = Math.max(curr.t, moveTime[x][y]) + 1 + curr.turn;
                    newNode.x = x;
                    newNode.y = y;
                    newNode.t = t;
                    newNode.turn = curr.turn == 1 ? 0 : 1;
                    pq.add(newNode);
                    moveTime[x][y] = -1;
                }
            }
        }
        return -1;
    }
}
