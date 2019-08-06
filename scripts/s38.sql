SELECT d.department_name, e.first_name, e.last_name 
FROM employees e RIGHT OUTER JOIN departments d ON d.manager_id=e.employee_id;

SELECT d.department_name, e.first_name, e.last_name 
FROM employees e RIGHT OUTER JOIN departments d ON d.manager_id=e.employee_id
WHERE d.manager_id IS NULL;

SELECT e.first_name || ' ' || e.last_name as "Employee's name", m.first_name || ' ' || m.last_name as "Manager's name" 
FROM employees e LEFT OUTER JOIN employees m
ON (m.employee_id = e.manager_id)
ORDER BY 1;

-- altro modo per svolgere l'esercizio --
--SELECT e.first_name || ' ' || e.last_name as "Manager's name", m.first_name || ' ' || m.last_name as "Employee's name" 
--FROM employees e RIGHT OUTER JOIN employees m
--ON (e.employee_id = m.manager_id)
--ORDER BY 1;

SELECT e.first_name || ' ' || e.last_name as "Employee's name" 
FROM employees e LEFT OUTER JOIN employees m
ON (m.employee_id = e.manager_id)
WHERE e.employee_id NOT IN m.manager_id;