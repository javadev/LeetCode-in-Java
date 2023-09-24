**Time Complexity (Big O Time):**

The program iterates through numbers from 1 to `num` and calculates the number of 1s in each number's binary representation. The key part is that it efficiently reuses previously calculated results for smaller numbers.

1. The outer loop runs `num` times, where `num` is the input integer.
2. The inner loop is based on the value of `borderPos`, which is reset every time `incrPos` reaches a power of 2 (e.g., 1, 2, 4, 8, ...).
3. Inside the inner loop, there is a constant-time operation to update the `result` array.

Therefore, the overall time complexity of the program is O(num), where 'num' is the input integer.

**Space Complexity (Big O Space):**

1. The program uses an integer array `result` of size `num + 1` to store the count of 1s for each number from 0 to `num`. Therefore, the space complexity is O(num).

In summary, the provided program has a time complexity of O(num) and a space complexity of O(num), where 'num' is the input integer.
