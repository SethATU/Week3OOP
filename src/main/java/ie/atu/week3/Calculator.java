package ie.atu.week3;

import static java.lang.Math.*;

public class Calculator {
    public int add(int a, int b) { return a + b; }
    public int sub(int a, int b) { return a - b; }
    public int mul(int a, int b) { return a * b; }
    public int div(int a, int b) { return a / b; }

    public int power(int base, int exponent) { return (int) pow(base, exponent);}
    public int modulo(int a, int b) { return a % b; }

}

