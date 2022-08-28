954\. Array of Doubled Pairs

Medium

Given an integer array of even length `arr`, return `true` _if it is possible to reorder_ `arr` _such that_ `arr[2 * i + 1] = 2 * arr[2 * i]` _for every_ `0 <= i < len(arr) / 2`_, or_ `false` _otherwise_.

**Example 1:**

**Input:** arr = [3,1,3,6]

**Output:** false

**Example 2:**

**Input:** arr = [2,1,2,6]

**Output:** false

**Example 3:**

**Input:** arr = [4,-2,2,-4]

**Output:** true

**Explanation:** We can take two groups, [-2,-4] and [2,4] to form [-2,-4,2,4] or [2,4,-2,-4].

**Constraints:**

*   <code>2 <= arr.length <= 3 * 10<sup>4</sup></code>
*   `arr.length` is even.
*   <code>-10<sup>5</sup> <= arr[i] <= 10<sup>5</sup></code>