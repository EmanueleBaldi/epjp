SELECT b.title, a.author_name, a.author_surname
FROM books b JOIN book_author c ON b.book_id = c.book_id
    JOIN authors a ON c.author_id = a.author_id;
    
SELECT u.user_name, u.user_surname, b.title, c.start_date
FROM users u JOIN borroweds c ON u.user_id = c.user_id
    JOIN books b ON c.book_id = b.book_id;
    
SELECT u.user_name, u.user_surname, b.title, c.start_date, c.end_date
FROM users u JOIN borroweds c ON u.user_id = c.user_id
    JOIN books b ON c.book_id = b.book_id;
    
SELECT u.user_name, u.user_surname, b.title, c.start_date, c.end_date
FROM users u JOIN borroweds c ON u.user_id = c.user_id
    JOIN books b ON c.book_id = b.book_id
    WHERE c.end_date IS NOT null;