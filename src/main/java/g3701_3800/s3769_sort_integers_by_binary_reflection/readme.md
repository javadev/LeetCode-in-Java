3769\. Sort Integers by Binary Reflection

Easy

You are given an integer array `nums`.

The **binary reflection** of a **positive** integer is defined as the number obtained by reversing the order of its **binary** digits (ignoring any leading zeros) and interpreting the resulting binary number as a decimal.

Sort the array in **ascending** order based on the binary reflection of each element. If two different numbers have the same binary reflection, the **smaller** original number should appear first.

Return the resulting sorted array.

**Example 1:**

**Input:** nums = [4,5,4]

**Output:** [4,4,5]

**Explanation:**

Binary reflections are:

*   4 -> (binary) `100` -> (reversed) `001` -> 1
*   5 -> (binary) `101` -> (reversed) `101` -> 5
*   4 -> (binary) `100` -> (reversed) `001` -> 1

Sorting by the reflected values gives `[4, 4, 5]`.

**Example 2:**

**Input:** nums = [3,6,5,8]

**Output:** [8,3,6,5]

**Explanation:**

Binary reflections are:

*   3 -> (binary) `11` -> (reversed) `11` -> 3
*   6 -> (binary) `110` -> (reversed) `011` -> 3
*   5 -> (binary) `101` -> (reversed) `101` -> 5
*   8 -> (binary) `1000` -> (reversed) `0001` -> 1

Sorting by the reflected values gives `[8, 3, 6, 5]`.   
Note that 3 and 6 have the same reflection, so we arrange them in increasing order of original value.

**Constraints:**

*   `1 <= nums.length <= 100`
*   <code>1 <= nums[i] <= 10<sup>9</sup></code>