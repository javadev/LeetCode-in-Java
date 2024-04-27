3113\. Find the Number of Subarrays Where Boundary Elements Are Maximum

Hard

You are given an array of **positive** integers `nums`.

Return the number of subarrays of `nums`, where the **first** and the **last** elements of the subarray are _equal_ to the **largest** element in the subarray.

**Example 1:**

**Input:** nums = [1,4,3,3,2]

**Output:** 6

**Explanation:**

There are 6 subarrays which have the first and the last elements equal to the largest element of the subarray:

*   subarray <code>[**<ins>1</ins>**,4,3,3,2]</code>, with its largest element 1. The first element is 1 and the last element is also 1.
*   subarray <code>[1,<ins>**4**</ins>,3,3,2]</code>, with its largest element 4. The first element is 4 and the last element is also 4.
*   subarray <code>[1,4,<ins>**3**</ins>,3,2]</code>, with its largest element 3. The first element is 3 and the last element is also 3.
*   subarray <code>[1,4,3,<ins>**3**</ins>,2]</code>, with its largest element 3. The first element is 3 and the last element is also 3.
*   subarray <code>[1,4,3,3,<ins>**2**</ins>]</code>, with its largest element 2. The first element is 2 and the last element is also 2.
*   subarray <code>[1,4,<ins>**3,3**</ins>,2]</code>, with its largest element 3. The first element is 3 and the last element is also 3.

Hence, we return 6.

**Example 2:**

**Input:** nums = [3,3,3]

**Output:** 6

**Explanation:**

There are 6 subarrays which have the first and the last elements equal to the largest element of the subarray:

*   subarray <code>[<ins>**3**</ins>,3,3]</code>, with its largest element 3. The first element is 3 and the last element is also 3.
*   subarray <code>[3,**<ins>3</ins>**,3]</code>, with its largest element 3. The first element is 3 and the last element is also 3.
*   subarray <code>[3,3,<ins>**3**</ins>]</code>, with its largest element 3. The first element is 3 and the last element is also 3.
*   subarray <code>[**<ins>3,3</ins>**,3]</code>, with its largest element 3. The first element is 3 and the last element is also 3.
*   subarray <code>[3,<ins>**3,3**</ins>]</code>, with its largest element 3. The first element is 3 and the last element is also 3.
*   subarray <code>[<ins>**3,3,3**</ins>]</code>, with its largest element 3. The first element is 3 and the last element is also 3.

Hence, we return 6.

**Example 3:**

**Input:** nums = [1]

**Output:** 1

**Explanation:**

There is a single subarray of `nums` which is <code>[**<ins>1</ins>**]</code>, with its largest element 1. The first element is 1 and the last element is also 1.

Hence, we return 1.

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>1 <= nums[i] <= 10<sup>9</sup></code>