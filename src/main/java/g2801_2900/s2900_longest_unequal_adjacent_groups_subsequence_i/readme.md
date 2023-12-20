2900\. Longest Unequal Adjacent Groups Subsequence I

Medium

You are given an integer `n`, a **0-indexed** string array `words`, and a **0-indexed** **binary** array `groups`, both arrays having length `n`.

You need to select the **longest** **subsequence** from an array of indices `[0, 1, ..., n - 1]`, such that for the subsequence denoted as <code>[i<sub>0</sub>, i<sub>1</sub>, ..., i<sub>k - 1</sub>]</code> having length `k`, <code>groups[i<sub>j</sub>] != groups[i<sub>j + 1</sub>]</code>, for each `j` where `0 < j + 1 < k`.

Return _a string array containing the words corresponding to the indices **(in order)** in the selected subsequence_. If there are multiple answers, return _any of them_.

A **subsequence** of an array is a new array that is formed from the original array by deleting some (possibly none) of the elements without disturbing the relative positions of the remaining elements.

**Note:** strings in `words` may be **unequal** in length.

**Example 1:**

**Input:** n = 3, words = ["e","a","b"], groups = [0,0,1]

**Output:** ["e","b"]

**Explanation:** A subsequence that can be selected is [0,2] because groups[0] != groups[2].

So, a valid answer is [words[0],words[2]] = ["e","b"].

Another subsequence that can be selected is [1,2] because groups[1] != groups[2].

This results in [words[1],words[2]] = ["a","b"].

It is also a valid answer.

It can be shown that the length of the longest subsequence of indices that satisfies the condition is 2.

**Example 2:**

**Input:** n = 4, words = ["a","b","c","d"], groups = [1,0,1,1]

**Output:** ["a","b","c"]

**Explanation:** A subsequence that can be selected is [0,1,2] because groups[0] != groups[1] and groups[1] != groups[2].

So, a valid answer is [words[0],words[1],words[2]] = ["a","b","c"].

Another subsequence that can be selected is [0,1,3] because groups[0] != groups[1] and groups[1] != groups[3].

This results in [words[0],words[1],words[3]] = ["a","b","d"].

It is also a valid answer.

It can be shown that the length of the longest subsequence of indices that satisfies the condition is 3.

**Constraints:**

*   `1 <= n == words.length == groups.length <= 100`
*   `1 <= words[i].length <= 10`
*   `0 <= groups[i] < 2`
*   `words` consists of **distinct** strings.
*   `words[i]` consists of lowercase English letters.