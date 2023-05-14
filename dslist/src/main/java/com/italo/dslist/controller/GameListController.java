package com.italo.dslist.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.italo.dslist.dto.GameListDTO;
import com.italo.dslist.services.GameListService;

@RestController
@RequestMapping("/lists")
public class GameListController {
    private final GameListService gameListService;

    public GameListController(GameListService gameListService) {
        this.gameListService = gameListService;
    }

    @GetMapping("")
    public List<GameListDTO> findAll(){
        return gameListService.listAll();
    }
}
