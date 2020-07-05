CREATE TABLE IF NOT EXISTS users (id bigserial, name VARCHAR(255), PRIMARY KEY (id));
INSERT INTO users (name) VALUES ('Bob');
INSERT INTO users (name) VALUES ('Dob');
INSERT INTO users (name) VALUES ('Dog');

CREATE TABLE IF NOT EXISTS products (id bigserial, title VARCHAR(255), cost int, PRIMARY KEY (id));
INSERT INTO products (title, cost) VALUES ('box', 100);
INSERT INTO products (title, cost) VALUES ('vox', 200);
INSERT INTO products (title, cost) VALUES ('vog', 300);
INSERT INTO products (title, cost) VALUES ('gog', 400);
INSERT INTO products (title, cost) VALUES ('god', 500);