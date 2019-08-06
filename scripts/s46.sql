SELECT e.first_name, e.last_name, e.salary as "current salary", e.salary*1.085 as "increased salary", abs(e.salary - e.salary*1.085) as "delta"
FROM employees e;

SELECT e.first_name, e.last_name
FROM employees e
WHERE REGEXP_LIKE (first_name, 'a', 'i') OR REGEXP_LIKE (last_name, 'a', 'i') ;

SELECT  ROUND(MONTHS_BETWEEN(sysdate, e.hire_date)) as "months from assumption", e.first_name, e.last_name
FROM employees e;

SELECT e.first_name, e.last_name,  LPAD('*', FLOOR(e.salary/1000), '*') "SALARY IN STARS", FLOOR(e.salary/1000) as "NUMBER OF STARS"
FROM employees e;

SELECT e.first_name, e.last_name, nvl2(e.commission_pct, TO_CHAR(e.commission_pct, '0d99'), 'no value')
FROM employees e;



