function updateBackgroundColor() {
    const totalTestText = document.getElementById("totalTestText");
    const totalStatusCount = totalTestText.getAttribute("data-language");
    const backgroundColor = getBackgroundColor(totalStatusCount);
    totalTestText.style.backgroundColor = backgroundColor;
}

function getBackgroundColor(totalStatusCount) {
    return totalStatusCount > 0 ? 'rgba(255, 0, 0, 0.7)' : 'rgba(46, 139, 87, 0.7)';
}

function toggleTable(element) {
    var language = element.getAttribute("data-language");
    var tableId = "table-" + language;
    var table = document.getElementById(tableId);
    var container = element;

    if (table && container) {
        if (table.style.display === "none" || table.style.display === "") {
            table.style.display = "table";
            container.classList.add("open"); // Add 'open' class when the table is open
        } else {
            table.style.display = "none";
            container.classList.remove("open"); // Remove 'open' class when the table is closed
        }
    } else {
        console.error("Table or container not found:", tableId);
    }
}