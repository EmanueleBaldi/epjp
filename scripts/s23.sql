SELECT first_name, last_name, hire_date
FROM employees
WHERE hire_date LIKE '%05';

SELECT DISTINCT job_id
FROM employees;

SELECT first_name, last_name
FROM employees
WHERE commission_pct IS NOT null;

SELECT first_name, last_name
FROM employees
WHERE first_name LIKE '%a%' OR first_name LIKE 'A%' OR last_name LIKE '%a%' OR last_name LIKE 'A%';

SELECT department_name
FROM departments
ORDER BY department_name;

SELECT country_id, city
FROM locations
WHERE country_id LIKE 'IT';