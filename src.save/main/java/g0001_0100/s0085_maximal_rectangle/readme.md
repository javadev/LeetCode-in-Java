85\. Maximal Rectangle

Hard

Given a `rows x cols` binary `matrix` filled with `0`'s and `1`'s, find the largest rectangle containing only `1`'s and return _its area_.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/09/14/maximal.jpg)

**Input:** matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]

**Output:** 6

**Explanation:** The maximal rectangle is shown in the above picture. 

**Example 2:**

**Input:** matrix = []

**Output:** 0 

**Example 3:**

**Input:** matrix = [["0"]]

**Output:** 0 

**Example 4:**

**Input:** matrix = [["1"]]

**Output:** 1 

**Example 5:**

**Input:** matrix = [["0","0"]]

**Output:** 0 

**Constraints:**

*   `rows == matrix.length`
*   `cols == matrix[i].length`
*   `0 <= row, cols <= 200`
*   `matrix[i][j]` is `'0'` or `'1'`.