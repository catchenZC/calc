package main.com.czc.calc.base;

public interface BaseCalcInterface {
    /**
     * 判断是否在区间内
     * @param num 校验值
     * @param min 最小值，null表示无穷小
     * @param max 最大值，null表示无穷大
     * @return 布尔值
     */
    public boolean check(int num, String min, String max);
}
