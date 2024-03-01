2983\. Palindrome Rearrangement Queries

Hard

You are given a **0-indexed** string `s` having an **even** length `n`.

You are also given a **0-indexed** 2D integer array, `queries`, where <code>queries[i] = [a<sub>i</sub>, b<sub>i</sub>, c<sub>i</sub>, d<sub>i</sub>]</code>.

For each query `i`, you are allowed to perform the following operations:

*   Rearrange the characters within the **substring** <code>s[a<sub>i</sub>:b<sub>i</sub>]</code>, where <code>0 <= a<sub>i</sub> <= b<sub>i</sub> < n / 2</code>.
*   Rearrange the characters within the **substring** <code>s[c<sub>i</sub>:d<sub>i</sub>]</code>, where <code>n / 2 <= c<sub>i</sub> <= d<sub>i</sub> < n</code>.

For each query, your task is to determine whether it is possible to make `s` a **palindrome** by performing the operations.

Each query is answered **independently** of the others.

Return _a **0-indexed** array_ `answer`_, where_ `answer[i] == true` _if it is possible to make_ `s` _a palindrome by performing operations specified by the_ <code>i<sup>th</sup></code> _query, and_ `false` _otherwise._

*   A **substring** is a contiguous sequence of characters within a string.
*   `s[x:y]` represents the substring consisting of characters from the index `x` to index `y` in `s`, **both inclusive**.

**Example 1:**

**Input:** s = "abcabc", queries = [[1,1,3,5],[0,2,5,5]]

**Output:** [true,true]

**Explanation:** In this example, there are two queries:

In the first query:

- a<sub>0</sub> = 1, b<sub>0</sub> = 1, c<sub>0</sub> = 3, d<sub>0</sub> = 5.

- So, you are allowed to rearrange s[1:1] => a<ins>b</ins>cabc and s[3:5] => abc<ins>abc</ins>.

- To make s a palindrome, s[3:5] can be rearranged to become => abc<ins>cba</ins>.

- Now, s is a palindrome. So, answer[0] = true.

In the second query:

- a<sub>1</sub> = 0, b<sub>1</sub> = 2, c<sub>1</sub> = 5, d<sub>1</sub> = 5.

- So, you are allowed to rearrange s[0:2] => <ins>abc</ins>abc and s[5:5] => abcab<ins>c</ins>.

- To make s a palindrome, s[0:2] can be rearranged to become => <ins>cba</ins>abc.

- Now, s is a palindrome. So, answer[1] = true. 

**Example 2:**

**Input:** s = "abbcdecbba", queries = [[0,2,7,9]]

**Output:** [false]

**Explanation:** In this example, there is only one query.

a<sub>0</sub> = 0, b<sub>0</sub> = 2, c<sub>0</sub> = 7, d<sub>0</sub> = 9.

So, you are allowed to rearrange s[0:2] => <ins>abb</ins>cdecbba and s[7:9] => abbcdec<ins>bba</ins>.

It is not possible to make s a palindrome by rearranging these substrings because s[3:6] is not a palindrome.

So, answer[0] = false.

**Example 3:**

**Input:** s = "acbcab", queries = [[1,2,4,5]]

**Output:** [true]

**Explanation:** In this example, there is only one query.

a<sub>0</sub> = 1, b<sub>0</sub> = 2, c<sub>0</sub> = 4, d<sub>0</sub> = 5.

So, you are allowed to rearrange s[1:2] => a<ins>cb</ins>cab and s[4:5] => acbc<ins>ab</ins>.

To make s a palindrome s[1:2] can be rearranged to become a<ins>bc</ins>cab.

Then, s[4:5] can be rearranged to become abcc<ins>ba</ins>.

Now, s is a palindrome. So, answer[0] = true.

**Constraints:**

*   <code>2 <= n == s.length <= 10<sup>5</sup></code>
*   <code>1 <= queries.length <= 10<sup>5</sup></code>
*   `queries[i].length == 4`
*   <code>a<sub>i</sub> == queries[i][0], b<sub>i</sub> == queries[i][1]</code>
*   <code>c<sub>i</sub> == queries[i][2], d<sub>i</sub> == queries[i][3]</code>
*   <code>0 <= a<sub>i</sub> <= b<sub>i</sub> < n / 2</code>
*   <code>n / 2 <= c<sub>i</sub> <= d<sub>i</sub> < n</code>
*   `n` is even.
*   `s` consists of only lowercase English letters.