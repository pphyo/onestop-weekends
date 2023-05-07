insert into category (name) values ('Action and Adventure');
insert into category (name) values ('Classics');
insert into category (name) values ('Comic or Graphic Novel');
insert into category (name) values ('Detective and Mystery');
insert into category (name) values ('Fantasy');
insert into category (name) values ('Historical Fiction');
insert into category (name) values ('Horror');
insert into category (name) values ('Romance');

insert into contact (email, address) values ('yannmartel@gmail.com', 'Japan');
insert into contact (email, address) values ('alexandre@outlook.com', 'Sweden');
insert into contact (email, address) values ('jacklondon@novel.com', 'Canada');
insert into contact (email, address) values ('harpar@twitter.com', 'USA');

insert into phones values (1, '0193939393');
insert into phones values (1, '0173829223');
insert into phones values (2, '0284959999');
insert into phones values (3, '0284959999');
insert into phones values (3, '0284959999');
insert into phones values (4, '0284959999');
insert into phones values (4, '0284959999');

insert into author (name, gender, contact_id) values ('Yann Martel', 'Male', 1);
insert into author (name, gender, contact_id) values ('Alexandre Dumas', 'Male', 2);
insert into author (name, gender, contact_id) values ('Jack London', 'Male', 3);
insert into author (name, gender, contact_id) values ('Harper Lee', 'Male', 4);
insert into author (name, gender) values ('Louisa May Wcott', 'Female');
insert into author (name, gender) values ('Tonni Morrison', 'Male');
insert into author (name, gender) values ('Charli Mackery', 'Male');
insert into author (name, gender) values ('Sir Arthur Conan Doyle', 'Male');
insert into author (name, gender) values ('Madeline Miller', 'Other');
insert into author (name, gender) values ('Josh Malerman', 'Male');
insert into author (name, gender) values ('Jasmine Guillory', 'Female');

insert into book (title, book_type, price, published_date, isbn, category_id, author_id) values ('Life of Pi', 'Original', 15000, '2000-02-23', 'I00001', 1, 1);
insert into book (title, book_type, price, published_date, isbn, category_id, author_id) values ('The Three Musketeers', 'Original', 20000, '1996-05-10', 'I00002', 1, 2);
insert into book (title, book_type, price, published_date, isbn, category_id, author_id) values ('The Call of the Wild', 'Translation', 10000, '2008-10-12', 'I00003', 1, 3);
insert into book (title, book_type, price, published_date, isbn, category_id, author_id) values ('To Kill a Mockingbird', 'Original', 30000, '1990-12-09', 'I00004', 2, 4);
insert into book (title, book_type, price, published_date, isbn, category_id, author_id) values ('Little Woman', 'Translation', 18000, '2002-04-19', 'I00005', 2, 5);
insert into book (title, book_type, price, published_date, isbn, category_id, author_id) values ('Beloved', 'Translation', 21000, '2006-06-21', 'I00006', 2, 6);
insert into book (title, book_type, price, published_date, isbn, category_id, author_id) values ('The Boy, The Mole, The Fox and The Horse', 'Original', 29000, '1998-02-03', 'I00007', 3, 1);
insert into book (title, book_type, price, published_date, isbn, category_id, author_id) values ('The Adventures of Sherlock Holmes', 'Original', 35000, '1997-08-30', 'I00008', 4, 7);
insert into book (title, book_type, price, published_date, isbn, category_id, author_id) values ('Circe', 'Translation', 14000, '1999-10-13', 'I00009', 5, 8);
insert into book (title, book_type, price, published_date, isbn, category_id, author_id) values ('Bird Box', 'Translation', 19000, '2006-12-15', 'I00010', 7, 9);
insert into book (title, book_type, price, published_date, isbn, category_id, author_id) values ('Royal Holiday', 'Original', 21000, '1994-03-02', 'I00011', 8, 10);

insert into sale (sale_date, total) values ('2023-04-01', 57000);
insert into sale (sale_date, total) values ('2023-04-02', 97000);
insert into sale (sale_date, total) values ('2023-04-03', 128000);
insert into sale (sale_date, total) values ('2023-04-04', 65000);
insert into sale (sale_date, total) values ('2023-04-05', 68000);

insert into sale_item (unit_price, quantity, book_id, sale_id) values (15000, 1, 1, 1);
insert into sale_item (unit_price, quantity, book_id, sale_id) values (21000, 2, 11, 1);
insert into sale_item (unit_price, quantity, book_id, sale_id) values (20000, 2, 2, 2);
insert into sale_item (unit_price, quantity, book_id, sale_id) values (19000, 3, 10, 2);
insert into sale_item (unit_price, quantity, book_id, sale_id) values (10000, 10, 3, 3);
insert into sale_item (unit_price, quantity, book_id, sale_id) values (14000, 2, 9, 3);
insert into sale_item (unit_price, quantity, book_id, sale_id) values (30000, 1, 4, 4);
insert into sale_item (unit_price, quantity, book_id, sale_id) values (35000, 1, 8, 4);
insert into sale_item (unit_price, quantity, book_id, sale_id) values (18000, 1, 5, 5);
insert into sale_item (unit_price, quantity, book_id, sale_id) values (21000, 1, 6, 5);
insert into sale_item (unit_price, quantity, book_id, sale_id) values (29000, 1, 7, 5);