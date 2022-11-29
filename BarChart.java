public class BarChart extends ChartDecorator {

    Chart decoratedChart;
    public BarChart(Chart decoratedChart) {
        super(decoratedChart);
    }

    @Override
    public void showData() {
        showDataInBarChart(decoratedChart);
    }

    private void showDataInBarChart(Chart decoratedChart){
        System.out.println("Data is shown in Bar Chart.");
    }
}
