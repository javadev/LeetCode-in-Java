CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
# #Medium #Database #2022_03_04_Time_328_ms_(65.32%)_Space_0B_(100.00%)
BEGIN
DECLARE M INT;
SET M=N-1;
  RETURN (
      # Write your MySQL query statement below.
      # #Medium #Database #2022_03_04_Time_328_ms_(65.32%)_Space_0B_(100.00%)
      SELECT DISTINCT Salary FROM Employee ORDER BY Salary DESC LIMIT M, 1
  );
END
