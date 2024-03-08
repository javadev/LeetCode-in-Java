837\. New 21 Game

Medium

Alice plays the following game, loosely based on the card game **"21"**.

Alice starts with `0` points and draws numbers while she has less than `k` points. During each draw, she gains an integer number of points randomly from the range `[1, maxPts]`, where `maxPts` is an integer. Each draw is independent and the outcomes have equal probabilities.

Alice stops drawing numbers when she gets `k` **or more points**.

Return the probability that Alice has `n` or fewer points.

Answers within <code>10<sup>-5</sup></code> of the actual answer are considered accepted.

**Example 1:**

**Input:** n = 10, k = 1, maxPts = 10

**Output:** 1.00000

**Explanation:** Alice gets a single card, then stops.

**Example 2:**

**Input:** n = 6, k = 1, maxPts = 10

**Output:** 0.60000

**Explanation:** Alice gets a single card, then stops. In 6 out of 10 possibilities, she is at or below 6 points.

**Example 3:**

**Input:** n = 21, k = 17, maxPts = 10

**Output:** 0.73278

**Constraints:**

*   <code>0 <= k <= n <= 10<sup>4</sup></code>
*   <code>1 <= maxPts <= 10<sup>4</sup></code>