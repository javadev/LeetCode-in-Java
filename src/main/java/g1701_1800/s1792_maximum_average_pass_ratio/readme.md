1792\. Maximum Average Pass Ratio

Medium

There is a school that has classes of students and each class will be having a final exam. You are given a 2D integer array `classes`, where <code>classes[i] = [pass<sub>i</sub>, total<sub>i</sub>]</code>. You know beforehand that in the <code>i<sup>th</sup></code> class, there are <code>total<sub>i</sub></code> total students, but only <code>pass<sub>i</sub></code> number of students will pass the exam.

You are also given an integer `extraStudents`. There are another `extraStudents` brilliant students that are **guaranteed** to pass the exam of any class they are assigned to. You want to assign each of the `extraStudents` students to a class in a way that **maximizes** the **average** pass ratio across **all** the classes.

The **pass ratio** of a class is equal to the number of students of the class that will pass the exam divided by the total number of students of the class. The **average pass ratio** is the sum of pass ratios of all the classes divided by the number of the classes.

Return _the **maximum** possible average pass ratio after assigning the_ `extraStudents` _students._ Answers within <code>10<sup>-5</sup></code> of the actual answer will be accepted.

**Example 1:**

**Input:** classes = [[1,2],[3,5],[2,2]], `extraStudents` = 2

**Output:** 0.78333

**Explanation:** You can assign the two extra students to the first class. The average pass ratio will be equal to (3/4 + 3/5 + 2/2) / 3 = 0.78333. 

**Example 2:**

**Input:** classes = [[2,4],[3,9],[4,5],[2,10]], `extraStudents` = 4

**Output:** 0.53485 

**Constraints:**

*   <code>1 <= classes.length <= 10<sup>5</sup></code>
*   `classes[i].length == 2`
*   <code>1 <= pass<sub>i</sub> <= total<sub>i</sub> <= 10<sup>5</sup></code>
*   <code>1 <= extraStudents <= 10<sup>5</sup></code>