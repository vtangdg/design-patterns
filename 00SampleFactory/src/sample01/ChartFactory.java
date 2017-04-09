package sample01;

/**
 * 图表工厂类
 * Created by degang on 17/4/9.
 */
public class ChartFactory {
    public static Chart getChart(String type) {
        Chart chart = null;

        if (type.equalsIgnoreCase("histogram")) {
            chart = new HistogramChart();
            System.out.println("初始化设置直方图");
        } else if (type.equalsIgnoreCase("pie")) {
            chart = new PieChart();
            System.out.println("初始化设置饼图");
        }

        return chart;
    }
}
