package com.startjava.lesson_2_3.calculator;
public class Calculator{
    private int  num1 ;
    private int num2;
    private char sign;

    public void setNum1(int num1){
        this.num1=num1;
    }
    public void setNum2(int num2){
        this.num2=num2;
    }
    public void setSign(char sign){
        this.sign=sign;
    }
        private void pow(){

    int degr = 1;
        for(int i = 0; i < num2; i++) {
            degr = degr * num1;}
    System.out.println(degr);
    }

    public void calculation(){
        switch (sign) {
            case '+' -> System.out.println(num1 + num2);
            case '-' -> System.out.println(num1 - num2);
            case '*' -> System.out.println(num1 * num2);
            case '/' -> System.out.println(num1 / num2);
            case '%' -> System.out.println(num1 % num2);
            case '^' -> pow();
            default -> System.out.println("вы ввели не верное значение математической операции!");
        }
    }

}
