public abstract class ChartDecorator implements Chart {
    protected Chart decoratedChart;

    public ChartDecorator(Chart decoratedChart){
        this.decoratedChart = decoratedChart;
    }

    public void showData(){
        decoratedChart.showData();
    }
}