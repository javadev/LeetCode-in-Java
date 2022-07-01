886\. Possible Bipartition

Medium

We want to split a group of `n` people (labeled from `1` to `n`) into two groups of **any size**. Each person may dislike some other people, and they should not go into the same group.

Given the integer `n` and the array `dislikes` where <code>dislikes[i] = [a<sub>i</sub>, b<sub>i</sub>]</code> indicates that the person labeled <code>a<sub>i</sub></code> does not like the person labeled <code>b<sub>i</sub></code>, return `true` _if it is possible to split everyone into two groups in this way_.

**Example 1:**

**Input:** n = 4, dislikes = [[1,2],[1,3],[2,4]]

**Output:** true

**Explanation:** group1 [1,4] and group2 [2,3]. 

**Example 2:**

**Input:** n = 3, dislikes = [[1,2],[1,3],[2,3]]

**Output:** false 

**Example 3:**

**Input:** n = 5, dislikes = [[1,2],[2,3],[3,4],[4,5],[1,5]]

**Output:** false 

**Constraints:**

*   `1 <= n <= 2000`
*   <code>0 <= dislikes.length <= 10<sup>4</sup></code>
*   `dislikes[i].length == 2`
*   `1 <= dislikes[i][j] <= n`
*   <code>a<sub>i</sub> < b<sub>i</sub></code>
*   All the pairs of `dislikes` are **unique**.