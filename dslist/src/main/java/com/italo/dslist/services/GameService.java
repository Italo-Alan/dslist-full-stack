package com.italo.dslist.services;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.italo.dslist.repository.GameRepository;
import com.italo.dslist.dto.GameDTO;
import com.italo.dslist.dto.GameToDTO;
import com.italo.dslist.model.Game;

@Service
public class GameService {
    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Transactional(readOnly = true)
    public List<GameDTO> listAll(){
        return gameRepository.findAll()
            .stream()
            .map(x -> new GameDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public GameToDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameToDTO(result);
    }
}
