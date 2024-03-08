2961\. Double Modular Exponentiation

Medium

You are given a **0-indexed** 2D array `variables` where <code>variables[i] = [a<sub>i</sub>, b<sub>i</sub>, c<sub>i,</sub> m<sub>i</sub>]</code>, and an integer `target`.

An index `i` is **good** if the following formula holds:

*   `0 <= i < variables.length`
*   <code>((a<sub>i</sub><sup>b<sub>i</sub></sup> % 10)<sup>c<sub>i</sub></sup>) % m<sub>i</sub> == target</code>

Return _an array consisting of **good** indices in **any order**_.

**Example 1:**

**Input:** variables = [[2,3,3,10],[3,3,3,1],[6,1,1,4]], target = 2

**Output:** [0,2]

**Explanation:** For each index i in the variables array: 
1) For the index 0, variables[0] = [2,3,3,10], (2<sup>3</sup> % 10)<sup>3</sup> % 10 = 2. 
2) For the index 1, variables[1] = [3,3,3,1], (3<sup>3</sup> % 10)<sup>3</sup> % 1 = 0. 
3) For the index 2, variables[2] = [6,1,1,4], (6<sup>1</sup> % 10)<sup>1</sup> % 4 = 2. 

Therefore we return [0,2] as the answer.

**Example 2:**

**Input:** variables = [[39,3,1000,1000]], target = 17

**Output:** []

**Explanation:** For each index i in the variables array: 
1) For the index 0, variables[0] = [39,3,1000,1000], (39<sup>3</sup> % 10)<sup>1000</sup> % 1000 = 1. 

Therefore we return [] as the answer.

**Constraints:**

*   `1 <= variables.length <= 100`
*   <code>variables[i] == [a<sub>i</sub>, b<sub>i</sub>, c<sub>i</sub>, m<sub>i</sub>]</code>
*   <code>1 <= a<sub>i</sub>, b<sub>i</sub>, c<sub>i</sub>, m<sub>i</sub> <= 10<sup>3</sup></code>
*   <code>0 <= target <= 10<sup>3</sup></code>