1177\. Can Make Palindrome from Substring

Medium

You are given a string `s` and array `queries` where <code>queries[i] = [left<sub>i</sub>, right<sub>i</sub>, k<sub>i</sub>]</code>. We may rearrange the substring <code>s[left<sub>i</sub>...right<sub>i</sub>]</code> for each query and then choose up to <code>k<sub>i</sub></code> of them to replace with any lowercase English letter.

If the substring is possible to be a palindrome string after the operations above, the result of the query is `true`. Otherwise, the result is `false`.

Return a boolean array `answer` where `answer[i]` is the result of the <code>i<sup>th</sup></code> query `queries[i]`.

Note that each letter is counted individually for replacement, so if, for example <code>s[left<sub>i</sub>...right<sub>i</sub>] = "aaa"</code>, and <code>k<sub>i</sub> = 2</code>, we can only replace two of the letters. Also, note that no query modifies the initial string `s`.

**Example :**

**Input:** s = "abcda", queries = [[3,3,0],[1,2,0],[0,3,1],[0,3,2],[0,4,1]]

**Output:** [true,false,false,true,true]

**Explanation:** 

queries[0]: substring = "d", is palidrome. 

queries[1]: substring = "bc", is not palidrome. 

queries[2]: substring = "abcd", is not palidrome after replacing only 1 character. q

ueries[3]: substring = "abcd", could be changed to "abba" which is palidrome. Also this can be changed to "baab" first rearrange it "bacd" then replace "cd" with "ab". 

queries[4]: substring = "abcda", could be changed to "abcba" which is palidrome.

**Example 2:**

**Input:** s = "lyb", queries = [[0,1,0],[2,2,1]]

**Output:** [false,true]

**Constraints:**

*   <code>1 <= s.length, queries.length <= 10<sup>5</sup></code>
*   <code>0 <= left<sub>i</sub> <= right<sub>i</sub> < s.length</code>
*   <code>0 <= k<sub>i</sub> <= s.length</code>
*   `s` consists of lowercase English letters.