2545\. Sort the Students by Their Kth Score

Medium

There is a class with `m` students and `n` exams. You are given a **0-indexed** `m x n` integer matrix `score`, where each row represents one student and `score[i][j]` denotes the score the <code>i<sup>th</sup></code> student got in the <code>j<sup>th</sup></code> exam. The matrix `score` contains **distinct** integers only.

You are also given an integer `k`. Sort the students (i.e., the rows of the matrix) by their scores in the <code>k<sup>th</sup></code> (**0-indexed**) exam from the highest to the lowest.

Return _the matrix after sorting it._

**Example 1:**

![](https://assets.leetcode.com/uploads/2022/11/30/example1.png)

**Input:** score = [[10,6,9,1],[7,5,11,2],[4,8,3,15]], k = 2

**Output:** [[7,5,11,2],[10,6,9,1],[4,8,3,15]]

**Explanation:** In the above diagram, S denotes the student, while E denotes the exam.

- The student with index 1 scored 11 in exam 2, which is the highest score, so they got first place.

- The student with index 0 scored 9 in exam 2, which is the second highest score, so they got second place.

- The student with index 2 scored 3 in exam 2, which is the lowest score, so they got third place. 

**Example 2:**

![](https://assets.leetcode.com/uploads/2022/11/30/example2.png)

**Input:** score = [[3,4],[5,6]], k = 0

**Output:** [[5,6],[3,4]]

**Explanation:** In the above diagram, S denotes the student, while E denotes the exam.

- The student with index 1 scored 5 in exam 0, which is the highest score, so they got first place.

- The student with index 0 scored 3 in exam 0, which is the lowest score, so they got second place. 

**Constraints:**

*   `m == score.length`
*   `n == score[i].length`
*   `1 <= m, n <= 250`
*   <code>1 <= score[i][j] <= 10<sup>5</sup></code>
*   `score` consists of **distinct** integers.
*   `0 <= k < n`