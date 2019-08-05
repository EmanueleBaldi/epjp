SELECT first_name, last_name, email, phone_number, hire_date
FROM employees
order by 2, 1;

SELECT first_name, last_name, email, phone_number, hire_date
FROM employees 
WHERE first_name = 'David' OR first_name = 'Peter'
ORDER BY 2,1;

SELECT first_name, last_name, email, phone_number, hire_date
FROM employees 
WHERE department_id = 60
ORDER BY 2,1;

SELECT first_name, last_name, email, phone_number, hire_date
FROM employees 
WHERE department_id = 30 OR department_id = 50
ORDER BY 2,1;

SELECT first_name, last_name, email, phone_number, hire_date
FROM employees 
WHERE salary>10000
ORDER BY 2,1;

SELECT first_name, last_name, email, phone_number, hire_date
FROM employees 
WHERE salary<4000 OR salary>15000
ORDER BY 2,1;

SELECT first_name, last_name, email, phone_number, hire_date 
FROM employees 
WHERE (department_id = ANY (50, 80) AND (salary<4000 OR salary>15000))
ORDER BY 2,1;

