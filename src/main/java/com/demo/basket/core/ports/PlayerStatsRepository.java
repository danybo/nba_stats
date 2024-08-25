package com.demo.basket.core.ports;

import com.demo.basket.core.domain.PlayerStats;
import java.util.List;

public interface PlayerStatsRepository {
    List<PlayerStats> getPlayerStats();
}