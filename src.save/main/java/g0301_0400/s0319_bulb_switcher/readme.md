319\. Bulb Switcher

Medium

There are `n` bulbs that are initially off. You first turn on all the bulbs, then you turn off every second bulb.

On the third round, you toggle every third bulb (turning on if it's off or turning off if it's on). For the <code>i<sup>th</sup></code> round, you toggle every `i` bulb. For the <code>n<sup>th</sup></code> round, you only toggle the last bulb.

Return _the number of bulbs that are on after `n` rounds_.

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/11/05/bulb.jpg)

**Input:** n = 3

**Output:** 1

**Explanation:** At first, the three bulbs are [off, off, off]. After the first round, the three bulbs are [on, on, on]. After the second round, the three bulbs are [on, off, on]. After the third round, the three bulbs are [on, off, off]. So you should return 1 because there is only one bulb is on.

**Example 2:**

**Input:** n = 0

**Output:** 0 

**Example 3:**

**Input:** n = 1

**Output:** 1 

**Constraints:**

*   <code>0 <= n <= 10<sup>9</sup></code>