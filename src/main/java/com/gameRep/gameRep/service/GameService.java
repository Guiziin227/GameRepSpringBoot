package com.gameRep.gameRep.service;

import com.gameRep.gameRep.dto.GameDto;
import com.gameRep.gameRep.dto.GameMinDto;
import com.gameRep.gameRep.entities.Game;
import com.gameRep.gameRep.repository.GameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GameService {

    private final GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDto> getAllGames(){
        List<Game> result = gameRepository.findAll();
        List<GameMinDto> dto = result.stream().map(x -> new GameMinDto(x)).toList();
        return dto;
    }

    @Transactional(readOnly = true)
    public GameDto getGameById(Long id){
        Game result = gameRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("Game not found with id: " + id)
        );

        GameDto dto = new GameDto(result);
        return dto;
    }
}
