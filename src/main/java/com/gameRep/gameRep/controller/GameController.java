package com.gameRep.gameRep.controller;

import com.gameRep.gameRep.dto.GameMinDto;
import com.gameRep.gameRep.entities.Game;
import com.gameRep.gameRep.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
@RequiredArgsConstructor
public class GameController {

    private final GameService gameService;


    @GetMapping
    List<GameMinDto> findAll() {
        List<GameMinDto> result = gameService.getAllGames();
        return result;
    }

}
