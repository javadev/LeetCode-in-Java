3192\. Minimum Operations to Make Binary Array Elements Equal to One II

Medium

You are given a binary array `nums`.

You can do the following operation on the array **any** number of times (possibly zero):

*   Choose **any** index `i` from the array and **flip** **all** the elements from index `i` to the end of the array.

**Flipping** an element means changing its value from 0 to 1, and from 1 to 0.

Return the **minimum** number of operations required to make all elements in `nums` equal to 1.

**Example 1:**

**Input:** nums = [0,1,1,0,1]

**Output:** 4

**Explanation:**   
 We can do the following operations:

*   Choose the index `i = 1`. The resulting array will be <code>nums = [0,<ins>**0**</ins>,<ins>**0**</ins>,<ins>**1**</ins>,<ins>**0**</ins>]</code>.
*   Choose the index `i = 0`. The resulting array will be <code>nums = [<ins>**1**</ins>,<ins>**1**</ins>,<ins>**1**</ins>,<ins>**0**</ins>,<ins>**1**</ins>]</code>.
*   Choose the index `i = 4`. The resulting array will be <code>nums = [1,1,1,0,<ins>**0**</ins>]</code>.
*   Choose the index `i = 3`. The resulting array will be <code>nums = [1,1,1,<ins>**1**</ins>,<ins>**1**</ins>]</code>.

**Example 2:**

**Input:** nums = [1,0,0,0]

**Output:** 1

**Explanation:**   
 We can do the following operation:

*   Choose the index `i = 1`. The resulting array will be <code>nums = [1,<ins>**1**</ins>,<ins>**1**</ins>,<ins>**1**</ins>]</code>.

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   `0 <= nums[i] <= 1`