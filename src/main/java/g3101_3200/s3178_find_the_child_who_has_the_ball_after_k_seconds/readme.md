3178\. Find the Child Who Has the Ball After K Seconds

Easy

You are given two **positive** integers `n` and `k`. There are `n` children numbered from `0` to `n - 1` standing in a queue _in order_ from left to right.

Initially, child 0 holds a ball and the direction of passing the ball is towards the right direction. After each second, the child holding the ball passes it to the child next to them. Once the ball reaches **either** end of the line, i.e. child 0 or child `n - 1`, the direction of passing is **reversed**.

Return the number of the child who receives the ball after `k` seconds.

**Example 1:**

**Input:** n = 3, k = 5

**Output:** 1

**Explanation:**

Time elapsed

Children

`0`

<code>[<ins>0</ins>, 1, 2]</code>

`1`

<code>[0, <ins>1</ins>, 2]</code>

`2`

<code>[0, 1, <ins>2</ins>]</code>

`3`

<code>[0, <ins>1</ins>, 2]</code>

`4`

<code>[<ins>0</ins>, 1, 2]</code>

`5`

<code>[0, <ins>1</ins>, 2]</code>

**Example 2:**

**Input:** n = 5, k = 6

**Output:** 2

**Explanation:**

Time elapsed

Children

`0`

<code>[<ins>0</ins>, 1, 2, 3, 4]</code>

`1`

<code>[0, <ins>1</ins>, 2, 3, 4]</code>

`2`

<code>[0, 1, <ins>2</ins>, 3, 4]</code>

`3`

<code>[0, 1, 2, <ins>3</ins>, 4]</code>

`4`

<code>[0, 1, 2, 3, <ins>4</ins>]</code>

`5`

<code>[0, 1, 2, <ins>3</ins>, 4]</code>

`6`

<code>[0, 1, <ins>2</ins>, 3, 4]</code>

**Example 3:**

**Input:** n = 4, k = 2

**Output:** 2

**Explanation:**

Time elapsed

Children

`0`

<code>[<ins>0</ins>, 1, 2, 3]</code>

`1`

<code>[0, <ins>1</ins>, 2, 3]</code>

`2`

<code>[0, 1, <ins>2</ins>, 3]</code>

**Constraints:**

*   `2 <= n <= 50`
*   `1 <= k <= 50`