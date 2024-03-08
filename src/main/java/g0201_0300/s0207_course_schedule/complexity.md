**Time Complexity (Big O Time):**

1. The program constructs an adjacency list representation of the directed graph, where each course is a node and prerequisites define edges. Constructing this graph takes O(E) time, where E is the number of prerequisites (edges). In the worst case, E can be proportional to the number of courses (N), so this step is O(N).

2. The program performs a depth-first search (DFS) on the graph to detect cycles. In the worst case, the DFS may visit all nodes, which is O(N).

3. Within the DFS, for each node, the program explores all of its neighbors. In the worst case, this exploration takes O(N) time.

4. Combining all these steps, the overall time complexity is O(N) + O(N) + O(N) = O(N).

So, the time complexity of this program is O(N).

**Space Complexity (Big O Space):**

1. The program uses additional space for several data structures:
   - `adj`: An adjacency list representation of the graph. In the worst case, it has O(E) space, which can be proportional to O(N) in certain scenarios.
   - `colors`: An array to keep track of the colors (WHITE, GRAY, BLACK) of nodes. This array requires O(N) space.
   - Recursive function call stack for DFS, which can go up to O(N) in the worst case when there are no cycles.

2. Ignoring constant factors and smaller terms, the dominant space complexity factors are O(N).

So, the space complexity of this program is O(N).

In summary, the program has a time complexity of O(N) and a space complexity of O(N), where N is the number of courses or nodes in the graph.
