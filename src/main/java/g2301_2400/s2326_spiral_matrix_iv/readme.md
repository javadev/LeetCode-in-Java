2326\. Spiral Matrix IV

Medium

You are given two integers `m` and `n`, which represent the dimensions of a matrix.

You are also given the `head` of a linked list of integers.

Generate an `m x n` matrix that contains the integers in the linked list presented in **spiral** order **(clockwise)**, starting from the **top-left** of the matrix. If there are remaining empty spaces, fill them with `-1`.

Return _the generated matrix_.

**Example 1:**

![](https://assets.leetcode.com/uploads/2022/05/09/ex1new.jpg)

**Input:** m = 3, n = 5, head = [3,0,2,6,8,1,7,9,4,2,5,5,0]

**Output:** [[3,0,2,6,8],[5,0,-1,-1,1],[5,2,4,9,7]]

**Explanation:** The diagram above shows how the values are printed in the matrix.

Note that the remaining spaces in the matrix are filled with -1.

**Example 2:**

![](https://assets.leetcode.com/uploads/2022/05/11/ex2.jpg)

**Input:** m = 1, n = 4, head = [0,1,2]

**Output:** [[0,1,2,-1]]

**Explanation:** The diagram above shows how the values are printed from left to right in the matrix.

The last space in the matrix is set to -1.

**Constraints:**

*   <code>1 <= m, n <= 10<sup>5</sup></code>
*   <code>1 <= m * n <= 10<sup>5</sup></code>
*   The number of nodes in the list is in the range `[1, m * n]`.
*   `0 <= Node.val <= 1000`