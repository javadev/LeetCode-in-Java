package g0701_0800.s0773_sliding_puzzle;

// #Hard #Array #Breadth_First_Search #Matrix

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Solution {
    private static class Node {
        public String board;
        public int depth;
        public int y;
        public int x;

        public Node(String board, int depth, int y, int x) {
            this.board = board;
            this.depth = depth;
            this.y = y;
            this.x = x;
        }
    }

    public int slidingPuzzle(int[][] board) {
        String targetStr = "123450";
        StringBuilder sb = new StringBuilder();
        int y = 0;
        int x = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 0) {
                    y = i;
                    x = j;
                }
                sb.append(board[i][j]);
            }
        }
        Set<String> seen = new HashSet<>();
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(sb.toString(), 0, y, x));
        int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        while (!q.isEmpty()) {
            Node next = q.poll();
            String s = next.board;
            if (!seen.contains(s)) {
                if (s.equals(targetStr)) {
                    return next.depth;
                }
                int nextDepth = next.depth + 1;
                y = next.y;
                x = next.x;
                for (int[] vector : dir) {
                    int nextY = y + vector[0];
                    int nextX = x + vector[1];
                    if (0 <= nextY
                            && nextY < board.length
                            && 0 <= nextX
                            && nextX < board[0].length) {
                        String newBoard = swap(s, y, x, nextY, nextX);
                        q.add(new Node(newBoard, nextDepth, nextY, nextX));
                    }
                }
                seen.add(s);
            }
        }
        return -1;
    }

    public String swap(String board, int y1, int x1, int y2, int x2) {
        char[] arr = board.toCharArray();
        char t = board.charAt(y1 * 3 + x1);
        arr[y1 * 3 + x1] = board.charAt(y2 * 3 + x2);
        arr[y2 * 3 + x2] = t;
        return new String(arr);
    }
}
