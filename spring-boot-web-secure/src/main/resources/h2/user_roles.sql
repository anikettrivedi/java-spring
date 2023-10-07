-- create tables

CREATE TABLE user_roles (
    id INT PRIMARY KEY,
    username VARCHAR(50),
    password VARCHAR(50),
    role VARCHAR(50)
);

-- insert data

INSERT INTO user_roles (id, username, password, role) VALUES (1, 'aniket', 'aniket', 'admin');
INSERT INTO user_roles (id, username, password, role) VALUES (2, 'readonly', 'readonly', 'readonly');