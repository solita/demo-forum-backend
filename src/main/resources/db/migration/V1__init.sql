
CREATE SEQUENCE hibernate_sequence;

CREATE TABLE topic (
  id bigint PRIMARY KEY,
  title VARCHAR(100)
);

CREATE TABLE message (
  id bigint PRIMARY KEY,
  create_time TIMESTAMP NOT NULL,
  content VARCHAR(1000),
  topic bigint NOT NULL REFERENCES topic (id)
);
