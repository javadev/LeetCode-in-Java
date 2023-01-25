2477\. Minimum Fuel Cost to Report to the Capital

Medium

There is a tree (i.e., a connected, undirected graph with no cycles) structure country network consisting of `n` cities numbered from `0` to `n - 1` and exactly `n - 1` roads. The capital city is city `0`. You are given a 2D integer array `roads` where <code>roads[i] = [a<sub>i</sub>, b<sub>i</sub>]</code> denotes that there exists a **bidirectional road** connecting cities <code>a<sub>i</sub></code> and <code>b<sub>i</sub></code>.

There is a meeting for the representatives of each city. The meeting is in the capital city.

There is a car in each city. You are given an integer `seats` that indicates the number of seats in each car.

A representative can use the car in their city to travel or change the car and ride with another representative. The cost of traveling between two cities is one liter of fuel.

Return _the minimum number of liters of fuel to reach the capital city_.

**Example 1:**

![](https://assets.leetcode.com/uploads/2022/09/22/a4c380025e3ff0c379525e96a7d63a3.png)

**Input:** roads = [[0,1],[0,2],[0,3]], seats = 5

**Output:** 3

**Explanation:**
- Representative<sub>1</sub> goes directly to the capital with 1 liter of fuel. 
- Representative<sub>2</sub> goes directly to the capital with 1 liter of fuel. 
- Representative<sub>3</sub> goes directly to the capital with 1 liter of fuel. 

It costs 3 liters of fuel at minimum. It can be proven that 3 is the minimum number of liters of fuel needed.

**Example 2:**

![](https://assets.leetcode.com/uploads/2022/11/16/2.png)

**Input:** roads = [[3,1],[3,2],[1,0],[0,4],[0,5],[4,6]], seats = 2

**Output:** 7

**Explanation:**
- Representative<sub>2</sub> goes directly to city 3 with 1 liter of fuel.
- Representative<sub>2</sub> and representative<sub>3</sub> go together to city 1 with 1 liter of fuel. 
- Representative<sub>2</sub> and representative<sub>3</sub> go together to the capital with 1 liter of fuel. 
- Representative<sub>1</sub> goes directly to the capital with 1 liter of fuel. 
- Representative<sub>5</sub> goes directly to the capital with 1 liter of fuel. 
- Representative<sub>6</sub> goes directly to city 4 with 1 liter of fuel. 
- Representative<sub>4</sub> and representative<sub>6</sub> go together to the capital with 1 liter of fuel. 

It costs 7 liters of fuel at minimum. 
It can be proven that 7 is the minimum number of liters of fuel needed.

**Example 3:**

![](https://assets.leetcode.com/uploads/2022/09/27/efcf7f7be6830b8763639cfd01b690a.png)

**Input:** roads = [], seats = 1

**Output:** 0

**Explanation:** No representatives need to travel to the capital city.

**Constraints:**

*   <code>1 <= n <= 10<sup>5</sup></code>
*   `roads.length == n - 1`
*   `roads[i].length == 2`
*   <code>0 <= a<sub>i</sub>, b<sub>i</sub> < n</code>
*   <code>a<sub>i</sub> != b<sub>i</sub></code>
*   `roads` represents a valid tree.
*   <code>1 <= seats <= 10<sup>5</sup></code>