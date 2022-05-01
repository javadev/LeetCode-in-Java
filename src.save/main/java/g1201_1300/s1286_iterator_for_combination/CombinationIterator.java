package g1201_1300.s1286_iterator_for_combination;

// #Medium #String #Design #Backtracking #Iterator
// #2022_03_11_Time_10_ms_(95.00%)_Space_44.1_MB_(83.81%)

import java.util.ArrayList;
import java.util.List;

public class CombinationIterator {
    private List<String> list;
    private int index;
    private int combinationLength;
    private boolean[] visited;

    public CombinationIterator(String characters, int combinationLength) {
        this.index = 0;
        this.list = new ArrayList<>();
        this.combinationLength = combinationLength;
        this.visited = new boolean[characters.length()];
        buildAllCombinations(characters, 0, new StringBuilder(), visited);
    }

    private void buildAllCombinations(
            String characters, int start, StringBuilder sb, boolean[] visited) {
        if (sb.length() == combinationLength) {
            list.add(sb.toString());
        } else {
            int i = start;
            while (i < characters.length()) {
                if (!visited[i]) {
                    sb.append(characters.charAt(i));
                    visited[i] = true;
                    buildAllCombinations(characters, i++, sb, visited);
                    visited[i - 1] = false;
                    sb.setLength(sb.length() - 1);
                } else {
                    i++;
                }
            }
        }
    }

    public String next() {
        return list.get(index++);
    }

    public boolean hasNext() {
        return index < list.size();
    }
}

/*
 * Your CombinationIterator object will be instantiated and called as such:
 * CombinationIterator obj = new CombinationIterator(characters, combinationLength);
 * String param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
