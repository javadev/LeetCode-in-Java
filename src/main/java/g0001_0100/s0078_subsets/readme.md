78\. Subsets

Medium

Given an integer array `nums` of **unique** elements, return _all possible subsets (the power set)_.

The solution set **must not** contain duplicate subsets. Return the solution in **any order**.

**Example 1:**

**Input:** nums = [1,2,3]

**Output:** [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]] 

**Example 2:**

**Input:** nums = [0]

**Output:** [[],[0]] 

**Constraints:**

*   `1 <= nums.length <= 10`
*   `-10 <= nums[i] <= 10`
*   All the numbers of `nums` are **unique**.

To solve the "Subsets" problem in Java with the Solution class, follow these steps:

1. Define a method `subsets` in the `Solution` class that takes an integer array `nums` as input and returns all possible subsets of `nums`.
2. Initialize an empty list to store the result subsets.
3. Implement a backtracking algorithm to generate all possible subsets:
   - Define a recursive helper function `generateSubsets` that takes the current subset, the current index in the array, and the array `nums` as parameters.
   - Base case: If the current index is equal to the length of `nums`, add the current subset to the result list.
   - Recursive case:
     - Include the current element in the subset and recursively call `generateSubsets` with the next index.
     - Exclude the current element from the subset and recursively call `generateSubsets` with the next index.
4. Call the `generateSubsets` function with an empty subset and the starting index 0.
5. Return the list containing all subsets.

Here's the implementation of the `subsets` method in Java:

```java
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(new ArrayList<>(), 0, nums, result);
        return result;
    }
    
    private void generateSubsets(List<Integer> subset, int index, int[] nums, List<List<Integer>> result) {
        // Base case: add the current subset to the result list
        result.add(new ArrayList<>(subset));
        
        // Recursive case
        for (int i = index; i < nums.length; i++) {
            // Include the current element in the subset
            subset.add(nums[i]);
            // Recursively generate subsets starting from the next index
            generateSubsets(subset, i + 1, nums, result);
            // Exclude the current element from the subset
            subset.remove(subset.size() - 1);
        }
    }
}
```

This implementation uses backtracking to generate all possible subsets of the input array `nums`. It has a time complexity of O(2^N), where N is the number of elements in the input array.