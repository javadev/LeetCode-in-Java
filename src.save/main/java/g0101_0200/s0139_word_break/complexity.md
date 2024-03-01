**Time Complexity (Big O Time):**

- **HashSet Initialization**: Initializing the `HashSet` with the words from the `wordDict` takes O(M) time, where M is the total length of all words in the dictionary.

- **Maximum Length Calculation**: In the first loop, the program calculates the maximum word length in the `wordDict`. This takes O(M) time, as it iterates through all the words.

- **DFS Function Calls**: The main work is done in the `dfs` function. The function is called multiple times with different `end` values (from 1 to the maximum word length). The number of calls depends on the maximum word length, which we denoted as "max." Therefore, the time complexity of the DFS portion is O(max * N), where N is the length of the input string `s`.

- **Flag Array**: The program uses a `flag` array to memoize subproblem results to avoid redundant work. Initializing this array takes O(N) time since it has a length equal to the length of the input string `s`.

Combining these steps, the overall time complexity of the program is O(M + max * N), where M is the total length of all words in the dictionary, N is the length of the input string `s`, and max is the maximum word length in the dictionary.

**Space Complexity (Big O Space):**

- **HashSet Space**: The `HashSet` `set` is used to store the words from the dictionary. It consumes O(M) space, where M is the total length of all words in the dictionary.

- **Flag Array**: The `flag` array is used for memoization, and it has a length equal to the length of the input string `s`, so it consumes O(N) space.

- **DFS Recursive Calls**: The depth of the recursive calls in the `dfs` function can go up to "max," where "max" is the maximum word length in the dictionary. This contributes to the call stack space. Therefore, in the worst case, the space complexity due to recursive calls is O(max).

Combining these space requirements, the overall space complexity of the program is O(M + N + max).

In summary, the time complexity is O(M + max * N), and the space complexity is O(M + N + max), where M is the total length of all words in the dictionary, N is the length of the input string `s`, and max is the maximum word length in the dictionary.
