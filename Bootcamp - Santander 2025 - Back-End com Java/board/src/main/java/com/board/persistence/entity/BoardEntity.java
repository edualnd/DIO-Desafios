package com.board.persistence.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import static com.board.persistence.entity.BoardColumnKindEnum.CANCEL;
import static com.board.persistence.entity.BoardColumnKindEnum.INITIAL;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Data
public class BoardEntity {
    private Long id;
    private String name;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<BoardColumnsEntity> boardColumns = new ArrayList<>();
    public BoardColumnsEntity getInitialColumn(){
        return getFilteredColumn(bc -> bc.getKind().equals(INITIAL));
    }

    public BoardColumnsEntity getCancelColumn(){
        return getFilteredColumn(bc -> bc.getKind().equals(CANCEL));
    }
    private BoardColumnsEntity getFilteredColumn(Predicate<BoardColumnsEntity> filter){
        return boardColumns.stream()
                .filter(filter)
                .findFirst().orElseThrow();
    }
}
