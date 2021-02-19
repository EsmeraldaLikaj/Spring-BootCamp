package com.academy.monika.football.enums;

public enum Position {
    POSITION_STRIKER("POSITION_STRIKER",""),
    POSITION_LEFT_ATTACKING_MIDFIELDER("POSITION_LEFT_ATTACKING_MIDFIELDER",""),
    POSITION_RIGHT_ATTACKING_MIDFIELDER("POSITION_RIGHT_ATTACKING_MIDFIELDER",""),
    POSITION_CENTER_MIDFIELDER("POSITION_CENTER_MIDFIELDER",""),
    POSITION_LEFT_DEFENSIVE_MIDFIELDER("POSITION_LEFT_DEFENSIVE_MIDFIELDER",""),
    POSITION_RIGHT_DEFENSIVE_MIDFIELDER("POSITION_RIGHT_DEFENSIVE_MIDFIELDER",""),
    POSITION_LEFT_WINGER_BACK("POSITION_LEFT_WINGER_BACK",""),
    POSITION_RIGHT_WINGER_BACK("POSITION_RIGHT_WINGER_BACK",""),
    POSITION_LEFT_CENTER_BACK("POSITION_LEFT_CENTER_BACK",""),
    POSITION_RIGHT_CENTER_BACK("POSITION_RIGHT_CENTER_BACK",""),
    POSITION_GOAL_KEEPER("POSITION_GOAL_KEEPER","");
    private String position;
    private String description;
    Position(String position,String description) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public String getDescription() {
        return description;
    }
}
