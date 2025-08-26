package com.board.dto;

import com.board.persistence.entity.BoardColumnKindEnum;

public record BoardColumnsDTO(Long id,
                             String name,
                             BoardColumnKindEnum kind,
                             int cardsAmount) {
}
