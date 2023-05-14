package com.italo.dslist.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.italo.dslist.dto.GameDTO;
import com.italo.dslist.dto.GameToDTO;
import com.italo.dslist.services.GameService;

@RestController
@RequestMapping("/games")
public class GameController {
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("")
    public List<GameDTO> findAll(){
        return gameService.listAll();
    }

    @GetMapping("/{id}")
    public GameToDTO findById(@PathVariable Long id){
        return gameService.findById(id);
    }
}
