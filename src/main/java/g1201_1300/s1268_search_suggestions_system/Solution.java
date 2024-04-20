package g1201_1300.s1268_search_suggestions_system;

// #Medium #Array #String #2022_03_14_Time_28_ms_(78.06%)_Space_73.1_MB_(38.32%)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Trie trie = new Trie();
        Arrays.sort(products);
        for (String p : products) {
            trie.insert(p);
        }

        return trie.getResult(searchWord);
    }

    static class Trie {
        Node root;

        public Trie() {
            root = new Node();
        }

        void insert(String word) {
            Node curr = root;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (!curr.containsKey(c)) {
                    curr.put(c, new Node());
                }
                curr = curr.get(c);
                curr.addToList(word);
            }
        }

        List<List<String>> getResult(String searchWord) {
            Node curr = root;
            List<List<String>> res = new ArrayList<>();
            for (int i = 0; i < searchWord.length(); i++) {
                char c = searchWord.charAt(i);
                List<String> temp = new ArrayList<>();
                if (curr != null) {
                    curr = curr.get(c);
                }

                for (int j = 0; j < 3 && curr != null && j < curr.getList().size(); j++) {
                    temp.add(curr.getList().get(j));
                }
                res.add(new ArrayList<>(temp));
            }
            return res;
        }
    }

    static class Node {
        Node[] links;
        List<String> list;

        public Node() {
            links = new Node[26];
            list = new ArrayList<>();
        }

        boolean containsKey(char c) {
            return links[c - 'a'] != null;
        }

        Node get(char c) {
            return links[c - 'a'];
        }

        void put(char c, Node node) {
            links[c - 'a'] = node;
        }

        void addToList(String s) {
            list.add(s);
        }

        List<String> getList() {
            return list;
        }
    }
}
