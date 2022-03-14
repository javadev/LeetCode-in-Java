package g1201_1300.s1222_queens_that_can_attack_the_king;

// #Medium #Array #Matrix #Simulation #2022_03_11_Time_1_ms_(89.88%)_Space_42.6_MB_(53.57%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Set<Integer>> queensLoc = new HashMap<>();
        for (int[] queen : queens) {
            Set<Integer> queensY = queensLoc.getOrDefault(queen[0], new HashSet<>());
            queensY.add(queen[1]);
            queensLoc.put(queen[0], queensY);
        }
        dfs(queensLoc, king[0] - 1, king[1], result, "n");
        dfs(queensLoc, king[0] + 1, king[1], result, "s");
        dfs(queensLoc, king[0], king[1] + 1, result, "e");
        dfs(queensLoc, king[0], king[1] - 1, result, "w");
        dfs(queensLoc, king[0] - 1, king[1] - 1, result, "nw");
        dfs(queensLoc, king[0] - 1, king[1] + 1, result, "ne");
        dfs(queensLoc, king[0] + 1, king[1] - 1, result, "sw");
        dfs(queensLoc, king[0] + 1, king[1] + 1, result, "se");
        return result;
    }

    public void dfs(
            Map<Integer, Set<Integer>> queens,
            int x,
            int y,
            List<List<Integer>> result,
            String direction) {
        if (x < 0 || x >= 8 || y < 0 || y >= 8) {
            return;
        }

        if (queens.containsKey(x) && queens.get(x).contains(y)) {
            result.add(new ArrayList<>(Arrays.asList(x, y)));
            return;
        }

        switch (direction) {
            case "n":
                dfs(queens, x - 1, y, result, direction);
                break;
            case "s":
                dfs(queens, x + 1, y, result, direction);
                break;
            case "e":
                dfs(queens, x, y + 1, result, direction);
                break;
            case "w":
                dfs(queens, x, y - 1, result, direction);
                break;
            case "ne":
                dfs(queens, x - 1, y + 1, result, direction);
                break;
            case "nw":
                dfs(queens, x - 1, y - 1, result, direction);
                break;
            case "se":
                dfs(queens, x + 1, y + 1, result, direction);
                break;
            case "sw":
                dfs(queens, x + 1, y - 1, result, direction);
                break;
            default:
        }
    }
}
