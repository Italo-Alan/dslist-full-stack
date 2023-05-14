package com.italo.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.italo.dslist.model.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
    
}
