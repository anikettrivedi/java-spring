-- create database

CREATE DATABASE external_db;

-- create tables

USE external_db;
CREATE TABLE countries (
    ID INT PRIMARY KEY,
    NAME VARCHAR(255)
);

-- insert data into table

INSERT INTO countries (id, name) VALUES (1, 'USA');
INSERT INTO countries (id, name) VALUES (2, 'France');
INSERT INTO countries (id, name) VALUES (3, 'Brazil');
INSERT INTO countries (id, name) VALUES (4, 'Italy');
INSERT INTO countries (id, name) VALUES (5, 'Canada');
INSERT INTO countries (id, name) VALUES (6, 'India');
INSERT INTO countries (id, name) VALUES (7, 'Germany');