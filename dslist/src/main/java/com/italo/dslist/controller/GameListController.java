package com.italo.dslist.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.italo.dslist.dto.GameDTO;
import com.italo.dslist.dto.GameListDTO;
import com.italo.dslist.services.GameListService;
import com.italo.dslist.services.GameService;

@RestController
@RequestMapping("/lists")
public class GameListController {
    private final GameListService gameListService;
    private final GameService gameService;

    public GameListController(GameListService gameListService, GameService gameService) {
        this.gameListService = gameListService;
        this.gameService = gameService;
    }

    @GetMapping("")
    public List<GameListDTO> findAll(){
        return gameListService.listAll();
    }

    @GetMapping("/{listId}/games")
    public List<GameDTO> findByList(@PathVariable Long listId){
        return gameService.findByList(listId);
    }
}
