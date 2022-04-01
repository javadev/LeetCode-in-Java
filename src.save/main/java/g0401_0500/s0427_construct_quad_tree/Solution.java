package g0401_0500.s0427_construct_quad_tree;

// #Medium #Array #Tree #Matrix #Divide_and_Conquer
// #2022_03_18_Time_1_ms_(85.16%)_Space_46.3_MB_(67.10%)

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
