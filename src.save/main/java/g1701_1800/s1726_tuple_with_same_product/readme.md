1726\. Tuple with Same Product

Medium

Given an array `nums` of **distinct** positive integers, return _the number of tuples_ `(a, b, c, d)` _such that_ `a * b = c * d` _where_ `a`_,_ `b`_,_ `c`_, and_ `d` _are elements of_ `nums`_, and_ `a != b != c != d`_._

**Example 1:**

**Input:** nums = [2,3,4,6]

**Output:** 8

**Explanation:** There are 8 valid tuples: 

(2,6,3,4) , (2,6,4,3) , (6,2,3,4) , (6,2,4,3) 

(3,4,2,6) , (4,3,2,6) , (3,4,6,2) , (4,3,6,2)

**Example 2:**

**Input:** nums = [1,2,4,5,10]

**Output:** 16

**Explanation:** There are 16 valid tuples: 

(1,10,2,5) , (1,10,5,2) , (10,1,2,5) , (10,1,5,2) 

(2,5,1,10) , (2,5,10,1) , (5,2,1,10) , (5,2,10,1) 

(2,10,4,5) , (2,10,5,4) , (10,2,4,5) , (10,2,5,4) 

(4,5,2,10) , (4,5,10,2) , (5,4,2,10) , (5,4,10,2)

**Constraints:**

*   `1 <= nums.length <= 1000`
*   <code>1 <= nums[i] <= 10<sup>4</sup></code>
*   All elements in `nums` are **distinct**.