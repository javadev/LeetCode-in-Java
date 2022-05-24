2023\. Number of Pairs of Strings With Concatenation Equal to Target

Medium

Given an array of **digit** strings `nums` and a **digit** string `target`, return _the number of pairs of indices_ `(i, j)` _(where_ `i != j`_) such that the **concatenation** of_ `nums[i] + nums[j]` _equals_ `target`.

**Example 1:**

**Input:** nums = ["777","7","77","77"], target = "7777"

**Output:** 4

**Explanation:** Valid pairs are: 

- (0, 1): "777" + "7" 

- (1, 0): "7" + "777" 

- (2, 3): "77" + "77" 

- (3, 2): "77" + "77"

**Example 2:**

**Input:** nums = ["123","4","12","34"], target = "1234"

**Output:** 2

**Explanation:** Valid pairs are: 

- (0, 1): "123" + "4" 

- (2, 3): "12" + "34"

**Example 3:**

**Input:** nums = ["1","1","1"], target = "11"

**Output:** 6

**Explanation:** Valid pairs are: 

- (0, 1): "1" + "1" 

- (1, 0): "1" + "1" 

- (0, 2): "1" + "1" 

- (2, 0): "1" + "1" 

- (1, 2): "1" + "1" 

- (2, 1): "1" + "1"

**Constraints:**

*   `2 <= nums.length <= 100`
*   `1 <= nums[i].length <= 100`
*   `2 <= target.length <= 100`
*   `nums[i]` and `target` consist of digits.
*   `nums[i]` and `target` do not have leading zeros.