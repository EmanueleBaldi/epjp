--POPOLAMENTO DELLA TABELLA BOOKS--
--DROP SEQUENCE book_id_seq;
CREATE SEQUENCE book_id_seq START WITH 1000 INCREMENT BY 1;
INSERT INTO books VALUES (book_id_seq.NEXTVAL, 'Gocce di Java');
INSERT INTO books VALUES (book_id_seq.NEXTVAL, 'Programmazione di base e avanzata con Java');
INSERT INTO books VALUES (book_id_seq.NEXTVAL, 'Manuale di Java 8');
INSERT INTO books VALUES (book_id_seq.NEXTVAL, 'Linguaggi di programmazione. Principi e paradigmi');

--POPOLAMENTO DELLA TABELLA AUTHORS--
--DROP SEQUENCE author_id_seq;
CREATE SEQUENCE author_id_seq START WITH 2000 INCREMENT BY 1;
INSERT INTO authors VALUES (author_id_seq.NEXTVAL, 'Pierluigi', 'Crescenzi');
INSERT INTO authors VALUES (author_id_seq.NEXTVAL, 'Walter', 'Savitch');
INSERT INTO authors VALUES (author_id_seq.NEXTVAL, 'Claudio', 'De Sio Cesari');
INSERT INTO authors VALUES (author_id_seq.NEXTVAL, 'Maurizio', 'Gabbrielli');
INSERT INTO authors VALUES (author_id_seq.NEXTVAL, 'Simone', 'Martini');

--POPOLAMENTO DELLA TABELLA INTERMEDIA BOOK_AUTHOR--
INSERT INTO book_author VALUES(2000, 1000);
INSERT INTO book_author VALUES(2001, 1001);
INSERT INTO book_author VALUES(2002, 1002);
INSERT INTO book_author VALUES(2003, 1003);
INSERT INTO book_author VALUES(2004, 1003);

--POPOLAMENTO DELLA TABELLA USERS--
--DROP SEQUENCE user_id_seq;
CREATE SEQUENCE user_id_seq START WITH 3000 INCREMENT BY 1;
INSERT INTO users VALUES (user_id_seq.NEXTVAL, 'Emanuele', 'Baldi');
INSERT INTO users VALUES (user_id_seq.NEXTVAL, 'Marta', 'Colombo');
INSERT INTO users VALUES (user_id_seq.NEXTVAL, 'Giacomo', 'Bazzigalupi');

--POPOLAMENTO DELLA TABELLA BORROWEDS--
--DROP SEQUENCE borrowed_id_seq;
CREATE SEQUENCE borrowed_id_seq START WITH 4000 INCREMENT BY 1;
INSERT INTO borroweds VALUES (borrowed_id_seq.NEXTVAL, '01-AGO-19', null, '01-SET-19', 1001, 3000);
INSERT INTO borroweds VALUES (borrowed_id_seq.NEXTVAL, '20-LUG-19', null, '20-AGO-19', 1002, 3000);
INSERT INTO borroweds VALUES (borrowed_id_seq.NEXTVAL, '20-GIU-19', '20-LUG-19', '20-LUG-19', 1000, 3001);
INSERT INTO borroweds VALUES (borrowed_id_seq.NEXTVAL, '15-OTT-18', '05-GEN-19', '15-NOV-18', 1003, 3002);