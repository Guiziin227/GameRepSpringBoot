package com.gameRep.gameRep.controller;

import com.gameRep.gameRep.dto.GameListDto;
import com.gameRep.gameRep.dto.GameMinDto;
import com.gameRep.gameRep.service.GameListService;
import com.gameRep.gameRep.service.GameService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    private final GameListService gameListService;
    private final GameService gameService;

    @GetMapping
    public List<GameListDto> findAll() {
        return gameListService.getAllLists();
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDto> findByList(@PathVariable Long listId) {
        return gameService.findByList(listId);
    }
}
