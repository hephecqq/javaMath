package dagong;

import java.math.BigDecimal;

/**
 * String.format()方法
 * <p>
 * Created by DAGONG on 2017/1/24.
 */
public class FormatTest {
    /**
     * String str=null;
     * str=String.format("Hi,%s", "王力");
     * System.out.println(str);
     * str=String.format("Hi,%s:%s.%s", "王南","王力","王张");
     * System.out.println(str);
     * System.out.printf("字母a的大写是：%c %n", 'A');
     * System.out.printf("3>7的结果是：%b %n", 3>7);
     * System.out.printf("100的一半是：%d %n", 100/2);
     * System.out.printf("100的16进制数是：%x %n", 100);
     * System.out.printf("100的8进制数是：%o %n", 100);
     * System.out.printf("50元的书打8.5折扣是：%f 元%n", 50*0.85);
     * System.out.printf("上面价格的16进制数是：%a %n", 50*0.85);
     * System.out.printf("上面价格的指数表示：%e %n", 50*0.85);
     * System.out.printf("上面价格的指数和浮点数结果的长度较短的是：%g %n", 50*0.85);
     * System.out.printf("上面的折扣是%d%% %n", 85);
     * System.out.printf("字母A的散列码是：%h %n", 'A');
     *
     * @param args
     */
    public static void main(String[] args) {
        String str = null;
        str = String.format("Hi,%s", "测试");
        System.out.println(str);
        str = String.format("Hi,%s:%s.%s", "测试1", "测试2", "测试3");
        System.out.println(str);
        System.out.printf("字母a的大写是:%c %n", 'A');
        System.out.printf("3>7的结果时:%b %n", 3 > 7);
        System.out.printf("100的一半是:%d %n", 100 / 2);
        System.out.printf("100的八进制是:%o %n", 100);
        System.out.printf("50元的书打8.5折扣是：%f  元%n", 50 * 0.85);
        System.out.printf("100的十六进制是:%x%n", 100);
        System.out.printf("上面价格的指数是：%e %n", 50 * 0.85);
        System.out.printf("上面价格的指数和浮点数结果的长度较短的是：%g %n", 50 * 0.85);
        System.out.printf("上面的折扣是%d%% %n", 85);
        System.out.printf("字母A的散列码:%h %n", 'A');

    }

    /**
     * @param double1
     * @param double2
     * @param scale
     * @return
     */
    public static Double div(Double double1, Double double2, int scale) {
        try {
            BigDecimal bigDecimal1 = new BigDecimal(double1);//创建BigDeciaml对Double参数进行包装
            BigDecimal bigDecimal2 = new BigDecimal(double2);
            return bigDecimal1.divide(bigDecimal2, BigDecimal.ROUND_HALF_UP).doubleValue();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return 0.0;
        }
    }

}
