import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;
public class MyFirstGame {   
    public static void main(String[] args) {
    System.out.println("компьютер загадал число от 1 до 10 ");
    int number =(int)Math.floor(Math.random() * 10);
    Scanner console =new Scanner(System.in);
    System.out.print("Введите число :");
    String num1  = console.nextLine();
    int num = Integer.valueOf(num1);
    while(num!=number){
        if (num >number){
            System.out.println("число "+ num+" больше того, что загадал компьютер");
            num--;
        }
        if (num < number){
            System.out.println("число "+ num+" меньше того, что загадал компьютер");
            num++;
        }
    }
    System.out.println("компьютер загадал число: "+num);
    System.out.println("вы угадали");
}
}

