3998\. Transform Binary String Using Subsequence Sort

Medium

You are given a binary string `s`.

You are also given an array of strings `strs`, where each `strs[i]` has the **same** length as `s` and consists of characters `'0'`, `'1'`, and `'?'`. Each `'?'` can be replaced by either `'0'` or `'1'`.

You may perform the following operation any number of times (including zero):

*   Choose any subsequence `sub` of `s`.
*   Sort `sub` in **non-decreasing** order.
*   Replace the chosen **subsequence** in `s` with the sorted `sub`, keeping all other characters unchanged.

Return a boolean array `ans`, where `ans[i]` is `true` if it's possible to replace all `'?'` in `strs[i]` with `'0'` or `'1'` and transform `s` into the resulting string using the allowed operation above, otherwise return `false`.

**Example 1:**

**Input:** s = "101", strs = ["1?1","0?1","0?0"]

**Output:** [true,true,false]

**Explanation:**

| `i` | `strs[i]` | Replacement | Result `strs[i]` | Operation(s) | Result |
| --- | --- | --- | --- | --- | --- |
| 0 | `"1?1"` | `? → 0` | `"101"` | Matches `s`. | `true` |
| 1 | `"0?1"` | `? → 1` | `"011"` | Select the subsequence at indices `[0..2]` of `s` → `"101"`. <br> Sort `"101"` to get `"011" = strs[i]`. | `true` |
| 2 | `"0?0"` | `? → 0` or `1` | `"000"` or `"010"` | Not feasible. | `false` |

Thus, `ans = [true, true, false]`.

**Example 2:**

**Input:** s = "1100", strs = ["0011","11?1","1?1?"]

**Output:** [true,false,true]

**Explanation:**

| `i` | `strs[i]` | Replacement | Result `strs[i]` | Operation(s) | Result |
| --- | --- | --- | --- | --- | --- |
| 0 | `"0011"` | \- | `"0011"` | Select the subsequence at indices `[0..3]` of `s` → `"1100"`. <br> Sort `"1100"` to get `"0011" = strs[i]`. | `true` |
| 1 | `"11?1"` | `? → 0` | `"1101"` | Not feasible. | `false` |
| 2 | `"1?1?"` | First `? → 0` <br> Second `? → 0` | `"1010"` | Select the subsequence at indices `[1, 2]` of `s` → `"10"`. <br> Sort `"10"` to get `"01"`, so <code>s = "1<ins>01</ins>0"</code>. | `true` |

Thus, `ans = [true, false, true]`.

**Example 3:**

**Input:** s = "1010", strs = ["0011"]

**Output:** [true]

**Explanation:**

| `i` | `strs[i]` | Replacement | Result `strs[i]` | Operation(s) | Result |
| --- | --- | --- | --- | --- | --- |
| 0 | `"0011"` | \- | `"0011"` | Select the subsequence at indices `[0, 2, 3]` of `s` → `"110"`. <br> Sort `"110"` to get `"011"`, so <code>s = "0<ins>0</ins>11" = strs[i]</code>. | `true` |

Thus, `ans = [true]`.

**Constraints:**

*   `1 <= n == s.length <= 2000`
*   `s[i]` is either `'0'` or `'1'`.
*   `1 <= strs.length <= 2000`
*   `strs[i].length == n`
*   `strs[i]` is either `'0'`, `'1'`, or `'?'`.