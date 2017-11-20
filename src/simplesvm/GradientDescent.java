package simplesvm;

/**
 * Created by luoluyao on 2017/11/20.
 */
// 特别粗糙的gradient descent方法！！！这是个可能无法达到效果的方法
// 如果他是有多个极值点的情况下，他是很差的
public class GradientDescent {
    double x_old = 0;
    static double x_new = 3; // 从 x=6 开始迭代
    double gamma = 0.00001; // 每次迭代的步长
    double precision = 0.00001;//误差
    static int iter = 0;//迭代次数
    //目标函数的导数
    private double  derivative(double x) {
        return 4 * Math.pow(x, 3) - 9 *Math.pow(x, 2);
    }

    private void getmin() {
        while (Math.abs(x_new - x_old) > precision){
            iter++;
            x_old = x_new;
            x_new = x_old - gamma * derivative(x_old);
        }
    }

    private double getMinValue() {
        return Math.pow(x_new, 4) - 3 * Math.pow(x_new, 3) + 2;
    }

    public static void main(String[] args) {
        GradientDescent gd = new GradientDescent();
        gd.getmin();
        System.out.println(iter + " \nx: " + x_new + "    \nvalue:" + gd.getMinValue());
    }
}
