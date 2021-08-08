package main.test.com.czc;

import main.com.czc.application.Calculator;

public class CalulatorTest {
    public static void main(String[] args) throws Exception {
        System.out.println(Math.pow(10,-100));
    }
    private void test1() throws Exception {
        Calculator calculator = new Calculator();
        System.out.print(calculator.combination(2,5)+"\n");
        System.out.print(calculator.combination(3,5)+"\n");
        System.out.print(calculator.combination(4,5)+"\n");
        System.out.print(calculator.combination(2,6)+"\n");
        System.out.print(calculator.combination(3,6)+"\n");
        System.out.print(calculator.combination(4,6)+"\n");
    }
    private static void test2() throws Exception {
        Calculator calculator = new Calculator();
        double comb1 = 0;
        for (int i=1; i <= 46; i++){
            comb1 = comb1 + calculator.combination(i+4,50);
        }
        double pow = power(0.5,50);
        double result = pow * comb1;
        System.out.print(pow+"\n");
        System.out.print(comb1+"\n");
        System.out.print(result);
    }
    private static void test3() throws Exception {
        Calculator calculator = new Calculator();
        double comb1 = calculator.combination(2,5);
        double comb2 = calculator.combination(2,6);
        double result = comb1 * comb2;
        System.out.print(result);
    }
    public static double power(double a , int b) {
        double power = 1;
        for (int c = 0; c < b; c++)
            power *= a;
        return power;
    }
    public static void test4(){
        double[] result = new double[25];
        for (int i=0; i<25 ;i++){
            result[i] = Math.pow(Math.E,12-i);
            System.out.print(12-i+"---->:"+result[i]);
            System.out.print("\n");
        }
    }
    public static void test5() throws Exception {
        Calculator calculator = new Calculator();
        double result = calculator.square(2, 10);
        System.out.println(result);
    }
}
