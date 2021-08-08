package main.com.czc.calc.base;

public class BaseCalc implements BaseCalcInterface {
    /**
     * 判断是否在区间内
     * @param num 校验值
     * @param min 最小值，null表示无穷小
     * @param max 最大值，null表示无穷大
     * @return 布尔值
     */
    @Override
    public boolean check(int num, String min, String max) {
        if (max.isEmpty()&&min.isEmpty()){
            return false;
        } else if (min.isEmpty()) {
            if (num < Integer.parseInt(max)){
                return true;
            }
            else {
                return false;
            }
        } else if (max.isEmpty()) {
            if (num>Integer.parseInt(min)){
                return true;
            }
            else {
                return false;
            }
        } else {
            if (num>Integer.parseInt(min)&&num<Integer.parseInt(max)){
                return true;
            }
            else {
                return false;
            }
        }
    }
}
