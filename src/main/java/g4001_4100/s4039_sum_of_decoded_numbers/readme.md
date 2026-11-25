4039\. Sum of Decoded Numbers

Medium

You are given an integer array `nums`.

Each `nums[i]` is an **encoded** integer representing two positive integers <code>x<sub>i</sub></code> and <code>y<sub>i</sub></code>. To decode `nums[i]`, define:

*   <code>width<sub>i</sub> = nums[i] % 10</code>.
*   <code>d<sub>i</sub> = floor(nums[i] / 10)</code>.
*   <code>x<sub>i</sub></code> as the integer formed by the first <code>width<sub>i</sub></code> digits of the decimal representation of <code>d<sub>i</sub></code>.
*   <code>y<sub>i</sub></code> as the integer formed by all remaining digits of the decimal representation of <code>d<sub>i</sub></code>.

It is guaranteed that the decimal representation of <code>d<sub>i</sub></code> contains more than <code>width<sub>i</sub></code> digits. Therefore, both <code>x<sub>i</sub></code> and <code>y<sub>i</sub></code> contain at least one digit.

The **decoded value** of `nums[i]` is <code>x<sub>i</sub><sup>y<sub>i</sub></sup></code>.

Return the sum of the decoded values of all elements in `nums`, modulo <code>10<sup>9</sup> + 7</code>.

The `floor()` function returns the integer part of the division.

**Example 1:**

**Input:** nums = [231]

**Output:** 8

**Explanation:**

*   For 231, we have `width = 1`, `d = 23`, `x = 2`, and `y = 3`.
*   The decoded value of 231 is <code>2<sup>3</sup> = 8</code>.
*   Since there is only one element in `nums`, the sum of the decoded values is 8.

**Example 2:**

**Input:** nums = [2522,2101]

**Output:** 1649

**Explanation:**

*   For 2522, we have `width = 2`, `d = 252`, `x = 25`, and `y = 2`.
*   The decoded value of 2522 is <code>25<sup>2</sup> = 625</code>.
*   For 2101, we have `width = 1`, `d = 210`, `x = 2`, and `y = 10`.
*   The decoded value of 2101 is <code>2<sup>10</sup> = 1024</code>.
*   The sum of the decoded values is `625 + 1024 = 1649`.

**Example 3:**

**Input:** nums = [2301]

**Output:** 73741817

**Explanation:**

*   For 2301, we have `width = 1`, `d = 230`, `x = 2`, and `y = 30`.
*   The decoded value is <code>2<sup>30</sup> = 1073741824</code>.
*   Therefore, the answer is <code>1073741824 modulo (10<sup>9</sup> + 7) = 73741817</code>.

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>100 < nums[i] < 10<sup>15</sup></code>
*   <code>1 <= width<sub>i</sub> <= 9</code>
*   <code>1 <= x<sub>i</sub>, y<sub>i</sub> < 10<sup>9</sup></code>
*   The digit sequences used to form <code>x<sub>i</sub></code> and <code>y<sub>i</sub></code> do not have leading zeros.
*   It is guaranteed that every element in `nums` is a valid encoded integer.