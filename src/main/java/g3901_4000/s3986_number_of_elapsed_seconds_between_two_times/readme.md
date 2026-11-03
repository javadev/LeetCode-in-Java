3986\. Number of Elapsed Seconds Between Two Times

Easy

You are given two valid times `startTime` and `endTime`, each represented as a string in the format `"HH:MM:SS"`.

Return the number of seconds that have elapsed from `startTime` to `endTime`.

**Example 1:**

**Input:** startTime = "01:00:00", endTime = "01:00:25"

**Output:** 25

**Explanation:**

`endTime` is 25 seconds ahead of `startTime`.

**Example 2:**

**Input:** startTime = "12:34:56", endTime = "13:00:00"

**Output:** 1504

**Explanation:**

`endTime` is 25 minutes and 4 seconds ahead of `startTime`, which equals 1504 seconds.

**Constraints:**

*   `startTime.length == 8`
*   `endTime.length == 8`
*   `startTime` and `endTime` are valid times in the format `"HH:MM:SS"`
*   `00 <= HH <= 23`
*   `00 <= MM <= 59`
*   `00 <= SS <= 59`
*   `endTime` is not earlier than `startTime`