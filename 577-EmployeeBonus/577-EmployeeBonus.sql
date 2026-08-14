-- Last updated: 8/14/2026, 2:35:10 PM
# Write your MySQL query statement below
SELECT
    e.name,
    b.bonus
FROM Employee e
LEFT JOIN Bonus b
ON e.empId = b.empId
WHERE b.bonus < 1000
   OR b.bonus IS NULL;