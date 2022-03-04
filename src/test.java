import java.text.NumberFormat;

/**
 * @Desc: 理解什么是工厂方法
 * @Author: djology.w
 * @Date: 2022/2/26 下午8:20
 */


public class test {

    public static void main(String[] args) {

        /**
         * static 只是指示从属问题，属于类而不属于类对象
         */

        /**
         * 问题是为什么不使用构造器方法创建NumberFormat的对象
         *      无法命名构造器，
         *      使用构造器，无法改变所构造对象的类型
         *
         * 这是静态工厂的优势，也是构造器构造对象的约束
         */
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        NumberFormat percentFormatter = NumberFormat.getPercentInstance();

        double x = 0.1;

        System.out.println(currencyFormatter.format(x));
        System.out.println(percentFormatter.format(x));
    }

}
