1539\. Kth Missing Positive Number

Easy

Given an array `arr` of positive integers sorted in a **strictly increasing order**, and an integer `k`.

_Find the_ <code>k<sup>th</sup></code> _positive integer that is missing from this array._

**Example 1:**

**Input:** arr = [2,3,4,7,11], k = 5

**Output:** 9

**Explanation:** The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5<sup>th</sup> missing positive integer is 9.

**Example 2:**

**Input:** arr = [1,2,3,4], k = 2

**Output:** 6

**Explanation:** The missing positive integers are [5,6,7,...]. The 2<sup>nd</sup> missing positive integer is 6.

**Constraints:**

*   `1 <= arr.length <= 1000`
*   `1 <= arr[i] <= 1000`
*   `1 <= k <= 1000`
*   `arr[i] < arr[j]` for `1 <= i < j <= arr.length`