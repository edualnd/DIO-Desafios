package com.board.persistence.entity;

import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class BoardColumnsEntity {
    private Long id;
    private String name;
    private int order;
    private BoardColumnKindEnum kind;
    private BoardEntity board = new BoardEntity();
}
