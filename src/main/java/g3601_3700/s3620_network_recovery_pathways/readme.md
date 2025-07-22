3620\. Network Recovery Pathways

Hard

You are given a directed acyclic graph of `n` nodes numbered from 0 to `n − 1`. This is represented by a 2D array `edges` of length `m`, where <code>edges[i] = [u<sub>i</sub>, v<sub>i</sub>, cost<sub>i</sub>]</code> indicates a one‑way communication from node <code>u<sub>i</sub></code> to node <code>v<sub>i</sub></code> with a recovery cost of <code>cost<sub>i</sub></code>.

Some nodes may be offline. You are given a boolean array `online` where `online[i] = true` means node `i` is online. Nodes 0 and `n − 1` are always online.

A path from 0 to `n − 1` is **valid** if:

*   All intermediate nodes on the path are online.
*   The total recovery cost of all edges on the path does not exceed `k`.

For each valid path, define its **score** as the minimum edge‑cost along that path.

Return the **maximum** path score (i.e., the largest **minimum**\-edge cost) among all valid paths. If no valid path exists, return -1.

**Example 1:**

**Input:** edges = [[0,1,5],[1,3,10],[0,2,3],[2,3,4]], online = [true,true,true,true], k = 10

**Output:** 3

**Explanation:**

![](https://assets.leetcode.com/uploads/2025/06/06/graph-10.png)

*   The graph has two possible routes from node 0 to node 3:
    
    1.  Path `0 → 1 → 3`
        
        *   Total cost = `5 + 10 = 15`, which exceeds k (`15 > 10`), so this path is invalid.
            
    2.  Path `0 → 2 → 3`
        
        *   Total cost = `3 + 4 = 7 <= k`, so this path is valid.
            
        *   The minimum edge‐cost along this path is `min(3, 4) = 3`.
            
*   There are no other valid paths. Hence, the maximum among all valid path‐scores is 3.
    

**Example 2:**

**Input:** edges = [[0,1,7],[1,4,5],[0,2,6],[2,3,6],[3,4,2],[2,4,6]], online = [true,true,true,false,true], k = 12

**Output:** 6

**Explanation:**

![](https://assets.leetcode.com/uploads/2025/06/06/graph-11.png)

*   Node 3 is offline, so any path passing through 3 is invalid.
    
*   Consider the remaining routes from 0 to 4:
    
    1.  Path `0 → 1 → 4`
        
        *   Total cost = `7 + 5 = 12 <= k`, so this path is valid.
            
        *   The minimum edge‐cost along this path is `min(7, 5) = 5`.
            
    2.  Path `0 → 2 → 3 → 4`
        
        *   Node 3 is offline, so this path is invalid regardless of cost.
            
    3.  Path `0 → 2 → 4`
        
        *   Total cost = `6 + 6 = 12 <= k`, so this path is valid.
            
        *   The minimum edge‐cost along this path is `min(6, 6) = 6`.
            
*   Among the two valid paths, their scores are 5 and 6. Therefore, the answer is 6.
    

**Constraints:**

*   `n == online.length`
*   <code>2 <= n <= 5 * 10<sup>4</sup></code>
*   `0 <= m == edges.length <=` <code>min(10<sup>5</sup>, n * (n - 1) / 2)</code>
*   <code>edges[i] = [u<sub>i</sub>, v<sub>i</sub>, cost<sub>i</sub>]</code>
*   <code>0 <= u<sub>i</sub>, v<sub>i</sub> < n</code>
*   <code>u<sub>i</sub> != v<sub>i</sub></code>
*   <code>0 <= cost<sub>i</sub> <= 10<sup>9</sup></code>
*   <code>0 <= k <= 5 * 10<sup>13</sup></code>
*   `online[i]` is either `true` or `false`, and both `online[0]` and `online[n − 1]` are `true`.
*   The given graph is a directed acyclic graph.