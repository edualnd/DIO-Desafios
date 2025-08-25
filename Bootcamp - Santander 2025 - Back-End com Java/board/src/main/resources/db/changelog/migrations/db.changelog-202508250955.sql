-- liquibase formatted sql
-- changeset duda:202508250955
-- comment: cards table create
create table CARDS(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
        title VARCHAR(255) NOT NULL,
        description VARCHAR(255) NOT NULL,
        board_columns_id BIGINT NOT NULL,

        CONSTRAINT boards_columns__cards_fk FOREIGN KEY (board_columns_id) REFERENCES BOARDS_COLUMNS(id) ON DELETE CASCADE

)ENGINE=InnoDB;

-- rollback DROP TABLE CARDS