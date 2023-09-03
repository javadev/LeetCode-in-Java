1854\. Maximum Population Year

Easy

You are given a 2D integer array `logs` where each <code>logs[i] = [birth<sub>i</sub>, death<sub>i</sub>]</code> indicates the birth and death years of the <code>i<sup>th</sup></code> person.

The **population** of some year `x` is the number of people alive during that year. The <code>i<sup>th</sup></code> person is counted in year `x`'s population if `x` is in the **inclusive** range <code>[birth<sub>i</sub>, death<sub>i</sub> - 1]</code>. Note that the person is **not** counted in the year that they die.

Return _the **earliest** year with the **maximum population**_.

**Example 1:**

**Input:** logs = [[1993,1999],[2000,2010]]

**Output:** 1993

**Explanation:** The maximum population is 1, and 1993 is the earliest year with this population.

**Example 2:**

**Input:** logs = [[1950,1961],[1960,1971],[1970,1981]]

**Output:** 1960

**Explanation:** 

The maximum population is 2, and it had happened in years 1960 and 1970. 

The earlier year between them is 1960.

**Constraints:**

*   `1 <= logs.length <= 100`
*   <code>1950 <= birth<sub>i</sub> < death<sub>i</sub> <= 2050</code>