2300\. Successful Pairs of Spells and Potions

Medium

You are given two positive integer arrays `spells` and `potions`, of length `n` and `m` respectively, where `spells[i]` represents the strength of the <code>i<sup>th</sup></code> spell and `potions[j]` represents the strength of the <code>j<sup>th</sup></code> potion.

You are also given an integer `success`. A spell and potion pair is considered **successful** if the **product** of their strengths is **at least** `success`.

Return _an integer array_ `pairs` _of length_ `n` _where_ `pairs[i]` _is the number of **potions** that will form a successful pair with the_ <code>i<sup>th</sup></code> _spell._

**Example 1:**

**Input:** spells = [5,1,3], potions = [1,2,3,4,5], success = 7

**Output:** [4,0,3]

**Explanation:**

- 0<sup>th</sup> spell: 5 \* [1,2,3,4,5] = [5,**10**,**15**,**20**,**25**]. 4 pairs are successful.

- 1<sup>st</sup> spell: 1 \* [1,2,3,4,5] = [1,2,3,4,5]. 0 pairs are successful.

- 2<sup>nd</sup> spell: 3 \* [1,2,3,4,5] = [3,6,**9**,**12**,**15**]. 3 pairs are successful.

Thus, [4,0,3] is returned. 

**Example 2:**

**Input:** spells = [3,1,2], potions = [8,5,8], success = 16

**Output:** [2,0,2]

**Explanation:**

- 0<sup>th</sup> spell: 3 \* [8,5,8] = [**24**,15,**24**]. 2 pairs are successful.

- 1<sup>st</sup> spell: 1 \* [8,5,8] = [8,5,8]. 0 pairs are successful.

- 2<sup>nd</sup> spell: 2 \* [8,5,8] = [**16**,10,**16**]. 2 pairs are successful.

Thus, [2,0,2] is returned. 

**Constraints:**

*   `n == spells.length`
*   `m == potions.length`
*   <code>1 <= n, m <= 10<sup>5</sup></code>
*   <code>1 <= spells[i], potions[i] <= 10<sup>5</sup></code>
*   <code>1 <= success <= 10<sup>10</sup></code>