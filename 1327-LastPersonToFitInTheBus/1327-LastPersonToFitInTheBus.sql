-- Last updated: 8/14/2026, 2:33:23 PM
# Write your MySQL query statement below
SELECT person_name
FROM Queue
WHERE turn = (
    SELECT MAX(turn)
    FROM (
        SELECT turn,
               SUM(weight) OVER (ORDER BY turn) AS total_weight
        FROM Queue
    ) t
    WHERE total_weight <= 1000
);