2412\. Minimum Money Required Before Transactions

Hard

You are given a **0-indexed** 2D integer array `transactions`, where <code>transactions[i] = [cost<sub>i</sub>, cashback<sub>i</sub>]</code>.

The array describes transactions, where each transaction must be completed exactly once in **some order**. At any given moment, you have a certain amount of `money`. In order to complete transaction `i`, <code>money >= cost<sub>i</sub></code> must hold true. After performing a transaction, `money` becomes <code>money - cost<sub>i</sub> + cashback<sub>i</sub></code>.

Return _the minimum amount of_ `money` _required before any transaction so that all of the transactions can be completed **regardless of the order** of the transactions._

**Example 1:**

**Input:** transactions = [[2,1],[5,0],[4,2]]

**Output:** 10

**Explanation:**

Starting with money = 10, the transactions can be performed in any order.

It can be shown that starting with money < 10 will fail to complete all transactions in some order. 

**Example 2:**

**Input:** transactions = [[3,0],[0,3]]

**Output:** 3

**Explanation:**

- If transactions are in the order [[3,0],[0,3]], the minimum money required to complete the transactions is 3.

- If transactions are in the order [[0,3],[3,0]], the minimum money required to complete the transactions is 0.

Thus, starting with money = 3, the transactions can be performed in any order. 

**Constraints:**

*   <code>1 <= transactions.length <= 10<sup>5</sup></code>
*   `transactions[i].length == 2`
*   <code>0 <= cost<sub>i</sub>, cashback<sub>i</sub> <= 10<sup>9</sup></code>