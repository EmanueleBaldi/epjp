--CREATE TABLE coders
--AS
--SELECT employee_id AS coder_id, first_name, last_name, hire_date, salary
--FROM hr.employees
--WHERE department_id = 60;


CREATE SEQUENCE id_seq START WITH 201 INCREMENT BY 1;
INSERT INTO coders values (id_seq.NEXTVAL, 'Maria', 'Rossi', SYSDATE, 5000);
INSERT INTO coders values (id_seq.NEXTVAL, 'Franco', 'Bianchi', SYSDATE, 4500);

ALTER TABLE coders ADD CONSTRAINT coders_pk PRIMARY KEY(coder_id); --lo faccio perchè creandomi la tabella con SELECT non mi sono importato i CONSTRAINTS

UPDATE coders
SET first_name = 'Mariangela'
WHERE coder_id = 201;

UPDATE coders
SET salary = salary+500
WHERE salary < 6000;

DELETE FROM coders
WHERE first_name = 'Franco' AND last_name='Bianchi';

COMMIT;