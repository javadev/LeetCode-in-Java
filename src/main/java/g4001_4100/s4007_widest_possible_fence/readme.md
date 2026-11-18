4007\. Widest Possible Fence

Hard

You are given an integer array `planks`, where `planks[i]` represents the height of the <code>i<sup>th</sup></code> wooden plank. Each plank has a width of 1 unit.

You want to build a fence consisting of planks that all have the **same** height.

You may either use a plank as is, or combine **exactly** two distinct original planks into a single plank whose height **equals** the sum of their heights. Each original plank can be used **at most** once, and not all original planks need to be used.

Return the **maximum possible width** of the fence that can be built.

**Example 1:**

**Input:** planks = [1,3,2,5,7,5,4,2,1]

**Output:** 4

**Explanation:**

We can have four planks of height 5.

*   `planks[3] = 5`
*   `planks[5] = 5`
*   `planks[0] + planks[6] = 1 + 4 = 5`
*   `planks[1] + planks[2] = 3 + 2 = 5`

Hence, the maximum width is 4.

**Example 2:**

**Input:** planks = [2,3,7]

**Output:** 1

**Explanation:**

*   It is impossible to form two planks of the same height, even after combining two distinct original planks.
*   Since not all original planks need to be used, we can choose any one plank as the fence.
*   Therefore, the maximum possible width is 1.

**Constraints:**

*   `1 <= planks.length <= 1000`
*   <code>1 <= planks[i] <= 10<sup>9</sup></code>