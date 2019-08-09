SET SERVEROUTPUT ON

--CREAZIONE CURSORE--
DECLARE
CURSOR v_book_title_cursor IS
SELECT u.user_name, u.user_surname, b.title, c.start_date, c.end_date
FROM users u JOIN borroweds c ON u.user_id = c.user_id
    JOIN books b ON c.book_id = b.book_id;
BEGIN
FOR v_cur IN v_book_title_cursor LOOP
dbms_output.put_line(
v_cur.user_name || ' ' || v_cur.user_surname  || ' ' || v_cur.title || ' ' || v_cur.start_date || ' ' || v_cur.end_date);
END LOOP;
END;
/


--PROCEDURE 1) (che come risultato ha il cursore)--
CREATE OR REPLACE PROCEDURE get_book(
p_user_name IN users.user_name%type,
p_user_surname IN users.user_surname%type,
p_title OUT books.title%type) IS

--CREAZIONE CURSORE--
DECLARE
CURSOR v_book_title_cursor IS
SELECT u.user_name, u.user_surname, b.title, c.start_date, c.end_date
FROM users u JOIN borroweds c ON u.user_id = c.user_id
    JOIN books b ON c.book_id = b.book_id;
    
BEGIN
FOR v_cur IN v_book_title_cursor LOOP
dbms_output.put_line(
v_cur.user_name || ' ' || v_cur.user_surname  || ' ' || v_cur.title || ' ' || v_cur.start_date || ' ' || v_cur.end_date);
END LOOP;
END;
/

--RUN IT 1)--
DECLARE
v_user_name users.user_name%type :='Emanuele';
v_title books.title%type;
BEGIN
get_book (v_user_name,v_title);
dbms_output.put_line ('I libri presi in prestito sono: ' || v_title);
EXCEPTION
WHEN OTHERS THEN
dbms_output.put_line ('Il nome non è presene nel database');
END;
/