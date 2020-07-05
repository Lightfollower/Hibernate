CREATE TABLE IF NOT EXISTS users (id bigserial, name VARCHAR(255), PRIMARY KEY (id));
INSERT INTO users (name) VALUES ('Bob');
INSERT INTO users (name) VALUES ('Dob');
INSERT INTO users (name) VALUES ('Dog');

CREATE TABLE IF NOT EXISTS products (id bigserial, title VARCHAR(255), cost int, PRIMARY KEY (id));
INSERT INTO products (title, cost) VALUES ('box', 100);
INSERT INTO products (title, cost) VALUES ('rox', 200);
INSERT INTO products (title, cost) VALUES ('vog', 300);
INSERT INTO products (title, cost) VALUES ('gag', 400);
INSERT INTO products (title, cost) VALUES ('god', 500);

CREATE TABLE IF NOT EXISTS deals (id bigserial, user_id int, product_id int, cost int);
INSERT INTO deals (user_id, product_id, cost) VALUES (1, 2, 150);
INSERT INTO deals (user_id, product_id, cost) VALUES (1, 3, 160);
INSERT INTO deals (user_id, product_id, cost) VALUES (1, 2, 180);
INSERT INTO deals (user_id, product_id, cost) VALUES (3, 2, 190);
