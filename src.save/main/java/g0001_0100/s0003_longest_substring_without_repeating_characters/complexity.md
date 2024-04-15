**Time Complexity (Big O Time):**

The time complexity of this program is O(n), where "n" represents the length of the input string `s`. Here's the breakdown:

1. The program iterates through the characters of the input string `s` using a `for` loop, and this loop runs for "n" iterations, where "n" is the length of `s`.
2. Inside the loop, it performs constant-time operations:
   - Initializing the `lastIndices` array (constant time).
   - Updating values in the `lastIndices` array (constant time).
   - Updating variables like `maxLen`, `curLen`, `start`, and `lastIndices[cur]` (constant time).

Since the loop runs for "n" iterations, and all operations inside the loop are constant time, the overall time complexity is O(n).

**Space Complexity (Big O Space):**

The space complexity of this program is O(256) = O(1), as it uses a fixed-size array `lastIndices` of length 256 to store the last indices of characters. This array's size does not depend on the input size and remains constant.

Additionally, the program uses a few integer variables and constant space to store the result. The space used for these variables does not depend on the input size and is also considered constant.

Therefore, the space complexity is O(1), or more precisely, O(256), which is still considered constant because it doesn't grow with the input size.
