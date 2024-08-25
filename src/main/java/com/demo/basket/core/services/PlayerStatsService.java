package com.demo.basket.core.services;

import com.demo.basket.core.domain.PlayerStats;
import com.demo.basket.core.ports.PlayerStatsRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

@Service
public class PlayerStatsService {
    private final PlayerStatsRepository playerStatsRepository;

    public PlayerStatsService(PlayerStatsRepository playerStatsRepository) {
        this.playerStatsRepository = playerStatsRepository;
    }

    public List<PlayerStats> getPlayerStats() {
        return playerStatsRepository.getPlayerStats();
    }

    // Stream example 1: Filter players by points
    public List<PlayerStats> getPlayersWithMoreThanPoints(int points) {
        return playerStatsRepository.getPlayerStats().stream()
                .filter(player -> player.getPoints() > points)
                .collect(Collectors.toList());
    }

    // Stream example 2: Calculate average points
    public double getAveragePoints() {
        OptionalDouble average = playerStatsRepository.getPlayerStats().stream()
                .mapToInt(PlayerStats::getPoints)
                .average();
        return average.orElse(0);
    }

    // Stream example 3: Sort players by rebounds
    public List<PlayerStats> getPlayersSortedByRebounds() {
        return playerStatsRepository.getPlayerStats().stream()
                .sorted((p1, p2) -> Integer.compare(p2.getRebounds(), p1.getRebounds()))
                .collect(Collectors.toList());
    }
}
