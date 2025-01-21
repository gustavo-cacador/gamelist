package com.gustavo.gamelist.services;

import com.gustavo.gamelist.dto.GameDTO;
import com.gustavo.gamelist.entities.Game;
import com.gustavo.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameDTO(x)).toList();
    }
}
