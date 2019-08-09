--ELIMINAZIONE DELLE TABELLE--
--DROP TABLE book_author;
--DROP TABLE authors;
--DROP TABLE borroweds;
--DROP TABLE users;
--DROP TABLE books;

--CREAZIONE TABELLA BOOKS--
CREATE TABLE books (
book_id INTEGER
CONSTRAINT book_id_pk PRIMARY KEY,
title VARCHAR2(50)
CONSTRAINT title_nn NOT NULL);

--CREAZIONE TABELLA AUTHORS--
CREATE TABLE authors (
author_id INTEGER
CONSTRAINT author_id_pk PRIMARY KEY,
author_name VARCHAR2(20)
CONSTRAINT author_name_nn NOT NULL,
author_surname VARCHAR2(20)
CONSTRAINT author_surname_nn NOT NULL);

--CREAZIONE TABELLA INTERMEDIA BOOK_AUTHOR (relazione many to many)--
CREATE TABLE book_author (
author_id INTEGER
CONSTRAINT ba_author_id_fk REFERENCES authors(author_id) ON DELETE CASCADE,
book_id INTEGER
CONSTRAINT ba_book_id_fk REFERENCES books(book_id) ON DELETE CASCADE,
CONSTRAINT ba_book_author_pk PRIMARY KEY(book_id, author_id));

--CREAZIONE TABELLA USERS--
CREATE TABLE users (
user_id INTEGER
CONSTRAINT user_id_pk PRIMARY KEY,
user_name VARCHAR2(20)
CONSTRAINT user_name_nn NOT NULL,
user_surname VARCHAR2(20)
CONSTRAINT user_surname_nn NOT NULL);

--CREAZIONE TABELLA BORROWEDS--
CREATE TABLE borroweds (
borrowed_id INTEGER
CONSTRAINT borrowed_id_pk PRIMARY KEY,
start_date DATE
CONSTRAINT start_nn NOT NULL,
end_date DATE
CONSTRAINT end_nn NOT NULL,
expiration_date DATE
CONSTRAINT expiration_date_nn NOT NULL,
book_id INTEGER
CONSTRAINT borrowed_book_id_fk REFERENCES books(book_id) ON DELETE CASCADE,
user_id INTEGER
CONSTRAINT borrowed_user_id_fk REFERENCES users(user_id) ON DELETE CASCADE);
--ho impostato la end_date senza che possa essere null, ma voglio togliere questo CONSTRAINT
ALTER TABLE borroweds DROP CONSTRAINT end_nn;