**Time Complexity (Big O Time):**

The time complexity of the program is determined by the loop that iterates through the array of stock prices. Here's the breakdown:

- The loop starts from the second element (index 1) and goes up to the last element (index `prices.length - 1`).

- Inside the loop, there are constant-time operations such as comparisons and arithmetic operations.

- The key operation is the `Math.max` function, which calculates the maximum of two values. This operation is also considered a constant-time operation.

- Therefore, the overall time complexity of the program is O(N), where N is the number of elements in the `prices` array. It needs to iterate through the array once.

**Space Complexity (Big O Space):**

The space complexity of the program is relatively low because it doesn't use any additional data structures that grow with the input size. Here's the analysis:

- The program uses a fixed number of integer variables (`maxProfit` and `min`) that occupy constant space, regardless of the input size.

- It doesn't use any dynamically allocated memory or data structures that depend on the input size.

- Therefore, the space complexity of the program is O(1), indicating constant space usage.

In summary, the time complexity of the program is O(N), where N is the number of stock prices, and the space complexity is O(1), indicating constant space usage. The program efficiently finds the maximum profit by iterating through the stock prices array once.
