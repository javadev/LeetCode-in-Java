1860\. Incremental Memory Leak

Medium

You are given two integers `memory1` and `memory2` representing the available memory in bits on two memory sticks. There is currently a faulty program running that consumes an increasing amount of memory every second.

At the <code>i<sup>th</sup></code> second (starting from 1), `i` bits of memory are allocated to the stick with **more available memory** (or from the first memory stick if both have the same available memory). If neither stick has at least `i` bits of available memory, the program **crashes**.

Return _an array containing_ <code>[crashTime, memory1<sub>crash</sub>, memory2<sub>crash</sub>]</code>_, where_ `crashTime` _is the time (in seconds) when the program crashed and_ <code>memory1<sub>crash</sub></code> _and_ <code>memory2<sub>crash</sub></code> _are the available bits of memory in the first and second sticks respectively_.

**Example 1:**

**Input:** memory1 = 2, memory2 = 2

**Output:** [3,1,0]

**Explanation:** The memory is allocated as follows:

- At the 1<sup>st</sup> second, 1 bit of memory is allocated to stick 1. The first stick now has 1 bit of available memory.

- At the 2<sup>nd</sup> second, 2 bits of memory are allocated to stick 2. The second stick now has 0 bits of available memory. 

- At the 3<sup>rd</sup> second, the program crashes. The sticks have 1 and 0 bits available respectively.

**Example 2:**

**Input:** memory1 = 8, memory2 = 11

**Output:** [6,0,4]

**Explanation:** The memory is allocated as follows: 

- At the 1<sup>st</sup> second, 1 bit of memory is allocated to stick 2. The second stick now has 10 bit of available memory. 

- At the 2<sup>nd</sup> second, 2 bits of memory are allocated to stick 2. The second stick now has 8 bits of available memory. 

- At the 3<sup>rd</sup> second, 3 bits of memory are allocated to stick 1. The first stick now has 5 bits of available memory.

- At the 4<sup>th</sup> second, 4 bits of memory are allocated to stick 2. The second stick now has 4 bits of available memory. 

- At the 5<sup>th</sup> second, 5 bits of memory are allocated to stick 1. The first stick now has 0 bits of available memory.

- At the 6<sup>th</sup> second, the program crashes. The sticks have 0 and 4 bits available respectively.

**Constraints:**

*   <code>0 <= memory1, memory2 <= 2<sup>31</sup> - 1</code>