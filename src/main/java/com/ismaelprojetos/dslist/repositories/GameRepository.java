package com.ismaelprojetos.dslist.repositories;

import com.ismaelprojetos.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
