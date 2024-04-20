136\. Single Number

Easy

Given a **non-empty** array of integers `nums`, every element appears _twice_ except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

**Example 1:**

**Input:** nums = [2,2,1]

**Output:** 1 

**Example 2:**

**Input:** nums = [4,1,2,1,2]

**Output:** 4 

**Example 3:**

**Input:** nums = [1]

**Output:** 1 

**Constraints:**

*   <code>1 <= nums.length <= 3 * 10<sup>4</sup></code>
*   <code>-3 * 10<sup>4</sup> <= nums[i] <= 3 * 10<sup>4</sup></code>
*   Each element in the array appears twice except for one element which appears only once.

To solve the "Single Number" problem in Java with a `Solution` class, we'll use bitwise XOR operation. Below are the steps:

1. **Create a `Solution` class**: Define a class named `Solution` to encapsulate our solution methods.

2. **Create a `singleNumber` method**: This method takes an array `nums` as input and returns the single number that appears only once.

3. **Initialize a variable to store the result**: Initialize a variable `singleNumber` to 0.

4. **Iterate through the array and perform bitwise XOR operation**: Iterate through the array `nums`. For each number `num` in the array, perform bitwise XOR operation with the `singleNumber`.

5. **Return the result**: After iterating through the entire array, the `singleNumber` variable will store the single number that appears only once. Return `singleNumber`.

Here's the Java implementation:

```java
class Solution {
    public int singleNumber(int[] nums) {
        int singleNumber = 0; // Initialize variable to store result
        
        // Perform bitwise XOR operation on all elements in the array
        for (int num : nums) {
            singleNumber ^= num;
        }
        
        return singleNumber; // Return the single number
    }
}
```

This implementation follows the steps outlined above and efficiently finds the single number that appears only once in the given array using bitwise XOR operation in Java.