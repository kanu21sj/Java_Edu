<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawVisualization);
      function drawVisualization() {
        // Some raw data (not necessarily accurate)
        var data = google.visualization.arrayToDataTable([
          ['연도별', '야구', '축구', '농구', '배구', '골프', '기타'],
          ['2017/18',  8,      8,      2,             2,          6,      1],
          ['2018/19',  9,      5,      3,             3,          7,      2],
          ['2019/20',  10,     4,      2,             3,          8,      1],
          ['2020/21',  11,     6,      1,             2,          9,      1]
        ]);
        var options = {
          title : '연도별 스포츠 각 종목 평균 시청률 ',
          vAxis: {title: '시청률'},
          hAxis: {title: '연도별'},
          seriesType: 'bars',
          series: {5: {type: 'line'}}
        };
        var chart = new google.visualization.ComboChart(document.getElementById('chart_div'));
        chart.draw(data, options);
      }
    </script>
  </head>
  <body>
    <div id="chart_div" style="width: 900px; height: 500px;"></div>
  </body>
</html>