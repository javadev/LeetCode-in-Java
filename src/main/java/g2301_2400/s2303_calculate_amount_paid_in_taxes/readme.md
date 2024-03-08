2303\. Calculate Amount Paid in Taxes

Easy

You are given a **0-indexed** 2D integer array `brackets` where <code>brackets[i] = [upper<sub>i</sub>, percent<sub>i</sub>]</code> means that the <code>i<sup>th</sup></code> tax bracket has an upper bound of <code>upper<sub>i</sub></code> and is taxed at a rate of <code>percent<sub>i</sub></code>. The brackets are **sorted** by upper bound (i.e. <code>upper<sub>i-1</sub> < upper<sub>i</sub></code> for `0 < i < brackets.length`).

Tax is calculated as follows:

*   The first <code>upper<sub>0</sub></code> dollars earned are taxed at a rate of <code>percent<sub>0</sub></code>.
*   The next <code>upper<sub>1</sub> - upper<sub>0</sub></code> dollars earned are taxed at a rate of <code>percent<sub>1</sub></code>.
*   The next <code>upper<sub>2</sub> - upper<sub>1</sub></code> dollars earned are taxed at a rate of <code>percent<sub>2</sub></code>.
*   And so on.

You are given an integer `income` representing the amount of money you earned. Return _the amount of money that you have to pay in taxes._ Answers within <code>10<sup>-5</sup></code> of the actual answer will be accepted.

**Example 1:**

**Input:** brackets = [[3,50],[7,10],[12,25]], income = 10

**Output:** 2.65000

**Explanation:**

The first 3 dollars you earn are taxed at 50%. You have to pay $3 \* 50% = $1.50 dollars in taxes.

The next 7 - 3 = 4 dollars you earn are taxed at 10%. You have to pay $4 \* 10% = $0.40 dollars in taxes.

The final 10 - 7 = 3 dollars you earn are taxed at 25%. You have to pay $3 \* 25% = $0.75 dollars in taxes. You have to pay a total of $1.50 + $0.40 + $0.75 = $2.65 dollars in taxes. 

**Example 2:**

**Input:** brackets = [[1,0],[4,25],[5,50]], income = 2

**Output:** 0.25000

**Explanation:**

The first dollar you earn is taxed at 0%. You have to pay $1 \* 0% = $0 dollars in taxes.

The second dollar you earn is taxed at 25%. You have to pay $1 \* 25% = $0.25 dollars in taxes.

You have to pay a total of $0 + $0.25 = $0.25 dollars in taxes. 

**Example 3:**

**Input:** brackets = [[2,50]], income = 0

**Output:** 0.00000

**Explanation:** You have no income to tax, so you have to pay a total of $0 dollars in taxes. 

**Constraints:**

*   `1 <= brackets.length <= 100`
*   <code>1 <= upper<sub>i</sub> <= 1000</code>
*   <code>0 <= percent<sub>i</sub> <= 100</code>
*   `0 <= income <= 1000`
*   <code>upper<sub>i</sub></code> is sorted in ascending order.
*   All the values of <code>upper<sub>i</sub></code> are **unique**.
*   The upper bound of the last tax bracket is greater than or equal to `income`.