449\. Serialize and Deserialize BST

Medium

Serialization is converting a data structure or object into a sequence of bits so that it can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed later in the same or another computer environment.

Design an algorithm to serialize and deserialize a **binary search tree**. There is no restriction on how your serialization/deserialization algorithm should work. You need to ensure that a binary search tree can be serialized to a string, and this string can be deserialized to the original tree structure.

**The encoded string should be as compact as possible.**

**Example 1:**

**Input:** root = [2,1,3]

**Output:** [2,1,3] 

**Example 2:**

**Input:** root = []

**Output:** [] 

**Constraints:**

*   The number of nodes in the tree is in the range <code>[0, 10<sup>4</sup>]</code>.
*   <code>0 <= Node.val <= 10<sup>4</sup></code>
*   The input tree is **guaranteed** to be a binary search tree.