2582\. Pass the Pillow

Easy

There are `n` people standing in a line labeled from `1` to `n`. The first person in the line is holding a pillow initially. Every second, the person holding the pillow passes it to the next person standing in the line. Once the pillow reaches the end of the line, the direction changes, and people continue passing the pillow in the opposite direction.

*   For example, once the pillow reaches the <code>n<sup>th</sup></code> person they pass it to the <code>n - 1<sup>th</sup></code> person, then to the <code>n - 2<sup>th</sup></code> person and so on.

Given the two positive integers `n` and `time`, return _the index of the person holding the pillow after_ `time` _seconds_.

**Example 1:**

**Input:** n = 4, time = 5

**Output:** 2

**Explanation:** People pass the pillow in the following way: 1 -> 2 -> 3 -> 4 -> 3 -> 2. Afer five seconds, the pillow is given to the 2<sup>nd</sup> person.

**Example 2:**

**Input:** n = 3, time = 2

**Output:** 3

**Explanation:** People pass the pillow in the following way: 1 -> 2 -> 3. Afer two seconds, the pillow is given to the 3<sup>r</sup><sup>d</sup> person.

**Constraints:**

*   `2 <= n <= 1000`
*   `1 <= time <= 1000`