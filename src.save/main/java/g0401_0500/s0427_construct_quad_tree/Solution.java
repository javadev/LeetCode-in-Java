package g0401_0500.s0427_construct_quad_tree;

// #Medium #Array #Tree #Matrix #Divide_and_Conquer
// #2022_07_16_Time_0_ms_(100.00%)_Space_42.6_MB_(89.45%)

/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
};
*/
public class Solution {
    public Node construct(int[][] grid) {
        return optimizedDfs(grid, 0, 0, grid.length);
    }

    private Node optimizedDfs(int[][] grid, int rowStart, int colStart, int len) {
        int zeroCount = 0;
        int oneCount = 0;
        for (int row = rowStart; row < rowStart + len; row++) {
            boolean isBreak = false;
            for (int col = colStart; col < colStart + len; col++) {
                if (grid[row][col] == 0) {
                    zeroCount++;
                } else {
                    oneCount++;
                }
                if (oneCount > 0 && zeroCount > 0) {
                    // We really no need to scan all.
                    // Once we know there are both 0 and 1 then we can break.
                    isBreak = true;
                    break;
                }
            }
            if (isBreak) {
                break;
            }
        }
        if (oneCount > 0 && zeroCount > 0) {
            int midLen = len / 2;
            Node topLeft = optimizedDfs(grid, rowStart, colStart, midLen);
            Node topRight = optimizedDfs(grid, rowStart, colStart + midLen, midLen);
            Node bottomLeft = optimizedDfs(grid, rowStart + midLen, colStart, midLen);
            Node bottomRight = optimizedDfs(grid, rowStart + midLen, colStart + midLen, midLen);
            boolean isLeaf = false;
            return new Node(true, isLeaf, topLeft, topRight, bottomLeft, bottomRight);
        } else {
            boolean resultVal = oneCount > 0;
            boolean isLeaf = true;
            return new Node(resultVal, isLeaf);
        }
    }
}
