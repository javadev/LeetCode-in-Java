2260\. Minimum Consecutive Cards to Pick Up

Medium

You are given an integer array `cards` where `cards[i]` represents the **value** of the <code>i<sup>th</sup></code> card. A pair of cards are **matching** if the cards have the **same** value.

Return _the **minimum** number of **consecutive** cards you have to pick up to have a pair of **matching** cards among the picked cards._ If it is impossible to have matching cards, return `-1`.

**Example 1:**

**Input:** cards = [3,4,2,3,4,7]

**Output:** 4

**Explanation:** We can pick up the cards [3,4,2,3] which contain a matching pair of cards with value 3.

Note that picking up the cards [4,2,3,4] is also optimal.

**Example 2:**

**Input:** cards = [1,0,5,3]

**Output:** -1

**Explanation:** There is no way to pick up a set of consecutive cards that contain a pair of matching cards. 

**Constraints:**

*   <code>1 <= cards.length <= 10<sup>5</sup></code>
*   <code>0 <= cards[i] <= 10<sup>6</sup></code>