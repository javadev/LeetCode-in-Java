package g1301_1400.s1366_rank_teams_by_votes;

// #Medium #Array #String #Hash_Table #Sorting #Counting
// #2022_03_21_Time_5_ms_(95.68%)_Space_44.1_MB_(64.58%)

import java.util.Arrays;

public class Solution {
    static class Node {
        int[] count = new int[26];
        char c;

        public Node(char c) {
            this.c = c;
        }
    }

    public String rankTeams(String[] votes) {
        Node[] nodes = new Node[26];
        for (int i = 0; i < 26; i++) {
            nodes[i] = new Node((char) (i + 'A'));
        }
        for (String vote : votes) {
            for (int i = 0; i < vote.length(); i++) {
                nodes[vote.charAt(i) - 'A'].count[i]++;
            }
        }
        Arrays.sort(
                nodes,
                (o1, o2) -> {
                    for (int i = 0; i < 26; i++) {
                        if (o1.count[i] != o2.count[i]) {
                            return o2.count[i] - o1.count[i];
                        }
                    }
                    return o1.c - o2.c;
                });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < votes[0].length(); i++) {
            sb.append(nodes[i].c);
        }
        return sb.toString();
    }
}
