3968\. Maximum Manhattan Distance After All Moves

Medium

You are given a string `moves` consisting of the characters `'U'`, `'D'`, `'L'`, `'R'`, and `'_'`.

Starting from the origin `(0, 0)`, each character represents one move on a 2D plane:

*   `'U'`: Move up by 1 unit.
*   `'D'`: Move down by 1 unit.
*   `'L'`: Move left by 1 unit.
*   `'R'`: Move right by 1 unit.
*   `'_'`: Can be independently replaced with any one of `'U'`, `'D'`, `'L'`, or `'R'`.

Return the maximum **Manhattan distance** from the origin that can be achieved after all moves have been performed.

**Example 1:**

**Input:** moves = "L\_D\_"

**Output:** 4

**Explanation:**

One optimal choice is:

*   `'L'`: `(0, 0) -> (-1, 0)`
*   `'_'` treated as `'D'`: `(-1, 0) -> (-1, -1)`
*   `'D'`: `(-1, -1) -> (-1, -2)`
*   `'_'` treated as `'L'`: `(-1, -2) -> (-2, -2)`

The final Manhattan distance from the origin is `|0 - (-2)| + |0 - (-2)| = 4`.

**Example 2:**

**Input:** moves = "U\_R"

**Output:** 3

**Explanation:**

One optimal choice is:

*   `'U'`: `(0, 0) -> (0, 1)`
*   `'_'` treated as `'U'`: `(0, 1) -> (0, 2)`
*   `'R'`: `(0, 2) -> (1, 2)`

The final Manhattan distance from the origin is `|0 - 1| + |0 - 2| = 3`.

**Constraints:**

*   <code>1 <= moves.length <= 10<sup>5</sup></code>
*   `moves` consists of only `'U'`, `'D'`, `'L'`, `'R'`, and `'_'`.