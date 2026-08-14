-- Last updated: 8/14/2026, 2:35:02 PM
# Write your MySQL query statement below
SELECT
    name,
    population,
    area
FROM World
WHERE area >= 3000000
   OR population >= 25000000;