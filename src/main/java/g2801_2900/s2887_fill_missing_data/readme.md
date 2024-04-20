2887\. Fill Missing Data

Easy

DataFrame `products` 

    +-------------+--------+ 
    | Column Name | Type   | 
    +-------------+--------+ 
    | name        | object | 
    | quantity    | int    | 
    | price       | int    | 
    +-------------+--------+

Write a solution to fill in the missing value as <code>**0**</code> in the `quantity` column.

The result format is in the following example.

**Example 1:** 

**Input:**
    
    +-----------------+----------+-------+ 
    | name            | quantity | price | 
    +-----------------+----------+-------+ 
    | Wristwatch      | None     | 135   | 
    | WirelessEarbuds | None     | 821   | 
    | GolfClubs       | 779      | 9319  | 
    | Printer         | 849      | 3051  | 
    +-----------------+----------+-------+

**Output:** 

    +-----------------+----------+-------+ 
    | name            | quantity | price | 
    +-----------------+----------+-------+ 
    | Wristwatch      | 0        | 135   | 
    | WirelessEarbuds | 0        | 821   | 
    | GolfClubs       | 779      | 9319  | 
    | Printer         | 849      | 3051  | 
    +-----------------+----------+-------+

**Explanation:** The quantity for Wristwatch and WirelessEarbuds are filled by 0.