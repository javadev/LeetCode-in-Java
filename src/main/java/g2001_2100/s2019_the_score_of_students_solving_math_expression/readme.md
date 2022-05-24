2019\. The Score of Students Solving Math Expression

Hard

You are given a string `s` that contains digits `0-9`, addition symbols `'+'`, and multiplication symbols `'*'` **only**, representing a **valid** math expression of **single digit numbers** (e.g., `3+5*2`). This expression was given to `n` elementary school students. The students were instructed to get the answer of the expression by following this **order of operations**:

1.  Compute **multiplication**, reading from **left to right**; Then,
2.  Compute **addition**, reading from **left to right**.

You are given an integer array `answers` of length `n`, which are the submitted answers of the students in no particular order. You are asked to grade the `answers`, by following these **rules**:

*   If an answer **equals** the correct answer of the expression, this student will be rewarded `5` points;
*   Otherwise, if the answer **could be interpreted** as if the student applied the operators **in the wrong order** but had **correct arithmetic**, this student will be rewarded `2` points;
*   Otherwise, this student will be rewarded `0` points.

Return _the sum of the points of the students_.

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/09/17/student_solving_math.png)

**Input:** s = "7+3\*1\*2", answers = [20,13,42]

**Output:** 7

**Explanation:** As illustrated above, the correct answer of the expression is 13, therefore one student is rewarded 5 points: [20,**13**,42] 

A student might have applied the operators in this wrong order: ((7+3)\*1)\*2 = 20. Therefore one student is rewarded 2 points: [**20**,13,42] 

The points for the students are: [2,5,0]. The sum of the points is 2+5+0=7.

**Example 2:**

**Input:** s = "3+5\*2", answers = [13,0,10,13,13,16,16]

**Output:** 19

**Explanation:** The correct answer of the expression is 13, therefore three students are rewarded 5 points each: [**13**,0,10,**13**,**13**,16,16]

A student might have applied the operators in this wrong order: ((3+5)\*2 = 16. Therefore two students are rewarded 2 points: [13,0,10,13,13,**16**,**16**] 

The points for the students are: [5,0,0,5,5,2,2]. The sum of the points is 5+0+0+5+5+2+2=19.

**Example 3:**

**Input:** s = "6+0\*1", answers = [12,9,6,4,8,6]

**Output:** 10

**Explanation:** The correct answer of the expression is 6. 

If a student had incorrectly done (6+0)\*1, the answer would also be 6. 

By the rules of grading, the students will still be rewarded 5 points (as they got the correct answer), not 2 points. 

The points for the students are: [0,0,5,0,0,5]. The sum of the points is 10.

**Constraints:**

*   `3 <= s.length <= 31`
*   `s` represents a valid expression that contains only digits `0-9`, `'+'`, and `'*'` only.
*   All the integer operands in the expression are in the **inclusive** range `[0, 9]`.
*   `1 <=` The count of all operators (`'+'` and `'*'`) in the math expression `<= 15`
*   Test data are generated such that the correct answer of the expression is in the range of `[0, 1000]`.
*   `n == answers.length`
*   <code>1 <= n <= 10<sup>4</sup></code>
*   `0 <= answers[i] <= 1000`