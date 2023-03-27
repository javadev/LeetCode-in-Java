1444\. Number of Ways of Cutting a Pizza

Hard

Given a rectangular pizza represented as a `rows x cols` matrix containing the following characters: `'A'` (an apple) and `'.'` (empty cell) and given the integer `k`. You have to cut the pizza into `k` pieces using `k-1` cuts.

For each cut you choose the direction: vertical or horizontal, then you choose a cut position at the cell boundary and cut the pizza into two pieces. If you cut the pizza vertically, give the left part of the pizza to a person. If you cut the pizza horizontally, give the upper part of the pizza to a person. Give the last piece of pizza to the last person.

_Return the number of ways of cutting the pizza such that each piece contains **at least** one apple. _Since the answer can be a huge number, return this modulo 10^9 + 7.

**Example 1:**

**![](https://assets.leetcode.com/uploads/2020/04/23/ways_to_cut_apple_1.png)**

**Input:** pizza = ["A..","AAA","..."], k = 3

**Output:** 3

**Explanation:** The figure above shows the three ways to cut the pizza. Note that pieces must contain at least one apple.

**Example 2:**

**Input:** pizza = ["A..","AA.","..."], k = 3

**Output:** 1

**Example 3:**

**Input:** pizza = ["A..","A..","..."], k = 1

**Output:** 1

**Constraints:**

*   `1 <= rows, cols <= 50`
*   `rows == pizza.length`
*   `cols == pizza[i].length`
*   `1 <= k <= 10`
*   `pizza` consists of characters `'A'` and `'.'` only.