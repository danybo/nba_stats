package com.demo.basket.infrastructure.adapters.repository;

import com.demo.basket.core.domain.PlayerStats;
import com.demo.basket.dto.PlayerStatsResponse;
import com.demo.basket.core.ports.PlayerStatsRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@Repository
public class ApiPlayerStatsRepository implements PlayerStatsRepository {
    private final RestTemplate restTemplate;
    private final String apiUrl = "https://nba-stats-db.herokuapp.com/api/playerdata/season/2023"; //"https://api.example.com/nba/player-stats";

    public ApiPlayerStatsRepository(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<PlayerStats> getPlayerStats() {
        // String test = restTemplate.getForObject(apiUrl, String.class);

        // PlayerStats[] statsArray = restTemplate.getForObject(apiUrl, PlayerStats[].class);
        PlayerStatsResponse response = restTemplate.getForObject(apiUrl,PlayerStatsResponse.class);

        // return statsArray != null ? Arrays.asList(statsArray) : Collections.emptyList();
        return response != null ? response.getResults() : Collections.emptyList();

    }
}
