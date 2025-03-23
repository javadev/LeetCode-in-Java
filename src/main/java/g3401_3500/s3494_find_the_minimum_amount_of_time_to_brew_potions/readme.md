3494\. Find the Minimum Amount of Time to Brew Potions

Medium

You are given two integer arrays, `skill` and `mana`, of length `n` and `m`, respectively.

In a laboratory, `n` wizards must brew `m` potions _in order_. Each potion has a mana capacity `mana[j]` and **must** pass through **all** the wizards sequentially to be brewed properly. The time taken by the <code>i<sup>th</sup></code> wizard on the <code>j<sup>th</sup></code> potion is <code>time<sub>ij</sub> = skill[i] * mana[j]</code>.

Since the brewing process is delicate, a potion **must** be passed to the next wizard immediately after the current wizard completes their work. This means the timing must be _synchronized_ so that each wizard begins working on a potion **exactly** when it arrives.

Return the **minimum** amount of time required for the potions to be brewed properly.

**Example 1:**

**Input:** skill = [1,5,2,4], mana = [5,1,4,2]

**Output:** 110

**Explanation:**

| Potion Number | Start time | Wizard 0 done by | Wizard 1 done by | Wizard 2 done by | Wizard 3 done by |
|--------------|-----------|------------------|------------------|------------------|------------------|
| 0            | 0         | 5                | 30               | 40               | 60               |
| 1            | 52        | 53               | 58               | 60               | 64               |
| 2            | 54        | 58               | 78               | 86               | 102              |
| 3            | 86        | 88               | 98               | 102              | 110              |

As an example for why wizard 0 cannot start working on the 1<sup>st</sup> potion before time `t = 52`, consider the case where the wizards started preparing the 1<sup>st</sup> potion at time `t = 50`. At time `t = 58`, wizard 2 is done with the 1<sup>st</sup> potion, but wizard 3 will still be working on the 0<sup>th</sup> potion till time `t = 60`.

**Example 2:**

**Input:** skill = [1,1,1], mana = [1,1,1]

**Output:** 5

**Explanation:**

1.  Preparation of the 0<sup>th</sup> potion begins at time `t = 0`, and is completed by time `t = 3`.
2.  Preparation of the 1<sup>st</sup> potion begins at time `t = 1`, and is completed by time `t = 4`.
3.  Preparation of the 2<sup>nd</sup> potion begins at time `t = 2`, and is completed by time `t = 5`.

**Example 3:**

**Input:** skill = [1,2,3,4], mana = [1,2]

**Output:** 21

**Constraints:**

*   `n == skill.length`
*   `m == mana.length`
*   `1 <= n, m <= 5000`
*   `1 <= mana[i], skill[i] <= 5000`