public class CyclesTheme {
    public static void main (String[] args){
        System.out.println("1.Подсчет суммы четных и нечетных чисел");
        int odd = 0;
        int even = 0;
        int i=-10;
        do{
            if (i % 2 == 0) {
                 even += i;
             }else{
                 odd+=i;
             }
             i++;
        }while (i <= 21);
        System.out.println("сумма четных чисел: " + even);
        System.out.println("сумма нечетных чисел: " + odd);
        System.out.println("    ");


        System.out.println("2.Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int sum2 = num1+num2+num3;
        for (int k =-1;k< sum2;k++){
        if (k == num1 || k == num2 || k == num3) {
                System.out.print(k +"  ");}
        }
        System.out.println("\n    ");


        System.out.println("3.Вывод реверсивного числа и суммы его цифр");
        int num4 = 1234;
        int sum3 = 0;
        while (num4 > 0) {
                sum3 += num4 % 10;
                System.out.print(num4 % 10);
                num4 /= 10;
            }
        System.out.println("\nсуммa цифр: "+sum3);
        System.out.println("    ");


        System.out.println("4.Вывод чисел на консоль в несколько строк");
        for (int num5 = 1; num5 < 24;  num5 +=0)
        {
            for ( int num6 = 0; num6 < 5; num6++, num5+=2 )
            {
              
              if (num5>24 ){
                System.out.printf("%2d ",00);
              }
              if(num5<24){
                System.out.printf("%2d ",num5);
            }}
            System.out.println();
        }
        
        
        System.out.println("    ");


        System.out.println("\n5.Проверка количества единиц на четность");
        int d = 3141591;
        System.out.print("число "+d);
        int f=0;
        while (d > 0) {
            if(d % 10==1){f++;}
            d /= 10;
            }
        if(f%2==0){
            System.out.print(" содержит "+f+ " (четное) количество единиц");
        }else{
            System.out.print(" содержит "+f+ " (нечетное) количество единиц");
        }
        System.out.println("    ");


        System.out.println("\n6.Отображение фигур в консоли");
        for(int j1=0;j1<5;j1++)
        {
            for(int j2=0;j2<10;j2++){
                System.out.print("*");
            }
            System.out.println();
        }
       System.out.println();
        int j3=0;
        while(j3<5){
            int j4=5;
            while(j4>j3){
                System.out.print("#");
            j4--;}
            System.out.println();
            j3++;}

        int j5=0;
        do{
            System.out.println();
            int j6=0;
            do{
                System.out.print("$");
                j6++;
            }while(j6<=j5);
            j5++;
        }while(j5<3);
        int j7=0;
        do{
            System.out.println();
            int j8=2;
            do{
                System.out.print("$");
                j8--;
            }while(j8>j7);
            j7++;
        }while(j7<2);
        System.out.println("    ");

        System.out.println("7.Отображение ASCII-символов");
        System.out.printf("%4s %4s","Dec","Char\n");
        for (int dec1  = 1; dec1 <= 48; dec1+=2) {
        System.out.printf("%4d  %c%n" ,dec1 , (char)dec1);
        }
        for (int dec2 = 97; dec2 <= 122; dec2+=2) {
            System.out.printf("%4d  %c%n" ,dec2 , (char)dec2);
        }
        System.out.println("    ");


        System.out.println("8.Проверка, является ли число палиндромом");
       int pal = 1234321;
        int rev=0;
        int q = 0;
        int originalpal = pal;
        while(pal!=0){
            rev = pal % 10;
            q = q*10 + rev;
            pal = pal / 10;
        }
        if(originalpal== q){
            System.out.println("число "+originalpal+" является палиндромом");
        }else{
            System.out.println("число "+originalpal+" неявляется палиндромом");}
        System.out.println("    ");


        System.out.println("9.Определение, является ли число счастливым");
        int num10 = 123456;
        int step = 1;
        int count = 0;
        int sum10 = 0;
        while(num10!=0){
            sum10+= step*(num10%10);
            num10/=10;
            if(++count==3){
                step=-step;
            }
        }
        if (count==6 && sum10==0){
            System.out.println("число является счастливым");
        }else{
            System.out.println("число неявляется счастливым");
        }
System.out.println("    ");

        System.out.println("10Вывод таблицы умножения Пифагора");
         int i11,j11;
        System.out.printf("   |");
    for(i11=2; i11<10; i11++)
        System.out.printf("%2d ", i11);
    System.out.printf("\n---|-------");
    System.out.printf("----------------\n");
    for(i11=2; i11<10; i11++)
    {
        System.out.printf("%2d |", i11);
            for(j11=2; j11<10; j11++)
                System.out.printf("%2d ", i11*j11);
            System.out.printf("\n");
    } 
        
    

    }
}