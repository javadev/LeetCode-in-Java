package g2501_2600.s2577_minimum_time_to_visit_a_cell_in_a_grid;

// #Hard #Array #Breadth_First_Search #Matrix #Heap_Priority_Queue #Graph #Shortest_Path

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int minimumTime(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        if (grid[0][1] > 1 && grid[1][0] > 1) {
            return -1;
        }
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.time));
        pq.add(new Node(0, 0, 0));
        int[] xDir = {0, 0, 1, -1};
        int[] yDir = {1, -1, 0, 0};
        int[][] vis = new int[m][n];
        for (int[] temp : vis) {
            Arrays.fill(temp, -1);
        }
        while (!pq.isEmpty()) {
            Node curr = pq.remove();
            if (curr.x == m - 1 && curr.y == n - 1) {
                return curr.time;
            }
            vis[curr.x][curr.y] = 1;
            int curr_time = curr.time + 1;
            for (int i = 0; i < 4; i++) {
                int newX = curr.x + xDir[i];
                int newY = curr.y + yDir[i];
                if (newX >= 0 && newY >= 0 && newX < m && newY < n && vis[newX][newY] == -1) {
                    vis[newX][newY] = 1;
                    if (grid[newX][newY] <= curr_time) {
                        pq.add(new Node(newX, newY, curr_time));
                    } else {
                        if ((grid[newX][newY] - curr.time) % 2 == 0) {
                            pq.add(new Node(newX, newY, grid[newX][newY] + 1));
                        } else {
                            pq.add(new Node(newX, newY, grid[newX][newY]));
                        }
                    }
                }
            }
        }
        return -1;
    }
}

class Node {

    int x;
    int y;
    int time;

    Node(int xx, int yy, int tt) {
        x = xx;
        y = yy;
        time = tt;
    }
}
