914\. X of a Kind in a Deck of Cards

Easy

In a deck of cards, each card has an integer written on it.

Return `true` if and only if you can choose `X >= 2` such that it is possible to split the entire deck into 1 or more groups of cards, where:

*   Each group has exactly `X` cards.
*   All the cards in each group have the same integer.

**Example 1:**

**Input:** deck = [1,2,3,4,4,3,2,1]

**Output:** true

**Explanation:** Possible partition [1,1],[2,2],[3,3],[4,4].

**Example 2:**

**Input:** deck = [1,1,1,2,2,2,3,3]

**Output:** false

**Explanation:** No possible partition.

**Constraints:**

*   <code>1 <= deck.length <= 10<sup>4</sup></code>
*   <code>0 <= deck[i] < 10<sup>4</sup></code>