package com.italo.dslist.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.italo.dslist.dto.GameDTO;
import com.italo.dslist.model.Game;
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
}
