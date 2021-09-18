/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author HoangTN
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    interface IntegerMath {

        int operation(int a, int b);
    }

    public int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Calculator myApp = new Calculator();
        IntegerMath addition = (a, b) -> a + b;
        IntegerMath subtraction = (a, b) -> a - b;
        System.out.println("40 + 2 = "
                + myApp.operateBinary(40, 2, addition));
        System.out.println("20 - 10 = "
                + myApp.operateBinary(20, 10, subtraction));
    }
}

