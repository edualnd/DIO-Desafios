package com.board.dto;

import com.board.persistence.entity.BoardColumnKindEnum;

public record BoardColumnsInfoDTO(Long id, int order, BoardColumnKindEnum kind) {
}
