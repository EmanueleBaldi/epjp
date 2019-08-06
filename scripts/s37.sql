SELECT e.first_name, d.department_name
FROM employees e LEFT OUTER JOIN departments d
USING (department_id);

SELECT e.first_name, j.job_title
FROM employees e LEFT OUTER JOIN jobs j
USING (job_id);

SELECT e.first_name, j.job_title, e.salary, j.min_salary, j.max_salary
FROM employees e JOIN jobs j
USING (job_id)
WHERE e.salary = j.min_salary OR e.salary=j.max_salary;

SELECT e.first_name, d.department_name, l.country_id, l.city
FROM employees e JOIN departments d ON d.department_id=e.department_id
JOIN locations l ON l.location_id=d.location_id
WHERE l.country_id = 'UK';

SELECT d.department_name, e.first_name, e.last_name 
FROM employees e JOIN departments d ON d.manager_id=e.employee_id;










