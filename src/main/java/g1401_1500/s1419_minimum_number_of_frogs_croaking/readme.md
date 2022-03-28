1419\. Minimum Number of Frogs Croaking

Medium

You are given the string `croakOfFrogs`, which represents a combination of the string `"croak"` from different frogs, that is, multiple frogs can croak at the same time, so multiple `"croak"` are mixed.

_Return the minimum number of_ different _frogs to finish all the croaks in the given string._

A valid `"croak"` means a frog is printing five letters `'c'`, `'r'`, `'o'`, `'a'`, and `'k'` **sequentially**. The frogs have to print all five letters to finish a croak. If the given string is not a combination of a valid `"croak"` return `-1`.

**Example 1:**

**Input:** croakOfFrogs = "croakcroak"

**Output:** 1

**Explanation:** One frog yelling "croak**"** twice.

**Example 2:**

**Input:** croakOfFrogs = "crcoakroak"

**Output:** 2

**Explanation:** The minimum number of frogs is two. The first frog could yell "**cr**c**oak**roak". The second frog could yell later "cr**c**oak**roak**".

**Example 3:**

**Input:** croakOfFrogs = "croakcrook"

**Output:** -1

**Explanation:** The given string is an invalid combination of "croak**"** from different frogs.

**Constraints:**

*   <code>1 <= croakOfFrogs.length <= 10<sup>5</sup></code>
*   `croakOfFrogs` is either `'c'`, `'r'`, `'o'`, `'a'`, or `'k'`.