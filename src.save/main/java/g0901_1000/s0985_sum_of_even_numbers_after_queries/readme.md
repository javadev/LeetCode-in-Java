985\. Sum of Even Numbers After Queries

Medium

You are given an integer array `nums` and an array `queries` where <code>queries[i] = [val<sub>i</sub>, index<sub>i</sub>]</code>.

For each query `i`, first, apply <code>nums[index<sub>i</sub>] = nums[index<sub>i</sub>] + val<sub>i</sub></code>, then print the sum of the even values of `nums`.

Return _an integer array_ `answer` _where_ `answer[i]` _is the answer to the_ <code>i<sup>th</sup></code> _query_.

**Example 1:**

**Input:** nums = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]

**Output:** [8,6,2,4]

**Explanation:** At the beginning, the array is [1,2,3,4].

After adding 1 to nums[0], the array is [2,2,3,4], and the sum of even values is 2 + 2 + 4 = 8.

After adding -3 to nums[1], the array is [2,-1,3,4], and the sum of even values is 2 + 4 = 6.

After adding -4 to nums[0], the array is [-2,-1,3,4], and the sum of even values is -2 + 4 = 2.

After adding 2 to nums[3], the array is [-2,-1,3,6], and the sum of even values is -2 + 6 = 4.

**Example 2:**

**Input:** nums = [1], queries = [[4,0]]

**Output:** [0]

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>4</sup></code>
*   <code>-10<sup>4</sup> <= nums[i] <= 10<sup>4</sup></code>
*   <code>1 <= queries.length <= 10<sup>4</sup></code>
*   <code>-10<sup>4</sup> <= val<sub>i</sub> <= 10<sup>4</sup></code>
*   <code>0 <= index<sub>i</sub> < nums.length</code>