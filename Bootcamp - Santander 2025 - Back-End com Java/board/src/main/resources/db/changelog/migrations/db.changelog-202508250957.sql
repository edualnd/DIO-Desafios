-- liquibase formatted sql
-- changeset duda:202508250957
-- comment: blocks table create
create table BLOCKS(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    blocked_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    block_reason  VARCHAR(255) NULL,
    unblocked_at TIMESTAMP NULL,
    unblock_reason  VARCHAR(255) NULL,
    card_id BIGINT NOT NULL,

    CONSTRAINT blocks__cards_fk FOREIGN KEY (card_id) REFERENCES CARDS(id) ON DELETE CASCADE

)ENGINE=InnoDB;

-- rollback DROP TABLE BLOCKS