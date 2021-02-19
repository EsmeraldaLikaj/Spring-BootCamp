package com.academy.monika.football.entity;

import com.academy.monika.football.enums.Position;

import java.util.List;
import java.util.Map;

public class Team {
    private String id;
    private String name;
    private Map<Participant,List<Position>> players;
    private Participant coach;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Participant, List<Position>> getPlayers() {
        return players;
    }

    public void setPlayers(Map<Participant, List<Position>> players) {
        this.players = players;
    }

    public Participant getCoach() {
        return coach;
    }

    public void setCoach(Participant coach) {
        this.coach = coach;
    }
}
