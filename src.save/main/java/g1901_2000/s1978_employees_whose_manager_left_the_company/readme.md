1978\. Employees Whose Manager Left the Company

Easy

SQL Schema

Table: `Employees`

    +-------------+----------+ 
    | Column Name | Type     | 
    +-------------+----------+ 
    | employee_id | int      | 
    | name        | varchar  | 
    | manager_id  | int      | 
    | salary      | int      | 
    +-------------+----------+ 

employee_id is the primary key for this table. This table contains information about the employees, their salary, and the ID of their manager. Some employees do not have a manager (manager_id is null).

Write an SQL query to report the IDs of the employees whose salary is strictly less than `$30000` and whose manager left the company. When a manager leaves the company, their information is deleted from the `Employees` table, but the reports still have their `manager_id` set to the manager that left.

Return the result table ordered by `employee_id`.

The query result format is in the following example.

**Example 1:**

**Input: ** Employees table: 

    +-------------+-----------+------------+--------+ 
    | employee_id | name      | manager_id | salary | 
    +-------------+-----------+------------+--------+ 
    | 3           | Mila      | 9          | 60301  | 
    | 12          | Antonella | null       | 31000  | 
    | 13          | Emery     | null       | 67084  | 
    | 1           | Kalel     | 11         | 21241  | 
    | 9           | Mikaela   | null       | 50937  | 
    | 11          | Joziah    | 6          | 28485  | 
    +-------------+-----------+------------+--------+

**Output:** 

    +-------------+ 
    | employee_id | 
    +-------------+ 
    | 11          | 
    +-------------+

**Explanation:**

The employees with a salary less than $30000 are 1 (Kalel) and 11 (Joziah). 

Kalel's manager is employee 11, who is still in the company (Joziah).

Joziah's manager is employee 6, who left the company because there is no row for employee 6 as it was deleted. 
