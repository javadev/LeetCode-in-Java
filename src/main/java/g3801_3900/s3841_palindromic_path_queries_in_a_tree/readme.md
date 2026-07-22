3841\. Palindromic Path Queries in a Tree

Hard

You are given an undirected tree with `n` nodes labeled 0 to `n - 1`. This is represented by a 2D array `edges` of length `n - 1`, where <code>edges[i] = [u<sub>i</sub>, v<sub>i</sub>]</code> indicates an undirected edge between nodes <code>u<sub>i</sub></code> and <code>v<sub>i</sub></code>.

You are also given a string `s` of length `n` consisting of lowercase English letters, where `s[i]` represents the character assigned to node `i`.

You are also given a string array `queries`, where each `queries[i]` is either:

*   <code>"update u<sub>i</sub> c"</code>: Change the character at node <code>u<sub>i</sub></code> to `c`. Formally, update <code>s[u<sub>i</sub>] = c</code>.
*   <code>"query u<sub>i</sub> v<sub>i</sub>"</code>: Determine whether the string formed by the characters on the **unique** path from <code>u<sub>i</sub></code> to <code>v<sub>i</sub></code> (inclusive) can be **rearranged** into a **palindrome**.

Return a boolean array `answer`, where `answer[j]` is `true` if the <code>j<sup>th</sup></code> query of type <code>"query u<sub>i</sub> v<sub>i</sub>"</code> can be rearranged into a **palindrome**, and `false` otherwise.

**Example 1:**

**Input:** n = 3, edges = [[0,1],[1,2]], s = "aac", queries = ["query 0 2","update 1 b","query 0 2"]

**Output:** [true,false]

**Explanation:**

*   `"query 0 2"`: Path `0 → 1 → 2` gives `"aac"`, which can be rearranged to form `"aca"`, a palindrome. Thus, `answer[0] = true`.
*   `"update 1 b"`: Update node 1 to `'b'`, now `s = "abc"`.
*   `"query 0 2"`: Path characters are `"abc"`, which cannot be rearranged to form a palindrome. Thus, `answer[1] = false`.

Thus, `answer = [true, false]`.

**Example 2:**

**Input:** n = 4, edges = [[0,1],[0,2],[0,3]], s = "abca", queries = ["query 1 2","update 0 b","query 2 3","update 3 a","query 1 3"]

**Output:** [false,false,true]

**Explanation:**

*   `"query 1 2"`: Path `1 → 0 → 2` gives `"bac"`, which cannot be rearranged to form a palindrome. Thus, `answer[0] = false`.
*   `"update 0 b"`: Update node 0 to `'b'`, now `s = "bbca"`.
*   `"query 2 3"`: Path `2 → 0 → 3` gives `"cba"`, which cannot be rearranged to form a palindrome. Thus, `answer[1] = false`.
*   `"update 3 a"`: Update node 3 to `'a'`, `s = "bbca"`.
*   `"query 1 3"`: Path `1 → 0 → 3` gives `"bba"`, which can be rearranged to form `"bab"`, a palindrome. Thus, `answer[2] = true`.

Thus, `answer = [false, false, true]`.

**Constraints:**

*   <code>1 <= n == s.length <= 5 * 10<sup>4</sup></code>
*   `edges.length == n - 1`
*   <code>edges[i] = [u<sub>i</sub>, v<sub>i</sub>]</code>
*   <code>0 <= u<sub>i</sub>, v<sub>i</sub> <= n - 1</code>
*   `s` consists of lowercase English letters.
*   The input is generated such that `edges` represents a valid tree.
*   <code>1 <= queries.length <= 5 * 10<sup>4</sup></code>
    *   <code>queries[i] = "update u<sub>i</sub> c"</code> or
    *   <code>queries[i] = "query u<sub>i</sub> v<sub>i</sub>"</code>
    *   <code>0 <= u<sub>i</sub>, v<sub>i</sub> <= n - 1</code>
    *   `c` is a lowercase English letter.