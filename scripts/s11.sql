-- la tabella dual
select sysdate
from dual;

-- tutta la tabella
select *
from regions;

-- colonne
select region_name
from regions;

-- righe
select *
from regions
where region_id = 1;

select rowid, rownum
from regions;