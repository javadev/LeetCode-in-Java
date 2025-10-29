3727\. Maximum Alternating Sum of Squares

Medium

You are given an integer array `nums`. You may **rearrange the elements** in any order.

The **alternating score** of an array `arr` is defined as:

*   <code>score = arr[0]<sup>2</sup> - arr[1]<sup>2</sup> + arr[2]<sup>2</sup> - arr[3]<sup>2</sup> + ...</code>

Return an integer denoting the **maximum possible alternating score** of `nums` after rearranging its elements.

**Example 1:**

**Input:** nums = [1,2,3]

**Output:** 12

**Explanation:**

A possible rearrangement for `nums` is `[2,1,3]`, which gives the maximum alternating score among all possible rearrangements.

The alternating score is calculated as:

<code>score = 2<sup>2</sup> - 1<sup>2</sup> + 3<sup>2</sup> = 4 - 1 + 9 = 12</code>

**Example 2:**

**Input:** nums = [1,-1,2,-2,3,-3]

**Output:** 16

**Explanation:**

A possible rearrangement for `nums` is `[-3,-1,-2,1,3,2]`, which gives the maximum alternating score among all possible rearrangements.

The alternating score is calculated as:

<code>score = (-3)<sup>2</sup> - (-1)<sup>2</sup> + (-2)<sup>2</sup> - (1)<sup>2</sup> + (3)<sup>2</sup> - (2)<sup>2</sup> = 9 - 1 + 4 - 1 + 9 - 4 = 16</code>

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>-4 * 10<sup>4</sup> <= nums[i] <= 4 * 10<sup>4</sup></code>