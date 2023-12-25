2889\. Reshape Data: Pivot

Easy

DataFrame `weather` 

    +-------------+--------+ 
    | Column Name | Type   | 
    +-------------+--------+ 
    | city        | object | 
    | month       | object | 
    | temperature | int    | 
    +-------------+--------+

Write a solution to **pivot** the data so that each row represents temperatures for a specific month, and each city is a separate column.

The result format is in the following example.

**Example 1:** **Input:** 

    +--------------+----------+-------------+ 
    | city         | month    | temperature | 
    +--------------+----------+-------------+ 
    | Jacksonville | January  | 13          | 
    | Jacksonville | February | 23          | 
    | Jacksonville | March    | 38          | 
    | Jacksonville | April    | 5           | 
    | Jacksonville | May      | 34          | 
    | ElPaso       | January  | 20          | 
    | ElPaso       | February | 6           | 
    | ElPaso       | March    | 26          | 
    | ElPaso       | April    | 2           | 
    | ElPaso       | May      | 43          | 
    +--------------+----------+-------------+

**Output:**` 

    +----------+--------+--------------+ 
    | month    | ElPaso | Jacksonville | 
    +----------+--------+--------------+ 
    | April    | 2      | 5            | 
    | February | 6      | 23           | 
    | January  | 20     | 13           | 
    | March    | 26     | 38           | 
    | May      | 43     | 34           | 
    +----------+--------+--------------+`

**Explanation:** The table is pivoted, each column represents a city, and each row represents a specific month.