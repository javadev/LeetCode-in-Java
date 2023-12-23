2883\. Drop Missing Data

Easy

DataFrame students 

    +-------------+--------+ 
    | Column Name | Type   | 
    +-------------+--------+ 
    | student_id | int    | 
    | name        | object | 
    | age         | int    | 
    +-------------+--------+

There are some rows having missing values in the `name` column.

Write a solution to remove the rows with missing values.

The result format is in the following example.

**Example 1:**

**Input:** 

    +------------+---------+-----+ 
    | student_id | name    | age | 
    +------------+---------+-----+ 
    | 32         | Piper   | 5   | 
    | 217        | None    | 19  | 
    | 779        | Georgia | 20  | 
    | 849        | Willow  | 14  | 
    +------------+---------+-----+

**Output:** 

    +------------+---------+-----+ 
    | student_id | name    | age | 
    +------------+---------+-----+ 
    | 32         | Piper   | 5   | 
    | 779        | Georgia | 20  | 
    | 849        | Willow  | 14  | 
    +------------+---------+-----+

**Explanation:** Student with id 217 havs empty value in the name column, so it will be removed.