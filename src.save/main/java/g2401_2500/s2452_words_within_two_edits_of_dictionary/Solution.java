package g2401_2500.s2452_words_within_two_edits_of_dictionary;

// #Medium #Array #String #2022_12_15_Time_16_ms_(70.33%)_Space_49.2_MB_(14.26%)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    private Node root;

    static class Node {
        HashMap<Character, Node> childs = new HashMap<>();
    }

    private void insert(String s) {
        Node curr = root;
        for (char ch : s.toCharArray()) {
            if (curr.childs.get(ch) == null) {
                curr.childs.put(ch, new Node());
            }
            curr = curr.childs.get(ch);
        }
    }

    private boolean search(String word, Node curr, int i, int edits) {
        // if reached the end with less than or equal 2 edits then return truem
        if (i == word.length()) {
            return edits <= 2;
        }
        // more than 2 mismatch don't go further
        if (edits > 2) {
            return false;
        }
        // there might be a case start is matching but others are diff and that's a edge case to
        // handle
        boolean ans = false;
        for (Character ch : curr.childs.keySet()) {
            ans |=
                    search(
                            word,
                            curr.childs.get(ch),
                            i + 1,
                            ch == word.charAt(i) ? edits : edits + 1);
        }
        return ans;
    }

    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        root = new Node();
        for (String s : dictionary) {
            insert(s);
        }
        List<String> ans = new ArrayList<>();
        for (String s : queries) {
            boolean found = search(s, root, 0, 0);
            if (found) {
                ans.add(s);
            }
        }
        return ans;
    }
}
