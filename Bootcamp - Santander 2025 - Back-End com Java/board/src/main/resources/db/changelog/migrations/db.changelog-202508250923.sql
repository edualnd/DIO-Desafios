-- liquibase formatted sql
-- changeset duda:202508250923
-- comment: boards table create
create table BOARDS(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL
)ENGINE=InnoDB;

-- rollback DROP TABLE BOARDS