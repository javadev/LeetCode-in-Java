1725\. Number Of Rectangles That Can Form The Largest Square

Easy

You are given an array `rectangles` where <code>rectangles[i] = [l<sub>i</sub>, w<sub>i</sub>]</code> represents the <code>i<sup>th</sup></code> rectangle of length <code>l<sub>i</sub></code> and width <code>w<sub>i</sub></code>.

You can cut the <code>i<sup>th</sup></code> rectangle to form a square with a side length of `k` if both <code>k <= l<sub>i</sub></code> and <code>k <= w<sub>i</sub></code>. For example, if you have a rectangle `[4,6]`, you can cut it to get a square with a side length of at most `4`.

Let `maxLen` be the side length of the **largest** square you can obtain from any of the given rectangles.

Return _the **number** of rectangles that can make a square with a side length of_ `maxLen`.

**Example 1:**

**Input:** rectangles = [[5,8],[3,9],[5,12],[16,5]]

**Output:** 3

**Explanation:** The largest squares you can get from each rectangle are of lengths [5,3,5,5]. The largest possible square is of length 5, and you can get it out of 3 rectangles.

**Example 2:**

**Input:** rectangles = [[2,3],[3,7],[4,3],[3,7]]

**Output:** 3

**Constraints:**

*   `1 <= rectangles.length <= 1000`
*   `rectangles[i].length == 2`
*   <code>1 <= l<sub>i</sub>, w<sub>i</sub> <= 10<sup>9</sup></code>
*   <code>l<sub>i</sub> != w<sub>i</sub></code>