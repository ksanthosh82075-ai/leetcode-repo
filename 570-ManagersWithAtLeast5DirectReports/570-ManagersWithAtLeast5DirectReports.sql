-- Last updated: 8/14/2026, 2:35:15 PM
# Write your MySQL query statement below
SELECT e.name
FROM Employee e
JOIN Employee emp
ON e.id = emp.managerId
GROUP BY e.id, e.name
HAVING COUNT(emp.id) >= 5;