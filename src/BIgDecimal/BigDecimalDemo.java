package BIgDecimal;/* Created with IntelliJ IDEA Ultimate Edition 2022.1
 * @date： 2022/05/13 12:05
 * @description： 宠辱不惊，去留无意
 * @modifiedBy：运筹帷幄，鞭挞宇内
 */

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * If this comment is removed the program will blow up
 *
 * @author Feyncode
 * @version 1.0 2022-05-13
 */
public class BigDecimalDemo {
    public static void main(String[] args) {
        System.out.println(ArityUtil.add(0.01, 0.05));
    }
}

class ArityUtil {
    private static final int DEF_DIV_SCALE = 10;

    private ArityUtil() {
    }

    //高精度加法算法
    public static double add(double d1, double d2) {
        BigDecimal b1 = new BigDecimal(Double.toString(d1));
        BigDecimal b2 = new BigDecimal(Double.toString(d2));
        return b1.add(b2).doubleValue();
    }

    //高精度减法算法
    public static double sub(double d1, double d2) {
        BigDecimal b1 = new BigDecimal(Double.toString(d1));
        BigDecimal b2 = new BigDecimal(Double.toString(d2));
        return b1.subtract(b2).doubleValue();
    }

    //高精度乘法算法
    public static double mul(double d1, double d2) {
        BigDecimal b1 = new BigDecimal(Double.toString(d1));
        BigDecimal b2 = new BigDecimal(Double.toString(d2));
        return b1.multiply(b2).doubleValue();
    }

    //高精度除法算法,默认精度为10
    public static double div(double d1, double d2) {
        return div(d1, d2, DEF_DIV_SCALE);
    }

    //高精度除法算法,精确到指定进度(scale),再往后的数字四舍五入
    public static double div(double d1, double d2, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        BigDecimal b1 = new BigDecimal(Double.toString(d1));
        BigDecimal b2 = new BigDecimal(Double.toString(d2));
        return b1.divide(b2, scale, RoundingMode.HALF_UP).doubleValue();
    }
}
