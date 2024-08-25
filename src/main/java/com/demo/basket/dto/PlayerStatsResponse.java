package com.demo.basket.dto;

import com.demo.basket.core.domain.PlayerStats;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class PlayerStatsResponse {
    private int count;
    private String next;
    private String previous;
    private List<PlayerStats> results;
}