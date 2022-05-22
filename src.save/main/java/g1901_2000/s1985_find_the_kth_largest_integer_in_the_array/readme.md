1985\. Find the Kth Largest Integer in the Array

Medium

You are given an array of strings `nums` and an integer `k`. Each string in `nums` represents an integer without leading zeros.

Return _the string that represents the_ <code>k<sup>th</sup></code> _**largest integer** in_ `nums`.

**Note**: Duplicate numbers should be counted distinctly. For example, if `nums` is `["1","2","2"]`, `"2"` is the first largest integer, `"2"` is the second-largest integer, and `"1"` is the third-largest integer.

**Example 1:**

**Input:** nums = ["3","6","7","10"], k = 4

**Output:** "3"

**Explanation:** 

The numbers in nums sorted in non-decreasing order are ["3","6","7","10"]. 

The 4<sup>th</sup> largest integer in nums is "3".

**Example 2:**

**Input:** nums = ["2","21","12","1"], k = 3

**Output:** "2"

**Explanation:** 

The numbers in nums sorted in non-decreasing order are ["1","2","12","21"]. 

The 3<sup>rd</sup> largest integer in nums is "2".

**Example 3:**

**Input:** nums = ["0","0"], k = 2

**Output:** "0"

**Explanation:** 

The numbers in nums sorted in non-decreasing order are ["0","0"]. 

The 2<sup>nd</sup> largest integer in nums is "0".

**Constraints:**

*   <code>1 <= k <= nums.length <= 10<sup>4</sup></code>
*   `1 <= nums[i].length <= 100`
*   `nums[i]` consists of only digits.
*   `nums[i]` will not have any leading zeros.