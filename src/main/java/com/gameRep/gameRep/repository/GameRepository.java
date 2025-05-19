package com.gameRep.gameRep.repository;

import com.gameRep.gameRep.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
