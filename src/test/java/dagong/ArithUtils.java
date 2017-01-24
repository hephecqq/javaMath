package dagong;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * Created by DAGONG on 2017/1/24.
 */
public class ArithUtils {
    //默认除法运算精度
    private static final int DEF_DIV_SCALE = 10;

    //这个类不能实例化
    private ArithUtils() {
    }

    /**
     * @param v1
     * @param v2
     * @return
     */
    public static double add(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v1));
        return b1.add(b2, MathContext.DECIMAL128).doubleValue();
    }

    public static void test() {
        BigDecimal bigDec = new BigDecimal("121242.987");
        bigDec.setScale(6, BigDecimal.ROUND_HALF_DOWN);
        //第一个参数是精度,第二个参数是要舍入的模式
    }
}
