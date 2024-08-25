package com.demo.basket.infrastructure.adapters.api;

import com.demo.basket.core.domain.PlayerStats;
import com.demo.basket.core.services.PlayerStatsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/player-stats")
public class PlayerStatsController {
    private final PlayerStatsService playerStatsService;

    public PlayerStatsController(PlayerStatsService playerStatsService) {
        this.playerStatsService = playerStatsService;
    }

    @GetMapping
    public List<PlayerStats> getPlayerStats() {
        return playerStatsService.getPlayerStats();
    }

    @GetMapping("/points/greater-than/{points}")
    public List<PlayerStats> getPlayersWithMoreThanPoints(@PathVariable int points) {
        return playerStatsService.getPlayersWithMoreThanPoints(points);
    }

    @GetMapping("/average-points")
    public double getAveragePoints() {
        return playerStatsService.getAveragePoints();
    }

    @GetMapping("/sorted-by-rebounds")
    public List<PlayerStats> getPlayersSortedByRebounds() {
        return playerStatsService.getPlayersSortedByRebounds();
    }
}