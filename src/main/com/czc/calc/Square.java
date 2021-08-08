package main.com.czc.calc;

import main.com.czc.calc.base.BaseCalc;

public class Square extends BaseCalc {

    public double calc(double value, int n) throws Exception {
        if (!check(n,"0","")){
            throw new Exception();
        }
        double result = midCalculate(value,0.0,value,n);
        return result;
    }

    private double midCalculate(double value, double low,double high,int n) {
        double mid = 1;
        double difference = 1;
        // 二分法,结束条件：差值小于等于15位小数即可
        while(difference>Math.pow(10,-15)){

            mid = (high+low)/2.0;
            //二分，逐步向中间值收拢
            if(mid*mid < value){
                difference = value - mid*mid;
                low=mid;
            }
            else if (mid*mid > value) {
                difference = mid*mid - value;
                high=mid;
            }
            else {
                difference = 0;
            }
            System.out.println("---high="+high+"----low="+low+"--------mid= "+mid+"  mid*mid= "+mid*mid+"------difference="+difference);

        }

        return mid;
    }
}
