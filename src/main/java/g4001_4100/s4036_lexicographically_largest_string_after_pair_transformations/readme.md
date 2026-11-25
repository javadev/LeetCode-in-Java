4036\. Lexicographically Largest String After Pair Transformations

Medium

You are given an integer array `nums`.

For each integer `x` in `nums`, start with a string consisting of exactly `x` lowercase `'a'` characters.

You may perform the following operation any number of times (including zero):

*   Choose two **adjacent equal** letters and replace them with the next letter in the alphabet.

For example, `"aa"` can be replaced with `"b"`, and `"bb"` can be replaced with `"c"`. The pair `"zz"` cannot be replaced.

For each `x`, determine the **lexicographically largest** string that can be obtained.

Return an array of strings where the <code>i<sup>th</sup></code> string is the answer for `nums[i]`.

A string `a` is **lexicographically larger** than a string `b` if, at the first position where they differ, `a` contains a letter that appears later in the alphabet than the corresponding letter in `b`. If the first `min(a.length, b.length)` characters are equal, the longer string is lexicographically larger.

**Example 1:**

**Input:** nums = [2,5,7]

**Output:** ["b","ca","cba"]

**Explanation:**

*   `nums[0] = 2`: `"aa"` → `"b"`.
*   `nums[1] = 5`: `"aaaaa"` → `"baaa"` → `"bba"` → `"ca"`.
*   `nums[2] = 7`: `"aaaaaaa"` → `"baaaaa"` → `"bbaaa"` → `"bbba"` → `"cba"`.
*   Therefore, `ans = ["b", "ca", "cba"]`.

**Example 2:**

**Input:** nums = [3,9,1]

**Output:** ["ba","da","a"]

**Explanation:**

*   `nums[0] = 3`: `"aaa"` → `"ba"`.
*   `nums[1] = 9`: `"aaaaaaaaa"` → `"baaaaaaa"` → `"bbaaaaa"` → `"bbbaaa"` → `"bbbba"` → `"cbba"` → `"cca"` → `"da"`.
*   `nums[2] = 1`: No transformation can be applied, so the result is `"a"`.
*   Therefore, `ans = ["ba", "da", "a"]`.

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>1 <= nums[i] <= 10<sup>8</sup></code>