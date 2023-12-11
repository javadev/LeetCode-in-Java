2233\. Maximum Product After K Increments

Medium

You are given an array of non-negative integers `nums` and an integer `k`. In one operation, you may choose **any** element from `nums` and **increment** it by `1`.

Return _the **maximum** **product** of_ `nums` _after **at most**_ `k` _operations._ Since the answer may be very large, return it **modulo** <code>10<sup>9</sup> + 7</code>. Note that you should maximize the product before taking the modulo.

**Example 1:**

**Input:** nums = [0,4], k = 5

**Output:** 20

**Explanation:** Increment the first number 5 times.

Now nums = [5, 4], with a product of 5 \* 4 = 20.

It can be shown that 20 is maximum product possible, so we return 20.

Note that there may be other ways to increment nums to have the maximum product.

**Example 2:**

**Input:** nums = [6,3,3,2], k = 2

**Output:** 216

**Explanation:** Increment the second number 1 time and increment the fourth number 1 time.

Now nums = [6, 4, 3, 3], with a product of 6 \* 4 \* 3 \* 3 = 216.

It can be shown that 216 is maximum product possible, so we return 216.

Note that there may be other ways to increment nums to have the maximum product.

**Constraints:**

*   <code>1 <= nums.length, k <= 10<sup>5</sup></code>
*   <code>0 <= nums[i] <= 10<sup>6</sup></code>