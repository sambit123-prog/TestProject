package com.epam;

import java.io.DataInputStream;
import java.io.IOException;

interface App<E> {
    abstract E add(E operand1, E operand2);
    abstract E subtract(E operand1, E operand2);
    abstract E multiply(E operand1, E operand2);
    abstract E divide(E operand1, E operand2);
}
class Calculator1 implements Calculator12<Integer>{
 
    @Override
    public Integer add(Integer operand1, Integer operand2) {
        return operand1 + operand2;
    } 
    @Override
    public Integer subtract(Integer operand1, Integer operand2) {
        return operand1 - operand2;
    }
    @Override
    public Integer multiply(Integer operand1, Integer operand2) {
        return operand1 * operand2;
    }
    @Override
    public Integer divide(Integer operand1, Integer operand2) {
        return operand1 / operand2;
    }
}   
public class App {
    public static void main(String[] args) throws IOException {
        Integer choice,num1,num2;
        DataInputStream input = new DataInputStream(System.in);
        System.out.println("Enter Your Choice:-\n1.Add\n2.Subtract\n3.Divide\n4.Multiply.\n5.Exit");
        choice = Integer.parseInt(input.readLine());
        System.out.println("Enter first number:-");
        num1 = Integer.parseInt(input.readLine());
        System.out.println("Enter second number:-");
        num2 = Integer.parseInt(input.readLine());
        Calculator12<Integer> calculate = new Calculator1();
        Integer result;
        switch(choice)
        {
            case 1:result = calculate.add(num1, num2);
                   System.out.println("Sum= "+result);
                   break;
            case 2:result = calculate.subtract(num1, num2);
                   System.out.println("Difference= "+result);
                   break;
            case 3:result = calculate.divide(num1, num2);
                   System.out.println("Division= "+result);
                   break;
            case 4:result = calculate.multiply(num1, num2);
                   System.out.println("Product= "+result);
                   break;
            case 5:System.exit(0);
        }
    }
}
