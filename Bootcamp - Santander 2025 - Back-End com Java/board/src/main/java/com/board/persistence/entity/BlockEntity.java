package com.board.persistence.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;

@Data
public class BlockEntity {
    private Long id;
    private OffsetDateTime blockedAt;
    private String block_reason;
    private OffsetDateTime unblockedAt;
    private String unblockReason;
}
