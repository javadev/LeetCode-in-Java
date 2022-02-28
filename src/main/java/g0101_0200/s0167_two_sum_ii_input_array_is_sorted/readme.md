167\. Two Sum II - Input Array Is Sorted

Easy

Given a **1-indexed** array of integers `numbers` that is already **_sorted in non-decreasing order_**, find two numbers such that they add up to a specific `target` number. Let these two numbers be <code>numbers[index<sub>1</sub>]</code> and <code>numbers[index<sub>2</sub>]</code> where <code>1 <= index<sub>1</sub> < index<sub>2</sub> <= numbers.length</code>.

Return _the indices of the two numbers,_ <code>index<sub>1</sub></code> _and_ <code>index<sub>2</sub></code>_, **added by one** as an integer array_ <code>[index<sub>1</sub>, index<sub>2</sub>]</code> _of length 2._

The tests are generated such that there is **exactly one solution**. You **may not** use the same element twice.

**Example 1:**

**Input:** numbers = [2,7,11,15], target = 9

**Output:** [1,2]

**Explanation:** The sum of 2 and 7 is 9. Therefore, index<sub>1</sub> = 1, index<sub>2</sub> = 2. We return [1, 2]. 

**Example 2:**

**Input:** numbers = [2,3,4], target = 6

**Output:** [1,3]

**Explanation:** The sum of 2 and 4 is 6. Therefore index<sub>1</sub> = 1, index<sub>2</sub> = 3. We return [1, 3]. 

**Example 3:**

**Input:** numbers = [\-1,0], target = -1

**Output:** [1,2]

**Explanation:** The sum of -1 and 0 is -1. Therefore index<sub>1</sub> = 1, index<sub>2</sub> = 2. We return [1, 2]. 

**Constraints:**

*   <code>2 <= numbers.length <= 3 * 10<sup>4</sup></code>
*   `-1000 <= numbers[i] <= 1000`
*   `numbers` is sorted in **non-decreasing order**.
*   `-1000 <= target <= 1000`
*   The tests are generated such that there is **exactly one solution**.