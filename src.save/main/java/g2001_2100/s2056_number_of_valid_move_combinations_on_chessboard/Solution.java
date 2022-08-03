package g2001_2100.s2056_number_of_valid_move_combinations_on_chessboard;

// #Hard #Array #String #Simulation #Backtracking
// #2022_05_30_Time_433_ms_(24.83%)_Space_144.4_MB_(12.75%)

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("unchecked")
public class Solution {
    // 0: rook, queen, bishop
    private int[][][] dirs = {
        {{-1, 0}, {1, 0}, {0, -1}, {0, 1}},
        {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {1, 1}, {-1, -1}, {-1, 1}, {1, -1}},
        {{1, 1}, {-1, -1}, {-1, 1}, {1, -1}}
    };

    public int countCombinations(String[] pieces, int[][] positions) {
        ArrayList<int[]>[] endPosition = new ArrayList[pieces.length];
        for (int i = 0; i < pieces.length; i++) {
            endPosition[i] = new ArrayList<>();
        }
        for (int i = 0; i < pieces.length; i++) {
            positions[i][0]--;
            positions[i][1]--;
            endPosition[i].add(positions[i]);
            int dirIndex = 0;
            switch (pieces[i]) {
                case "rook":
                    dirIndex = 0;
                    break;
                case "queen":
                    dirIndex = 1;
                    break;
                case "bishop":
                    dirIndex = 2;
                    break;
                default:
                    break;
            }
            for (int[] d : dirs[dirIndex]) {
                int r = positions[i][0];
                int c = positions[i][1];
                while (true) {
                    r += d[0];
                    c += d[1];
                    if (r < 0 || r >= 8 || c < 0 || c >= 8) {
                        break;
                    }
                    endPosition[i].add(new int[] {r, c});
                }
            }
        }
        return dfs(positions, endPosition, new int[pieces.length], 0);
    }

    private int dfs(int[][] positions, ArrayList[] stop, int[] stopIndex, int cur) {
        if (cur == stopIndex.length) {
            int[][] p = new int[positions.length][2];
            for (int i = 0; i < p.length; i++) {
                p[i] = new int[] {positions[i][0], positions[i][1]};
            }
            return check(p, stop, stopIndex);
        }
        int res = 0;
        for (int i = 0; i < stop[cur].size(); i++) {
            stopIndex[cur] = i;
            res += dfs(positions, stop, stopIndex, cur + 1);
        }
        return res;
    }

    private int check(int[][] positions, ArrayList<int[]>[] stop, int[] stopIndex) {
        boolean keepGoing = true;
        while (keepGoing) {
            keepGoing = false;
            for (int i = 0; i < positions.length; i++) {
                int diff = stop[i].get(stopIndex[i])[0] - positions[i][0];
                if (diff > 0) {
                    keepGoing = true;
                    positions[i][0]++;
                } else if (diff < 0) {
                    keepGoing = true;
                    positions[i][0]--;
                }
                diff = stop[i].get(stopIndex[i])[1] - positions[i][1];
                if (diff > 0) {
                    keepGoing = true;
                    positions[i][1]++;
                } else if (diff < 0) {
                    keepGoing = true;
                    positions[i][1]--;
                }
            }
            Set<Integer> seen = new HashSet<>();
            for (int[] position : positions) {
                int key = position[0] * 100 + position[1];
                if (seen.contains(key)) {
                    return 0;
                }
                seen.add(key);
            }
        }
        return 1;
    }
}
