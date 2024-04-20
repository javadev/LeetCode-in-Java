39\. Combination Sum

Medium

Given an array of **distinct** integers `candidates` and a target integer `target`, return _a list of all **unique combinations** of_ `candidates` _where the chosen numbers sum to_ `target`_._ You may return the combinations in **any order**.

The **same** number may be chosen from `candidates` an **unlimited number of times**. Two combinations are unique if the frequency of at least one of the chosen numbers is different.

It is **guaranteed** that the number of unique combinations that sum up to `target` is less than `150` combinations for the given input.

**Example 1:**

**Input:** candidates = [2,3,6,7], target = 7

**Output:** [[2,2,3],[7]]

**Explanation:**

    2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
    7 is a candidate, and 7 = 7.
    These are the only two combinations. 

**Example 2:**

**Input:** candidates = [2,3,5], target = 8

**Output:** [[2,2,2,2],[2,3,3],[3,5]] 

**Example 3:**

**Input:** candidates = [2], target = 1

**Output:** [] 

**Example 4:**

**Input:** candidates = [1], target = 1

**Output:** [[1]] 

**Example 5:**

**Input:** candidates = [1], target = 2

**Output:** [[1,1]] 

**Constraints:**

*   `1 <= candidates.length <= 30`
*   `1 <= candidates[i] <= 200`
*   All elements of `candidates` are **distinct**.
*   `1 <= target <= 500`

To solve the "Combination Sum" problem in Java with a `Solution` class, we can follow these steps:

1. Define a `Solution` class.
2. Define a method named `combinationSum` that takes an array of integers `candidates` and an integer `target` as input and returns a list of lists containing all unique combinations of `candidates` where the chosen numbers sum to `target`.
3. Implement backtracking to explore all possible combinations of candidates.
4. Sort the `candidates` array to ensure that duplicates are grouped together.
5. Create a recursive helper method named `backtrack` that takes parameters:
   - A list to store the current combination.
   - An integer representing the starting index in the `candidates` array.
   - The current sum of the combination.
6. In the `backtrack` method:
   - If the current sum equals the target, add the current combination to the result list.
   - Iterate over the candidates starting from the current index.
   - Add the current candidate to the combination.
   - Recursively call the `backtrack` method with the updated combination, index, and sum.
   - Remove the last added candidate from the combination to backtrack.
7. Call the `backtrack` method with an empty combination list, starting index 0, and sum 0.
8. Return the result list containing all unique combinations.

Here's the implementation:

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Sort the candidates to ensure duplicates are grouped together
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> combination, int[] candidates, int target, int start) {
        if (target == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }

        for (int i = start; i < candidates.length && candidates[i] <= target; i++) {
            combination.add(candidates[i]);
            backtrack(result, combination, candidates, target - candidates[i], i); // Use the same candidate again
            combination.remove(combination.size() - 1); // Backtrack by removing the last candidate
        }
    }
}
```

This implementation provides a solution to the "Combination Sum" problem in Java. It explores all possible combinations of candidates using backtracking and returns the unique combinations whose sum equals the target.