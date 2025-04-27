3529\. Count Cells in Overlapping Horizontal and Vertical Substrings

Medium

You are given an `m x n` matrix `grid` consisting of characters and a string `pattern`.

A **horizontal substring** is a contiguous sequence of characters read from left to right. If the end of a row is reached before the substring is complete, it wraps to the first column of the next row and continues as needed. You do **not** wrap from the bottom row back to the top.

A **vertical substring** is a contiguous sequence of characters read from top to bottom. If the bottom of a column is reached before the substring is complete, it wraps to the first row of the next column and continues as needed. You do **not** wrap from the last column back to the first.

Count the number of cells in the matrix that satisfy the following condition:

*   The cell must be part of **at least** one horizontal substring and **at least** one vertical substring, where **both** substrings are equal to the given `pattern`.

Return the count of these cells.

**Example 1:**

![](https://assets.leetcode.com/uploads/2025/03/03/gridtwosubstringsdrawio.png)

**Input:** grid = [["a","a","c","c"],["b","b","b","c"],["a","a","b","a"],["c","a","a","c"],["a","a","c","c"]], pattern = "abaca"

**Output:** 1

**Explanation:**

The pattern `"abaca"` appears once as a horizontal substring (colored blue) and once as a vertical substring (colored red), intersecting at one cell (colored purple).

**Example 2:**

![](https://assets.leetcode.com/uploads/2025/03/03/gridexample2fixeddrawio.png)

**Input:** grid = [["c","a","a","a"],["a","a","b","a"],["b","b","a","a"],["a","a","b","a"]], pattern = "aba"

**Output:** 4

**Explanation:**

The cells colored above are all part of at least one horizontal and one vertical substring matching the pattern `"aba"`.

**Example 3:**

**Input:** grid = [["a"]], pattern = "a"

**Output:** 1

**Constraints:**

*   `m == grid.length`
*   `n == grid[i].length`
*   `1 <= m, n <= 1000`
*   <code>1 <= m * n <= 10<sup>5</sup></code>
*   `1 <= pattern.length <= m * n`
*   `grid` and `pattern` consist of only lowercase English letters.