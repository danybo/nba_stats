package com.demo.basket.core.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PlayerStats {

    @JsonProperty("player_name")
    private String playerName;

    @JsonProperty("PTS")
    private int points;

    @JsonProperty("TRB")
    private int rebounds;

    @JsonProperty("AST")
    private int assists;

    // Add other necessary fields and map them with @JsonProperty
    // For example:
    @JsonProperty("age")
    private int age;

    @JsonProperty("team")
    private String team;

    @JsonProperty("season")
    private int season;

    @JsonProperty("games")
    private int games;

    @JsonProperty("games_started")
    private int gamesStarted;

    @JsonProperty("minutes_played")
    private int minutesPlayed;

    @JsonProperty("field_goals")
    private int fieldGoals;

    @JsonProperty("field_attempts")
    private int fieldAttempts;

    @JsonProperty("field_percent")
    private String fieldPercent;

    @JsonProperty("three_fg")
    private int threeFg;

    @JsonProperty("three_attempts")
    private int threeAttempts;

    @JsonProperty("three_percent")
    private String threePercent;

    @JsonProperty("two_fg")
    private int twoFg;

    @JsonProperty("two_attempts")
    private int twoAttempts;

    @JsonProperty("two_percent")
    private String twoPercent;

    @JsonProperty("effect_fg_percent")
    private String effectFgPercent;

    @JsonProperty("ft")
    private int ft;

    @JsonProperty("fta")
    private int fta;

    @JsonProperty("ft_percent")
    private String ftPercent;

    @JsonProperty("ORB")
    private int orb;

    @JsonProperty("DRB")
    private int drb;

    @JsonProperty("STL")
    private int stl;

    @JsonProperty("BLK")
    private int blk;

    @JsonProperty("TOV")
    private int tov;

    @JsonProperty("PF")
    private int pf;
}