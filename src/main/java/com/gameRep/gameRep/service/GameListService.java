package com.gameRep.gameRep.service;

import com.gameRep.gameRep.dto.GameListDto;
import com.gameRep.gameRep.entities.GameList;
import com.gameRep.gameRep.repository.GameListRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameListService {

    private final GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDto> getAllLists(){
        List<GameList> result = gameListRepository.findAll();
        List<GameListDto> dto = result.stream().map(x -> new GameListDto(x)).toList();
        return dto;
    }
}
