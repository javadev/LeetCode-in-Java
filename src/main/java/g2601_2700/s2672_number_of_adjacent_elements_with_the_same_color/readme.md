2672\. Number of Adjacent Elements With the Same Color

Medium

There is a **0-indexed** array `nums` of length `n`. Initially, all elements are **uncolored** (has a value of `0`).

You are given a 2D integer array `queries` where <code>queries[i] = [index<sub>i</sub>, color<sub>i</sub>]</code>.

For each query, you color the index <code>index<sub>i</sub></code> with the color <code>color<sub>i</sub></code> in the array `nums`.

Return _an array_ `answer` _of the same length as_ `queries` _where_ `answer[i]` _is the number of adjacent elements with the same color **after** the_ <code>i<sup>th</sup></code> _query_.

More formally, `answer[i]` is the number of indices `j`, such that `0 <= j < n - 1` and `nums[j] == nums[j + 1]` and `nums[j] != 0` after the <code>i<sup>th</sup></code> query.

**Example 1:**

**Input:** n = 4, queries = [[0,2],[1,2],[3,1],[1,1],[2,1]]

**Output:** [0,1,1,0,2]

**Explanation:** Initially array nums = [0,0,0,0], where 0 denotes uncolored elements of the array.
- After the 1<sup>st</sup> query nums = [2,0,0,0]. The count of adjacent elements with the same color is 0. 
- After the 2<sup>nd</sup> query nums = [2,2,0,0]. The count of adjacent elements with the same color is 1.
- After the 3<sup>rd</sup> query nums = [2,2,0,1]. The count of adjacent elements with the same color is 1. 
- After the 4<sup>th</sup> query nums = [2,1,0,1]. The count of adjacent elements with the same color is 0. 
- After the 5<sup>th</sup> query nums = [2,1,1,1]. The count of adjacent elements with the same color is 2.

**Example 2:**

**Input:** n = 1, queries = [[0,100000]]

**Output:** [0]

**Explanation:** Initially array nums = [0], where 0 denotes uncolored elements of the array. 
- After the 1<sup>st</sup> query nums = [100000]. The count of adjacent elements with the same color is 0.

**Constraints:**

*   <code>1 <= n <= 10<sup>5</sup></code>
*   <code>1 <= queries.length <= 10<sup>5</sup></code>
*   `queries[i].length == 2`
*   <code>0 <= index<sub>i</sub> <= n - 1</code>
*   <code>1 <= color<sub>i</sub> <= 10<sup>5</sup></code>