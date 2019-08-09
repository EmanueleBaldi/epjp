SET SERVEROUTPUT ON

-- PROCEDURE 1) --
CREATE OR REPLACE PROCEDURE get_day_after(
p_tomorrow out DATE) IS
BEGIN
p_tomorrow := sysdate + 1;
END get_day_after;
/

-- RUN IT 1) --
DECLARE 
v_tomorrow DATE;
BEGIN
get_day_after(v_tomorrow);
dbms_output.put_line('Tomorrow is ' || v_tomorrow);
END;
/

-- PROCEDURA 2) --
CREATE OR REPLACE PROCEDURE get_day_after(
p_tomorrow out DATE) IS
BEGIN

p_tomorrow := sysdate + 1;
END get_day_after;
/

-- RUN IT 2) --
DECLARE
v_name VARCHAR2(20) := 'Emanuele';
v_tomorrow DATE;
BEGIN
get_day_after(v_name, v_tomorrow);
dbms_output.put_line(v_name || ' ' || ' tomorrow is ' || v_tomorrow);
END;
/