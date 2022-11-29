public class LineChart extends ChartDecorator {

    Chart decoratedChart;
    public LineChart(Chart decoratedChart) {
        super(decoratedChart);
    }

    @Override
    public void showData() {
        showDataInLineChart(decoratedChart);
    }

    private void showDataInLineChart(Chart decoratedChart){
        System.out.println("Data is shown in Line Chart.");
    }
}
