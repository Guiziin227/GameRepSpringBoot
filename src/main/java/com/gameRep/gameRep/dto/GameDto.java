package com.gameRep.gameRep.dto;

import com.gameRep.gameRep.entities.Game;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
public class GameDto {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;
    private String platform;
    private Double score;

    public GameDto(Game game) {
        BeanUtils.copyProperties(game, this);
    }
}
