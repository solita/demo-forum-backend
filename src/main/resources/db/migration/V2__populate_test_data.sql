
INSERT INTO topic (id, title) VALUES ((SELECT hibernate_sequence.nextval), 'Test1');

INSERT INTO message (id, create_time, content, topic) VALUES ((SELECT hibernate_sequence.nextval), (CURRENT_TIMESTAMP()), 'CONTENT1', (SELECT id FROM topic));
INSERT INTO message (id, create_time, content, topic) VALUES ((SELECT hibernate_sequence.nextval), (CURRENT_TIMESTAMP()), 'CONTENT2', (SELECT id FROM topic));
INSERT INTO message (id, create_time, content, topic) VALUES ((SELECT hibernate_sequence.nextval), (CURRENT_TIMESTAMP()), 'CONTENT3', (SELECT id FROM topic));
