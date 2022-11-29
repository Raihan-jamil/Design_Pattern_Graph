public class Main {

    public  static  void main(String[] args) {

        Chart data = new Data();
        Chart barChart = new BarChart(new Data());
        Chart lineChart = new LineChart(new Data());

        data.showData();
        barChart.showData();
        lineChart.showData();

    }
}
