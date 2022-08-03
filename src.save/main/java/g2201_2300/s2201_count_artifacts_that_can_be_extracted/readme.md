2201\. Count Artifacts That Can Be Extracted

Medium

There is an `n x n` **0-indexed** grid with some artifacts buried in it. You are given the integer `n` and a **0-indexed** 2D integer array `artifacts` describing the positions of the rectangular artifacts where <code>artifacts[i] = [r1<sub>i</sub>, c1<sub>i</sub>, r2<sub>i</sub>, c2<sub>i</sub>]</code> denotes that the <code>i<sup>th</sup></code> artifact is buried in the subgrid where:

*   <code>(r1<sub>i</sub>, c1<sub>i</sub>)</code> is the coordinate of the **top-left** cell of the <code>i<sup>th</sup></code> artifact and
*   <code>(r2<sub>i</sub>, c2<sub>i</sub>)</code> is the coordinate of the **bottom-right** cell of the <code>i<sup>th</sup></code> artifact.

You will excavate some cells of the grid and remove all the mud from them. If the cell has a part of an artifact buried underneath, it will be uncovered. If all the parts of an artifact are uncovered, you can extract it.

Given a **0-indexed** 2D integer array `dig` where <code>dig[i] = [r<sub>i</sub>, c<sub>i</sub>]</code> indicates that you will excavate the cell <code>(r<sub>i</sub>, c<sub>i</sub>)</code>, return _the number of artifacts that you can extract_.

The test cases are generated such that:

*   No two artifacts overlap.
*   Each artifact only covers at most `4` cells.
*   The entries of `dig` are unique.

**Example 1:**

![](https://assets.leetcode.com/uploads/2019/09/16/untitled-diagram.jpg)

**Input:** n = 2, artifacts = [[0,0,0,0],[0,1,1,1]], dig = [[0,0],[0,1]]

**Output:** 1

**Explanation:** The different colors represent different artifacts. Excavated cells are labeled with a 'D' in the grid. There is 1 artifact that can be extracted, namely the red artifact. The blue artifact has one part in cell (1,1) which remains uncovered, so we cannot extract it. Thus, we return 1.

**Example 2:**

![](https://assets.leetcode.com/uploads/2019/09/16/untitled-diagram-1.jpg)

**Input:** n = 2, artifacts = [[0,0,0,0],[0,1,1,1]], dig = [[0,0],[0,1],[1,1]]

**Output:** 2

**Explanation:** Both the red and blue artifacts have all parts uncovered (labeled with a 'D') and can be extracted, so we return 2.

**Constraints:**

*   `1 <= n <= 1000`
*   <code>1 <= artifacts.length, dig.length <= min(n<sup>2</sup>, 10<sup>5</sup>)</code>
*   `artifacts[i].length == 4`
*   `dig[i].length == 2`
*   <code>0 <= r1<sub>i</sub>, c1<sub>i</sub>, r2<sub>i</sub>, c2<sub>i</sub>, r<sub>i</sub>, c<sub>i</sub> <= n - 1</code>
*   <code>r1<sub>i</sub> <= r2<sub>i</sub></code>
*   <code>c1<sub>i</sub> <= c2<sub>i</sub></code>
*   No two artifacts will overlap.
*   The number of cells covered by an artifact is **at most** `4`.
*   The entries of `dig` are unique.