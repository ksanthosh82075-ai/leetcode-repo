-- Last updated: 8/14/2026, 2:37:44 PM
# Write your MySQL query statement below
SELECT
    p.FirstName,
    p.LastName,
    a.City,
    a.State
FROM Person p
LEFT JOIN Address a
ON p.PersonId = a.PersonId;