package com.board.persistence.entity;

import lombok.Data;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
public class BoardEntity {
    private Long id;
    private String name;
    private List<BoardColumnsEntity> boardColumns = new ArrayList<>();
}
