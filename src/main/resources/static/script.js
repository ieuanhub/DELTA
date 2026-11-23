fetch("/api/delta")
    .then(response => {
        return response.json();
    })
    .then(data => {
        document.getElementById("delta-name").textContent = data.name;
        document.getElementById("delta-type").textContent = data.type;
        document.getElementById("delta-status").textContent = data.status;
    });