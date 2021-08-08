package main.com.czc.calc;

import main.com.czc.calc.base.BaseCalc;

/**
 * 次幂计算
 * 可以直接用Math.pow()函数
 */
public class Pow extends BaseCalc {
    /**
     * 次幂计算
     * @param base 底数
     * @param exponential 指数
     * @return 计算值
     */
    public double calc(double base,int exponential){
        if (exponential > 0) {
            return positive(base, exponential);
        }
        else if (exponential ==0) {
            return 1;
        }
        else {
            return negative(base, exponential);
        }

    }

    /**
     * 次幂运算-指数为正数
     * @param base
     * @param exponential
     * @return
     */
    private double positive(double base,int exponential){
        double result = 1;
        for (int i = 0; i < exponential; i++)
            result *= base;
        return result;
    }/**
     * 次幂运算-指数为正数
     * @param base
     * @param exponential
     * @return
     */
    private double negative(double base,int exponential){
        double power = 1;
        for (int i = 0; i < exponential; i++)
            power *= base;
        double result = 1.0/power;
        return result;
    }
}
