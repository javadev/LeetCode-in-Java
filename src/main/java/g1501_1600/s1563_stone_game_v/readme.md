1563\. Stone Game V

Hard

There are several stones **arranged in a row**, and each stone has an associated value which is an integer given in the array `stoneValue`.

In each round of the game, Alice divides the row into **two non-empty rows** (i.e. left row and right row), then Bob calculates the value of each row which is the sum of the values of all the stones in this row. Bob throws away the row which has the maximum value, and Alice's score increases by the value of the remaining row. If the value of the two rows are equal, Bob lets Alice decide which row will be thrown away. The next round starts with the remaining row.

The game ends when there is only **one stone remaining**. Alice's is initially **zero**.

Return _the maximum score that Alice can obtain_.

**Example 1:**

**Input:** stoneValue = [6,2,3,4,5,5]

**Output:** 18

**Explanation:** In the first round, Alice divides the row to [6,2,3], [4,5,5]. The left row has the value 11 and the right row has value 14. Bob throws away the right row and Alice's score is now 11. In the second round Alice divides the row to [6], [2,3]. This time Bob throws away the left row and Alice's score becomes 16 (11 + 5).

    The last round Alice has only one choice to divide the row which is [2], [3]. Bob throws away the right row and Alice's score is now 18 (16 + 2). The game ends because only one stone is remaining in the row.

**Example 2:**

**Input:** stoneValue = [7,7,7,7,7,7,7]

**Output:** 28

**Example 3:**

**Input:** stoneValue = [4]

**Output:** 0

**Constraints:**

*   `1 <= stoneValue.length <= 500`
*   <code>1 <= stoneValue[i] <= 10<sup>6</sup></code>