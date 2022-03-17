CREATE TABLE crud.human(
  id bigint NOT NULL PRIMARY KEY,
  name text NOT NULL,
  sex text NOT NULL
);

INSERT INTO crud.human("id", "name", "sex") VALUES (1, 'Jani', 'MALE');
INSERT INTO crud.human("id", "name", "sex") VALUES (2, 'Jane', 'FEMALE');
INSERT INTO crud.human("id", "name", "sex") VALUES (3, 'Robot', 'OTHER');