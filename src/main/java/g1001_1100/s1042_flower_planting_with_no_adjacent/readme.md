1042\. Flower Planting With No Adjacent

Medium

You have `n` gardens, labeled from `1` to `n`, and an array `paths` where <code>paths[i] = [x<sub>i</sub>, y<sub>i</sub>]</code> describes a bidirectional path between garden <code>x<sub>i</sub></code> to garden <code>y<sub>i</sub></code>. In each garden, you want to plant one of 4 types of flowers.

All gardens have **at most 3** paths coming into or leaving it.

Your task is to choose a flower type for each garden such that, for any two gardens connected by a path, they have different types of flowers.

Return _**any** such a choice as an array_ `answer`_, where_ `answer[i]` _is the type of flower planted in the_ <code>(i+1)<sup>th</sup></code> _garden. The flower types are denoted_ `1`_,_ `2`_,_ `3`_, or_ `4`_. It is guaranteed an answer exists._

**Example 1:**

**Input:** n = 3, paths = [[1,2],[2,3],[3,1]]

**Output:** [1,2,3]

**Explanation:** 

Gardens 1 and 2 have different types. 

Gardens 2 and 3 have different types. 

Gardens 3 and 1 have different types. 

Hence, [1,2,3] is a valid answer. Other valid answers include [1,2,4], [1,4,2], and [3,2,1].

**Example 2:**

**Input:** n = 4, paths = [[1,2],[3,4]]

**Output:** [1,2,1,2]

**Example 3:**

**Input:** n = 4, paths = [[1,2],[2,3],[3,4],[4,1],[1,3],[2,4]]

**Output:** [1,2,3,4]

**Constraints:**

*   <code>1 <= n <= 10<sup>4</sup></code>
*   <code>0 <= paths.length <= 2 * 10<sup>4</sup></code>
*   `paths[i].length == 2`
*   <code>1 <= x<sub>i</sub>, y<sub>i</sub> <= n</code>
*   <code>x<sub>i</sub> != y<sub>i</sub></code>
*   Every garden has **at most 3** paths coming into or leaving it.