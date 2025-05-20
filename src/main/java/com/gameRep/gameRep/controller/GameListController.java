package com.gameRep.gameRep.controller;

import com.gameRep.gameRep.dto.GameListDto;
import com.gameRep.gameRep.service.GameListService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    private final GameListService gameListService;

    @GetMapping
    public List<GameListDto> findAll() {
        List<GameListDto> result = gameListService.getAllLists();
        return result;
    }

}
