package com.italo.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.italo.dslist.model.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
    
}
