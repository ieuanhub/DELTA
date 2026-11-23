fetch("/api/delta")
    .then(response => {
        return response.json();
    })
    .then(data => {
        document.getElementById("delta-name").textContent = data.name;
        document.getElementById("delta-type").textContent = data.type;
        document.getElementById("delta-status").textContent = data.status;
    });

fetch("/api/race")
    .then(response => {
        return response.json();
    })
    .then(data => {
        document.getElementById("race-track").textContent = data.track;
        document.getElementById("race-status").textContent = data.raceStatus;
        document.getElementById("race-lap").textContent = data.currentLap;
        document.getElementById("race-total-laps").textContent = data.totalLaps;
    })