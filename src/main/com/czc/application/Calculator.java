package main.com.czc.application;

import main.com.czc.calc.CombinationImpl;
import main.com.czc.calc.PermutationImpl;
import main.com.czc.calc.Pow;
import main.com.czc.calc.Square;

public class Calculator {
    public double combination(int up, int down) throws Exception {
        return new CombinationImpl().calc(up, down);
    }
    public double permutationImpl(int up, int down) throws Exception {
        return new PermutationImpl().calc(up, down);
    }
    public double pow(double base,int exponential) {
        return new Pow().calc(base, exponential);
    }
    public double square(double value, int n) throws Exception {
        return new Square().calc(value, n);
    }
}
