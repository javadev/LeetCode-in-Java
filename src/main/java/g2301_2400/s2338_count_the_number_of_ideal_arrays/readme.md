2338\. Count the Number of Ideal Arrays

Hard

You are given two integers `n` and `maxValue`, which are used to describe an **ideal** array.

A **0-indexed** integer array `arr` of length `n` is considered **ideal** if the following conditions hold:

*   Every `arr[i]` is a value from `1` to `maxValue`, for `0 <= i < n`.
*   Every `arr[i]` is divisible by `arr[i - 1]`, for `0 < i < n`.

Return _the number of **distinct** ideal arrays of length_ `n`. Since the answer may be very large, return it modulo <code>10<sup>9</sup> + 7</code>.

**Example 1:**

**Input:** n = 2, maxValue = 5

**Output:** 10

**Explanation:** The following are the possible ideal arrays:

- Arrays starting with the value 1 (5 arrays): [1,1], [1,2], [1,3], [1,4], [1,5]

- Arrays starting with the value 2 (2 arrays): [2,2], [2,4]

- Arrays starting with the value 3 (1 array): [3,3]

- Arrays starting with the value 4 (1 array): [4,4]

- Arrays starting with the value 5 (1 array): [5,5]

There are a total of 5 + 2 + 1 + 1 + 1 = 10 distinct ideal arrays. 

**Example 2:**

**Input:** n = 5, maxValue = 3

**Output:** 11

**Explanation:** The following are the possible ideal arrays:

- Arrays starting with the value 1 (9 arrays):

   - With no other distinct values (1 array): [1,1,1,1,1]

   - With 2<sup>nd</sup> distinct value 2 (4 arrays): [1,1,1,1,2], [1,1,1,2,2], [1,1,2,2,2], [1,2,2,2,2]
   
   - With 2<sup>nd</sup> distinct value 3 (4 arrays): [1,1,1,1,3], [1,1,1,3,3], [1,1,3,3,3], [1,3,3,3,3]
   
- Arrays starting with the value 2 (1 array): [2,2,2,2,2]

- Arrays starting with the value 3 (1 array): [3,3,3,3,3]

There are a total of 9 + 1 + 1 = 11 distinct ideal arrays. 

**Constraints:**

*   <code>2 <= n <= 10<sup>4</sup></code>
*   <code>1 <= maxValue <= 10<sup>4</sup></code>