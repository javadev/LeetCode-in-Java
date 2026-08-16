### Complexity Analysis

- **Time Complexity:** **O(N)**, where N is the length of the `nums` array. We iterate through the array exactly once to calculate the total XOR sum and check for non-zero elements.
- **Space Complexity:** **O(1)**. The algorithm only uses two auxiliary variables (`xorSum` and `allZero`), which require constant extra space regardless of the input size.

### Intuition

- If all elements are `0`, no valid subsequence exists, so we return `0`.
- If the XOR sum of the entire array is non-zero, the longest subsequence is the entire array itself, returning `N`.
- If the total XOR sum is `0` (and the array has at least one non-zero element), removing exactly one non-zero element will flip the total XOR to a non-zero value. Thus, the maximum length becomes `N - 1`.
