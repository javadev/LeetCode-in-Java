815\. Bus Routes

Hard

You are given an array `routes` representing bus routes where `routes[i]` is a bus route that the <code>i<sup>th</sup></code> bus repeats forever.

*   For example, if `routes[0] = [1, 5, 7]`, this means that the <code>0<sup>th</sup></code> bus travels in the sequence `1 -> 5 -> 7 -> 1 -> 5 -> 7 -> 1 -> ...` forever.

You will start at the bus stop `source` (You are not on any bus initially), and you want to go to the bus stop `target`. You can travel between bus stops by buses only.

Return _the least number of buses you must take to travel from_ `source` _to_ `target`. Return `-1` if it is not possible.

**Example 1:**

**Input:** routes = [[1,2,7],[3,6,7]], source = 1, target = 6

**Output:** 2

**Explanation:** The best strategy is take the first bus to the bus stop 7, then take the second bus to the bus stop 6.

**Example 2:**

**Input:** routes = [[7,12],[4,5,15],[6],[15,19],[9,12,13]], source = 15, target = 12

**Output:** -1

**Constraints:**

*   `1 <= routes.length <= 500`.
*   <code>1 <= routes[i].length <= 10<sup>5</sup></code>
*   All the values of `routes[i]` are **unique**.
*   <code>sum(routes[i].length) <= 10<sup>5</sup></code>
*   <code>0 <= routes[i][j] < 10<sup>6</sup></code>
*   <code>0 <= source, target < 10<sup>6</sup></code>