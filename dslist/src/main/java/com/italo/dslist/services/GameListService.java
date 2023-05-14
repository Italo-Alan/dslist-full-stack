package com.italo.dslist.services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.italo.dslist.dto.GameListDTO;

import com.italo.dslist.repository.GameListRepository;

@Service
public class GameListService {
    private final GameListRepository gameListRepository;

    public GameListService(GameListRepository gameListRepository) {
        this.gameListRepository = gameListRepository;
    }

    public List<GameListDTO> listAll(){
        return gameListRepository.findAll()
            .stream()
            .map(x -> new GameListDTO(x)).toList();
    }
}
