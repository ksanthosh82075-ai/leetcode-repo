-- Last updated: 8/14/2026, 2:37:34 PM
# Write your MySQL query statement below
SELECT
    Score,
    DENSE_RANK() OVER (ORDER BY Score DESC) AS 'Rank'
FROM Scores;