1829\. Maximum XOR for Each Query

Medium

You are given a **sorted** array `nums` of `n` non-negative integers and an integer `maximumBit`. You want to perform the following query `n` **times**:

1.  Find a non-negative integer <code>k < 2<sup>maximumBit</sup></code> such that `nums[0] XOR nums[1] XOR ... XOR nums[nums.length-1] XOR k` is **maximized**. `k` is the answer to the <code>i<sup>th</sup></code> query.
2.  Remove the **last** element from the current array `nums`.

Return _an array_ `answer`_, where_ `answer[i]` _is the answer to the_ <code>i<sup>th</sup></code> _query_.

**Example 1:**

**Input:** nums = [0,1,1,3], maximumBit = 2

**Output:** [0,3,2,3]

**Explanation:** The queries are answered as follows: 

1<sup>st</sup> query: nums = [0,1,1,3], k = 0 since 0 XOR 1 XOR 1 XOR 3 XOR 0 = 3. 

2<sup>nd</sup> query: nums = [0,1,1], k = 3 since 0 XOR 1 XOR 1 XOR 3 = 3. 

3<sup>rd</sup> query: nums = [0,1], k = 2 since 0 XOR 1 XOR 2 = 3. 

4<sup>th</sup> query: nums = [0], k = 3 since 0 XOR 3 = 3.

**Example 2:**

**Input:** nums = [2,3,4,7], maximumBit = 3

**Output:** [5,2,6,5]

**Explanation:** The queries are answered as follows: 

1<sup>st</sup> query: nums = [2,3,4,7], k = 5 since 2 XOR 3 XOR 4 XOR 7 XOR 5 = 7. 

2<sup>nd</sup> query: nums = [2,3,4], k = 2 since 2 XOR 3 XOR 4 XOR 2 = 7. 

3<sup>rd</sup> query: nums = [2,3], k = 6 since 2 XOR 3 XOR 6 = 7. 

4<sup>th</sup> query: nums = [2], k = 5 since 2 XOR 5 = 7.

**Example 3:**

**Input:** nums = [0,1,2,2,5,7], maximumBit = 3

**Output:** [4,3,6,4,6,7]

**Constraints:**

*   `nums.length == n`
*   <code>1 <= n <= 10<sup>5</sup></code>
*   `1 <= maximumBit <= 20`
*   <code>0 <= nums[i] < 2<sup>maximumBit</sup></code>
*   `nums` is sorted in **ascending** order.