**Time Complexity (Big O Time):**

1. The program iterates through the input string `s` twice. In the first loop, it goes from left to right, and in the second loop, it goes from right to left. Each loop has a linear time complexity of O(n), where n is the length of the input string.

2. Within each loop, there are constant time operations like character comparisons and arithmetic calculations. These operations do not depend on the size of the input string and can be considered O(1).

Combining these factors, the overall time complexity of the program is O(n), where n is the length of the input string `s`. The two passes through the string do not make it O(2n) because constant factors are ignored in big O notation.

**Space Complexity (Big O Space):**

The space complexity of the program is O(1), which means it uses a constant amount of additional space regardless of the size of the input string `s`. The variables `max`, `left`, `right`, `n`, and `ch` all occupy constant space, and the program does not use any additional data structures or memory that scales with the input size.

In summary, the time complexity of the provided program is O(n), and the space complexity is O(1), where n is the length of the input string `s`.
