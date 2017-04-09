package sample01;

/**
 * 测试类
 * Created by degang on 17/4/9.
 */
public class Test {
    public static void main(String[] args) {
        String type = XMLUtil.getChartType();
        Chart chart = ChartFactory.getChart(type);
        chart.display();


        chart = ChartFactory.getChart("pie");
        chart.display();
    }
}
