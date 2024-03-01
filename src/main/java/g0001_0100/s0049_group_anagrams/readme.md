49\. Group Anagrams

Medium

Given an array of strings `strs`, group **the anagrams** together. You can return the answer in **any order**.

An **Anagram** is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

**Example 1:**

**Input:** strs = ["eat","tea","tan","ate","nat","bat"]

**Output:** [["bat"],["nat","tan"],["ate","eat","tea"]] 

**Example 2:**

**Input:** strs = [""]

**Output:** [[""]] 

**Example 3:**

**Input:** strs = ["a"]

**Output:** [["a"]] 

**Constraints:**

*   <code>1 <= strs.length <= 10<sup>4</sup></code>
*   `0 <= strs[i].length <= 100`
*   `strs[i]` consists of lowercase English letters.

To solve the "Group Anagrams" problem in Java with the Solution class, follow these steps:

1. Define a method `groupAnagrams` in the `Solution` class that takes an array of strings `strs` as input and returns a list of lists of strings.
2. Initialize an empty HashMap to store the groups of anagrams. The key will be the sorted string, and the value will be a list of strings.
3. Iterate through each string `str` in the input array `strs`.
4. Sort the characters of the current string `str` to create a key for the HashMap.
5. Check if the sorted string exists as a key in the HashMap:
   - If it does, add the original string `str` to the corresponding list of strings.
   - If it doesn't, create a new entry in the HashMap with the sorted string as the key and a new list containing `str` as the value.
6. After iterating through all strings, return the values of the HashMap as the result.

Here's the implementation of the `groupAnagrams` method in Java:

```java
import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Initialize a HashMap to store the groups of anagrams
        Map<String, List<String>> anagramGroups = new HashMap<>();
        
        // Iterate through each string in the input array
        for (String str : strs) {
            // Sort the characters of the current string
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            
            // Check if the sorted string exists as a key in the HashMap
            if (anagramGroups.containsKey(sortedStr)) {
                // If it does, add the original string to the corresponding list
                anagramGroups.get(sortedStr).add(str);
            } else {
                // If it doesn't, create a new entry in the HashMap
                List<String> group = new ArrayList<>();
                group.add(str);
                anagramGroups.put(sortedStr, group);
            }
        }
        
        // Return the values of the HashMap as the result
        return new ArrayList<>(anagramGroups.values());
    }
}
```

This implementation ensures that all anagrams are grouped together efficiently using a HashMap.