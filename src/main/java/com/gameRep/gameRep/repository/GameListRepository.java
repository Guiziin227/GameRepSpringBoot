package com.gameRep.gameRep.repository;

import com.gameRep.gameRep.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
