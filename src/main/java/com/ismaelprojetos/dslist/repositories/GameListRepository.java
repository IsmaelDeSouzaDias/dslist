package com.ismaelprojetos.dslist.repositories;

import com.ismaelprojetos.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
