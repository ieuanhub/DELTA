package com.delta.simulation;

public class RaceSimulator {

    int currentLap = 1;
    int completedLaps = 0;
    String raceStatus = "Not Started";

    public void completeLap() {
        if (completedLaps < 78 && raceStatus.equals("Running")) {
            completedLaps++;
            if (completedLaps == 78) {
                raceStatus = "Finished";
            } else {
                currentLap++;
            }
        }
    }

    public void startRace() {
        if (raceStatus.equals("Not Started")) {
            raceStatus = "Running";
        }
    }
}