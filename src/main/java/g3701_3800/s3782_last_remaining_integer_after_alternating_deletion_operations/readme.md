3782\. Last Remaining Integer After Alternating Deletion Operations

Hard

You are given an integer `n`.

We write the integers from 1 to `n` in a sequence from left to right. Then, **alternately** apply the following two operations until only one integer remains, starting with operation 1:

*   **Operation 1**: Starting from the left, delete every second number.
*   **Operation 2**: Starting from the right, delete every second number.

Return the last remaining integer.

**Example 1:**

**Input:** n = 8

**Output:** 3

**Explanation:**

*   Write `[1, 2, 3, 4, 5, 6, 7, 8]` in a sequence.
*   Starting from the left, we delete every second number: <code>[1, <ins>**2**</ins>, 3, <ins>**4**</ins>, 5, <ins>**6**</ins>, 7, <ins>**8**</ins>]</code>. The remaining integers are `[1, 3, 5, 7]`.
*   Starting from the right, we delete every second number: <code>[<ins>**1**</ins>, 3, <ins>**5**</ins>, 7]</code>. The remaining integers are `[3, 7]`.
*   Starting from the left, we delete every second number: <code>[3, <ins>**7**</ins>]</code>. The remaining integer is `[3]`.

**Example 2:**

**Input:** n = 5

**Output:** 1

**Explanation:**

*   Write `[1, 2, 3, 4, 5]` in a sequence.
*   Starting from the left, we delete every second number: <code>[1, <ins>**2**</ins>, 3, <ins>**4**</ins>, 5]</code>. The remaining integers are `[1, 3, 5]`.
*   Starting from the right, we delete every second number: <code>[1, <ins>**3**</ins>, 5]</code>. The remaining integers are `[1, 5]`.
*   Starting from the left, we delete every second number: <code>[1, <ins>**5**</ins>]</code>. The remaining integer is `[1]`.

**Example 3:**

**Input:** n = 1

**Output:** 1

**Explanation:**

*   Write `[1]` in a sequence.
*   The last remaining integer is 1.

**Constraints:**

*   <code>1 <= n <= 10<sup>15</sup></code>