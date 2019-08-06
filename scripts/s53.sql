SELECT max(e.salary), min(e.salary), sum(e.salary), round(avg(e.salary),2)
FROM employees e;

SELECT e.job_id, max(e.salary), min(e.salary), sum(e.salary), round(avg(e.salary),2)
FROM employees e
GROUP BY e.job_id
ORDER BY 1;

SELECT e.job_id, COUNT(ROWNUM) AS "number of employees"
FROM employees e
GROUP BY e.job_id;

SELECT e.job_id, COUNT(ROWNUM) AS "number of employees"
FROM employees e
GROUP BY e.job_id
HAVING e.job_id = 'IT_PROG';

SELECT COUNT(DISTINCT e.manager_id) AS "number of managers"
FROM employees e;

SELECT (max(e.salary) - min(e.salary)) AS "max - min salary"
FROM employees e;