document.addEventListener("DOMContentLoaded", function() {
    updateBackgroundColor();

    google.charts.load("current", { packages: ['corechart', 'line'] });
    google.charts.setOnLoadCallback(drawChart);
    function drawChart() {
        var data = new google.visualization.DataTable();
        data.addColumn('string', 'Language');
        data.addColumn('number', 'Duration');

        var durationConfigurations = durationValue;

        for (var i = 0; i < durationConfigurations.length; i++) {
            data.addRow([durationConfigurations[i].testName, durationConfigurations[i].testDuration]);
        }

        var options = {
            hAxis: {
                  title: 'Language'
                },
            vAxis: {
                  title: 'Duration in ms'
                },
            legend: { position: 'none' },
            backgroundColor: '#E4F1EE',
            series : {
                  0: { color: '#A8D1D1' },
            }
        };

        var chart = new google.visualization.AreaChart(document.getElementById("chart-container"));
        chart.draw(data, options);
    }
});