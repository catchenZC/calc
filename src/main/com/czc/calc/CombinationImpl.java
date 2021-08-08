package main.com.czc.calc;

import main.com.czc.calc.base.BaseCalc;

public class CombinationImpl extends BaseCalc {
    /**
     * 组合C的计算。
     * @param upInt 上标数字，必须大于0
     * @param downInt 下表数字，必须大于0
     * @return
     */
    public double calc(int upInt,int downInt) throws Exception {
        double result;
        double numerator  = 1;
        double denominator = 1;
        if(!check(upInt,"0","")||!check(downInt,"0","")){
            throw new Exception();
        }
        if (upInt>downInt){
            throw new Exception();
        }
        for (int i=0; i<upInt; i++){
            numerator  = numerator  * (downInt - i);
            denominator = denominator * (upInt - i);
        }
        result = numerator/denominator;
        return result;
    }
}
