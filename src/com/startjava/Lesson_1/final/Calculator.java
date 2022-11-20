public class Calculator {
public static void main(String[] args) {
    int num1 = 6;
    int num2 = 2;
    char mark = '-';
    if (mark == '+') {
        System.out.println(num1 + num2);
    } else if (mark == '-') {
        System.out.println(num1 - num2);
    } else if(mark == '*') {
        System.out.println(num1 * num2);
    } else if (mark == '/') {
        System.out.println(num1 / num2);
    } else if (mark== '^') {
        int resultDegree = 1;
        for(int i = 0; i < num2; i++) {
            resultDegree = resultDegree * num1;}
            System.out.println(resultDegree);
        } else if (mark == '%') {
            System.out.println(num1 % num2);
        }
    }
}