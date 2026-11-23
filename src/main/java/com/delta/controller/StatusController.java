package com.delta.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Map;
import java.util.HashMap;

@RestController
public class StatusController {

    @GetMapping("/api/status")
    public String getStatus() {
        return "DELTA backend is running!";
    }

    @GetMapping("/api/hello")
    public String getHello() {
        return "Hello from DELTA!";
    }

    @GetMapping("/api/delta")
    public Map<String, String> getDeltaInfo() {
        Map<String, String> delta = new HashMap<>();
        delta.put("name", "DELTA");
        delta.put("type", "Race Strategy & Simulation");
        delta.put("status", "Online");
        return delta;
    }

    @GetMapping("/api/race")
    public Map<String, Object> getRaceInfo() {
        Map<String, Object> race = new HashMap<>();
        race.put("track", "Monaco");
        race.put("raceStatus", "Not Started");
        race.put("currentLap", 1);
        race.put("totalLaps", 78);
        return race;
    }
}