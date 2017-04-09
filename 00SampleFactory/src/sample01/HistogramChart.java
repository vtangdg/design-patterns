package sample01;

/**
 * 具体产品类：直方图
 * Created by degang on 17/4/9.
 */
public class HistogramChart implements Chart {
    public HistogramChart() {
        System.out.println("创建直方图！");
    }

    @Override
    public void display() {
        System.out.println("显示直方图！");
    }
}
