875\. Koko Eating Bananas

Medium

Koko loves to eat bananas. There are `n` piles of bananas, the <code>i<sup>th</sup></code> pile has `piles[i]` bananas. The guards have gone and will come back in `h` hours.

Koko can decide her bananas-per-hour eating speed of `k`. Each hour, she chooses some pile of bananas and eats `k` bananas from that pile. If the pile has less than `k` bananas, she eats all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return _the minimum integer_ `k` _such that she can eat all the bananas within_ `h` _hours_.

**Example 1:**

**Input:** piles = [3,6,7,11], h = 8

**Output:** 4

**Example 2:**

**Input:** piles = [30,11,23,4,20], h = 5

**Output:** 30

**Example 3:**

**Input:** piles = [30,11,23,4,20], h = 6

**Output:** 23

**Constraints:**

*   <code>1 <= piles.length <= 10<sup>4</sup></code>
*   <code>piles.length <= h <= 10<sup>9</sup></code>
*   <code>1 <= piles[i] <= 10<sup>9</sup></code>