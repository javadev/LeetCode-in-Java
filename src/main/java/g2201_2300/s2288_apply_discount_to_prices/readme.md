2288\. Apply Discount to Prices

Medium

A **sentence** is a string of single-space separated words where each word can contain digits, lowercase letters, and the dollar sign `'$'`. A word represents a **price** if it is a sequence of digits preceded by a dollar sign.

*   For example, `"$100"`, `"$23"`, and `"$6"` represent prices while `"100"`, `"$"`, and `"$1e5"` do not.

You are given a string `sentence` representing a sentence and an integer `discount`. For each word representing a price, apply a discount of `discount%` on the price and **update** the word in the sentence. All updated prices should be represented with **exactly two** decimal places.

Return _a string representing the modified sentence_.

Note that all prices will contain **at most** `10` digits.

**Example 1:**

**Input:** sentence = "there are $1 $2 and 5$ candies in the shop", discount = 50

**Output:** "there are $0.50 $1.00 and 5$ candies in the shop"

**Explanation:**

The words which represent prices are "$1" and "$2".

- A 50% discount on "$1" yields "$0.50", so "$1" is replaced by "$0.50".

- A 50% discount on "$2" yields "$1". Since we need to have exactly 2 decimal places after a price, we replace "$2" with "$1.00". 

**Example 2:**

**Input:** sentence = "1 2 $3 4 $5 $6 7 8$ $9 $10$", discount = 100

**Output:** "1 2 $0.00 4 $0.00 $0.00 7 8$ $0.00 $10$"

**Explanation:**

Applying a 100% discount on any price will result in 0.

The words representing prices are "$3", "$5", "$6", and "$9".

Each of them is replaced by "$0.00". 

**Constraints:**

*   <code>1 <= sentence.length <= 10<sup>5</sup></code>
*   `sentence` consists of lowercase English letters, digits, `' '`, and `'$'`.
*   `sentence` does not have leading or trailing spaces.
*   All words in `sentence` are separated by a single space.
*   All prices will be **positive** numbers without leading zeros.
*   All prices will have **at most** `10` digits.
*   `0 <= discount <= 100`