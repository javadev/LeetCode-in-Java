1641\. Count Sorted Vowel Strings

Medium

Given an integer `n`, return _the number of strings of length_ `n` _that consist only of vowels (_`a`_,_ `e`_,_ `i`_,_ `o`_,_ `u`_) and are **lexicographically sorted**._

A string `s` is **lexicographically sorted** if for all valid `i`, `s[i]` is the same as or comes before `s[i+1]` in the alphabet.

**Example 1:**

**Input:** n = 1

**Output:** 5

**Explanation:** The 5 sorted strings that consist of vowels only are `["a","e","i","o","u"].`

**Example 2:**

**Input:** n = 2

**Output:** 15

**Explanation:** The 15 sorted strings that consist of vowels only are 

["aa","ae","ai","ao","au","ee","ei","eo","eu","ii","io","iu","oo","ou","uu"]. 

Note that "ea" is not a valid string since 'e' comes after 'a' in the alphabet.

**Example 3:**

**Input:** n = 33

**Output:** 66045

**Constraints:**

*   `1 <= n <= 50`