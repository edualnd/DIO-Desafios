package com.board.persistence.entity;

import lombok.Data;


@Data
public class CardEntity {
    private Long id;
    private String title;
    private String description;
    private BoardColumnsEntity boardColumn = new BoardColumnsEntity();
}
