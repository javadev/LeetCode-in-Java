1707\. Maximum XOR With an Element From Array

Hard

You are given an array `nums` consisting of non-negative integers. You are also given a `queries` array, where <code>queries[i] = [x<sub>i</sub>, m<sub>i</sub>]</code>.

The answer to the <code>i<sup>th</sup></code> query is the maximum bitwise `XOR` value of <code>x<sub>i</sub></code> and any element of `nums` that does not exceed <code>m<sub>i</sub></code>. In other words, the answer is <code>max(nums[j] XOR x<sub>i</sub>)</code> for all `j` such that <code>nums[j] <= m<sub>i</sub></code>. If all elements in `nums` are larger than <code>m<sub>i</sub></code>, then the answer is `-1`.

Return _an integer array_ `answer` _where_ `answer.length == queries.length` _and_ `answer[i]` _is the answer to the_ <code>i<sup>th</sup></code> _query._

**Example 1:**

**Input:** nums = [0,1,2,3,4], queries = [[3,1],[1,3],[5,6]]

**Output:** [3,3,7]

**Explanation:** 

1) 0 and 1 are the only two integers not greater than 1. 0 XOR 3 = 3 and 1 XOR 3 = 2. The larger of the two is 3. 

2) 1 XOR 2 = 3. 

3) 5 XOR 2 = 7.

**Example 2:**

**Input:** nums = [5,2,4,6,6,3], queries = [[12,4],[8,1],[6,3]]

**Output:** [15,-1,5]

**Constraints:**

*   <code>1 <= nums.length, queries.length <= 10<sup>5</sup></code>
*   `queries[i].length == 2`
*   <code>0 <= nums[j], x<sub>i</sub>, m<sub>i</sub> <= 10<sup>9</sup></code>