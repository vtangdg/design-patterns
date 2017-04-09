package sample01;

/**
 * 具体产品类：饼状图
 * Created by degang on 17/4/9.
 */
public class PieChart implements Chart {
    public PieChart() {
        System.out.println("创建饼状图");
    }

    @Override
    public void display() {
        System.out.println("显示饼状图");
    }
}