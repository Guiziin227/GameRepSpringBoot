package com.gameRep.gameRep.dto;

import com.gameRep.gameRep.entities.GameList;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class GameListDto {

    private Long id;
    private String name;

    public GameListDto(GameList gameList) {
        this.id = gameList.getId();
        this.name = gameList.getName();
    }

}
