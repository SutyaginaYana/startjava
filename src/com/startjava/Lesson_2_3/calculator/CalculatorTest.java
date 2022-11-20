package com.startjava.lesson_2_3.calculator;
import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    Calculator calc =new Calculator();


    String choice= "yes";
    while(choice.equals("yes")){

    System.out.print("Введите первое число :");
    int num1  = scanner.nextInt();
    calc.setNum1(num1);

    System.out.print("Введите знак математической операции: ");
    char sign  = scanner.next().charAt(0);
    calc.setSign(sign);

    System.out.print("Введите второе число: ");
    int num2  = scanner.nextInt();
    calc.setNum2(num2);
    
    calc.calculation();
    do {
        System.out.print("хотите продолжить ?[yes/no]");
        choice= scanner.next();
    }while(!choice.equals("yes") && !choice.equals("no"));
}

System.out.print("Kалькулятор закрылся");
    }
}