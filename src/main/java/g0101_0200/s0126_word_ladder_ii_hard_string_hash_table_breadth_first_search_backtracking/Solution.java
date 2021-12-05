package g0101_0200.s0126_word_ladder_ii_hard_string_hash_table_breadth_first_search_backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings("java:S135")
public class Solution {
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Map<String, Set<String>> graph = new HashMap<>();
        int targetLength = bfs(graph, beginWord, endWord, wordList);
        List<List<String>> ans = new ArrayList<>();
        if (targetLength == 0) {
            return ans;
        }
        dfs(ans, new ArrayList<>(), targetLength, beginWord, endWord, graph);
        return ans;
    }

    private int bfs(
            Map<String, Set<String>> graph,
            String beginWord,
            String endWord,
            List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) {
            return 0;
        }
        wordSet.add(beginWord);
        // Bi BFS
        // two queue (startWord, endWord)
        Set<String> set1 = new HashSet<>(Arrays.asList(beginWord));
        Set<String> set2 = new HashSet<>(Arrays.asList(endWord));
        Set<String> visited = new HashSet<>();
        boolean isReversed = false;
        // the number of words in the transformation sequence
        int length = 0;
        boolean found = false;
        while (!set1.isEmpty() && !found) {
            Set<String> newSet = new HashSet<>();
            length++;
            // check next layer
            for (String word : set1) {
                visited.add(word);
                // check neighbor
                char[] arrWord = word.toCharArray();
                for (int i = 0; i < arrWord.length; i++) {
                    char oldChar = arrWord[i];
                    for (int j = 0; j < 26; j++) {
                        char newChar = (char) ('a' + j);
                        // skip original word
                        if (newChar == oldChar) {
                            continue;
                        }
                        arrWord[i] = newChar;
                        String newWord = String.valueOf(arrWord);
                        if (!wordSet.contains(newWord)) {
                            continue;
                        }
                        if (set2.contains(newWord)) {
                            found = true;
                        }
                        if (visited.contains(newWord)) {
                            continue;
                        }
                        newSet.add(newWord);
                        if (!isReversed) {
                            graph.putIfAbsent(word, new HashSet<>());
                            graph.get(word).add(newWord);
                        } else {
                            graph.putIfAbsent(newWord, new HashSet<>());
                            graph.get(newWord).add(word);
                        }
                    }
                    // revert change
                    arrWord[i] = oldChar;
                }
            }
            set1 = newSet;
            // swap queue
            // always make sure set1 is the smaller set
            // so we can end early if there is no path from begin to end word (set1 will be empty)
            if (set1.size() > set2.size()) {
                Set<String> tmpVisited = set1;
                set1 = set2;
                set2 = tmpVisited;
                isReversed = !isReversed;
            }
        }
        if (!found) {
            return 0;
        }
        return length + 1;
    }

    private void dfs(
            List<List<String>> ans,
            List<String> path,
            int targetLength,
            String beginWord,
            String endWord,
            Map<String, Set<String>> graph) {
        path.add(beginWord);
        if (path.size() > targetLength) {
            path.remove(path.size() - 1);
            return;
        }
        if (beginWord.equals(endWord)) {
            ans.add(new ArrayList<>(path));
            path.remove(path.size() - 1);
            return;
        }
        if (graph.containsKey(beginWord)) {
            for (String neighbor : graph.get(beginWord)) {
                dfs(ans, path, targetLength, neighbor, endWord, graph);
            }
        }
        path.remove(path.size() - 1);
    }
}
