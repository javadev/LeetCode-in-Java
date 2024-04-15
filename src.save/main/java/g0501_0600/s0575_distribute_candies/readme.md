575\. Distribute Candies

Easy

Alice has `n` candies, where the <code>i<sup>th</sup></code> candy is of type `candyType[i]`. Alice noticed that she started to gain weight, so she visited a doctor.

The doctor advised Alice to only eat `n / 2` of the candies she has (`n` is always even). Alice likes her candies very much, and she wants to eat the maximum number of different types of candies while still following the doctor's advice.

Given the integer array `candyType` of length `n`, return _the **maximum** number of different types of candies she can eat if she only eats_ `n / 2` _of them_.

**Example 1:**

**Input:** candyType = [1,1,2,2,3,3]

**Output:** 3

**Explanation:** Alice can only eat 6 / 2 = 3 candies. Since there are only 3 types, she can eat one of each type.

**Example 2:**

**Input:** candyType = [1,1,2,3]

**Output:** 2

**Explanation:** Alice can only eat 4 / 2 = 2 candies. Whether she eats types [1,2], [1,3], or [2,3], she still can only eat 2 different types.

**Example 3:**

**Input:** candyType = [6,6,6,6]

**Output:** 1

**Explanation:** Alice can only eat 4 / 2 = 2 candies. Even though she can eat 2 candies, she only has 1 type.

**Constraints:**

*   `n == candyType.length`
*   <code>2 <= n <= 10<sup>4</sup></code>
*   `n` is even.
*   <code>-10<sup>5</sup> <= candyType[i] <= 10<sup>5</sup></code>