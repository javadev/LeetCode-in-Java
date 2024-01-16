1323\. Maximum 69 Number

Easy

You are given a positive integer `num` consisting only of digits `6` and `9`.

Return _the maximum number you can get by changing **at most** one digit (_`6` _becomes_ `9`_, and_ `9` _becomes_ `6`_)_.

**Example 1:**

**Input:** num = 9669

**Output:** 9969

**Explanation:** 

Changing the first digit results in 6669. 

Changing the second digit results in 9969. 

Changing the third digit results in 9699.

Changing the fourth digit results in 9666. 

The maximum number is 9969.

**Example 2:**

**Input:** num = 9996

**Output:** 9999

**Explanation:** Changing the last digit 6 to 9 results in the maximum number.

**Example 3:**

**Input:** num = 9999

**Output:** 9999

**Explanation:** It is better not to apply any change.

**Constraints:**

*   <code>1 <= num <= 10<sup>4</sup></code>
*   `num` consists of only `6` and `9` digits.