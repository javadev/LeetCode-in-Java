3809\. Best Reachable Tower

Medium

You are given a 2D integer array `towers`, where <code>towers[i] = [x<sub>i</sub>, y<sub>i</sub>, q<sub>i</sub>]</code> represents the coordinates <code>(x<sub>i</sub>, y<sub>i</sub>)</code> and quality factor <code>q<sub>i</sub></code> of the <code>i<sup>th</sup></code> tower.

You are also given an integer array `center = [cx, cy]` representing your location, and an integer `radius`.

A tower is **reachable** if its **Manhattan distance** from `center` is **less than or equal** to `radius`.

Among all reachable towers:

*   Return the coordinates of the tower with the **maximum** quality factor.
*   If there is a tie, return the tower with the **lexicographically smallest** coordinate. If no tower is reachable, return `[-1, -1]`.

The **Manhattan Distance** between two cells <code>(x<sub>i</sub>, y<sub>i</sub>)</code> and <code>(x<sub>j</sub>, y<sub>j</sub>)</code> is <code>|x<sub>i</sub> - x<sub>j</sub>| + |y<sub>i</sub> - y<sub>j</sub>|</code>.

A coordinate <code>[x<sub>i</sub>, y<sub>i</sub>]</code> is **lexicographically smaller** than <code>[x<sub>j</sub>, y<sub>j</sub>]</code> if <code>x<sub>i</sub> < x<sub>j</sub></code>, or <code>x<sub>i</sub> == x<sub>j</sub></code> and <code>y<sub>i</sub> < y<sub>j</sub></code>.

`|x|` denotes the **absolute** **value** of `x`.

**Example 1:**

**Input:** towers = [[1,2,5], [2,1,7], [3,1,9]], center = [1,1], radius = 2

**Output:** [3,1]

**Explanation:**

*   Tower `[1, 2, 5]`: Manhattan distance = `|1 - 1| + |2 - 1| = 1`, reachable.
*   Tower `[2, 1, 7]`: Manhattan distance = `|2 - 1| + |1 - 1| = 1`, reachable.
*   Tower `[3, 1, 9]`: Manhattan distance = `|3 - 1| + |1 - 1| = 2`, reachable.

All towers are reachable. The maximum quality factor is 9, which corresponds to tower `[3, 1]`.

**Example 2:**

**Input:** towers = [[1,3,4], [2,2,4], [4,4,7]], center = [0,0], radius = 5

**Output:** [1,3]

**Explanation:**

*   Tower `[1, 3, 4]`: Manhattan distance = `|1 - 0| + |3 - 0| = 4`, reachable.
*   Tower `[2, 2, 4]`: Manhattan distance = `|2 - 0| + |2 - 0| = 4`, reachable.
*   Tower `[4, 4, 7]`: Manhattan distance = `|4 - 0| + |4 - 0| = 8`, not reachable.

Among the reachable towers, the maximum quality factor is 4. Both `[1, 3]` and `[2, 2]` have the same quality, so the lexicographically smaller coordinate is `[1, 3]`.

**Example 3:**

**Input:** towers = [[5,6,8], [0,3,5]], center = [1,2], radius = 1

**Output:** [-1,-1]

**Explanation:**

*   Tower `[5, 6, 8]`: Manhattan distance = `|5 - 1| + |6 - 2| = 8`, not reachable.
*   Tower `[0, 3, 5]`: Manhattan distance = `|0 - 1| + |3 - 2| = 2`, not reachable.

No tower is reachable within the given radius, so `[-1, -1]` is returned.

**Constraints:**

*   <code>1 <= towers.length <= 10<sup>5</sup></code>
*   <code>towers[i] = [x<sub>i</sub>, y<sub>i</sub>, q<sub>i</sub>]</code>
*   `center = [cx, cy]`
*   <code>0 <= x<sub>i</sub>, y<sub>i</sub>, q<sub>i</sub>, cx, cy <= 10<sup>5</sup></code>
*   <code>0 <= radius <= 10<sup>5</sup></code>