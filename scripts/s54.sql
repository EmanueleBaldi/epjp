SELECT l.street_address, l.postal_code, l.city, l.state_province, c.country_name
FROM locations l FULL OUTER JOIN countries c
USING (country_id);

SELECT e.first_name, d.department_name
FROM employees e JOIN departments d
USING (department_id);

SELECT e.first_name, d.department_name, l.city
FROM employees e JOIN departments d ON (e.department_id=d.department_id) 
JOIN locations l ON (d.location_id=l.location_id)
WHERE l.location_id = '1800';

SELECT e.first_name, e.last_name, e.hire_date
FROM employees e
WHERE e.hire_date > (SELECT e.hire_date FROM employees e WHERE e.first_name='David' AND e.last_name='Lee' );

SELECT e.first_name, e.last_name, e.hire_date
FROM employees e JOIN employees m ON (e.manager_id = m.employee_id)
WHERE e.hire_date < m.hire_date;

SELECT e.first_name, e.last_name, e.manager_id
FROM employees e
WHERE e.manager_id = (SELECT e.manager_id FROM employees e WHERE e.first_name='Lisa' AND e.last_name='Ozer');

SELECT e.first_name, e.last_name, e.department_id
FROM employees e
WHERE e.department_id IN (SELECT e.department_id FROM employees e WHERE REGEXP_LIKE ( e.last_name, 'u', 'i'));

SELECT e.first_name, e.last_name, e.department_id
FROM employees e
WHERE e.department_id = (SELECT d.department_id FROM departments d WHERE department_name = 'Shipping');

--SELECT e.first_name, e.last_name, e.manager_id
--FROM employees e
--WHERE e.manager_id = (SELECT e.manager_id FROM 
