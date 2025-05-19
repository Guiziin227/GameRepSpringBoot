package com.gameRep.gameRep.service;

import com.gameRep.gameRep.dto.GameMinDto;
import com.gameRep.gameRep.entities.Game;
import com.gameRep.gameRep.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameService {

    private final GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<Game> getAllGames(){
        List<Game> result = gameRepository.findAll();
        return result;
    }
}
