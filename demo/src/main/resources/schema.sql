--데이터베이스 초기화
--schema.sql(DDL) 이 존재하면 자동으로 scirpt를 실행하여 DB를 초기화(DDL수행) 한다.
--data.sql(INSERT) 파일이 존재하면 자동으로 scirpt를 실행하여 DB를 초기화(초기데이터입력) 한다.

DROP TABLE IF EXISTS USER;

CREATE TABLE IF NOT EXISTS USER(
 ID NUMBER IDENTITY,
 NAME VARCHAR(50)
 );
 
 INSERT INTO USER(NAME) VALUES('HONG');
 INSERT INTO USER(NAME) VALUES('KIM');
 INSERT INTO USER(NAME) VALUES('LEE'); 