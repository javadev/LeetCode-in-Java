754\. Reach a Number

Medium

You are standing at position `0` on an infinite number line. There is a destination at position `target`.

You can make some number of moves `numMoves` so that:

*   On each move, you can either go left or right.
*   During the <code>i<sup>th</sup></code> move (starting from `i == 1` to `i == numMoves`), you take `i` steps in the chosen direction.

Given the integer `target`, return _the **minimum** number of moves required (i.e., the minimum_ `numMoves`_) to reach the destination_.

**Example 1:**

**Input:** target = 2

**Output:** 3

**Explanation:** 

On the 1<sup>st</sup> move, we step from 0 to 1 (1 step). 

On the 2<sup>nd</sup> move, we step from 1 to -1 (2 steps). 

On the 3<sup>rd</sup> move, we step from -1 to 2 (3 steps).

**Example 2:**

**Input:** target = 3

**Output:** 2

**Explanation:** 

On the 1<sup>st</sup> move, we step from 0 to 1 (1 step). 

On the 2<sup>nd</sup> move, we step from 1 to 3 (2 steps).

**Constraints:**

*   <code>-10<sup>9</sup> <= target <= 10<sup>9</sup></code>
*   `target != 0`