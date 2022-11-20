public class IfElseStatementTheme{
    public static void main ( String [] args){
        System.out.println ("1.Перевод псевдокода на язык Java");
        int age = 35;
        if (age > 21){
            System.out.println ("совершеннолетний");
        }else{
            System.out.println ("несовершеннолетний");
        }

        String gender = "мужскойПол";
        if (gender != "мужскойПол"){
            System.out.println ("мать");
        }else{
            System.out.println ("отец");
        }

        double growth = 1.90;
        if (growth < 1.80){
            System.out.println ("низкий");
        }else{
            System.out.println ("высокий");
        }

        char firstLetterName= "Thomas".charAt(0);
        if (firstLetterName == 'M'){
            System.out.println ("Marcus");
        }else if (firstLetterName == 'I'){
            System.out.println ("Ian");
        }else{
            System.out.println ("Thomas");
        }
        System.out.println ("    ");


        System.out.println ("2.Поиск max и min числа");
        int num1 = 10;
        int num2 = 20;
        if (num1 > num2){
            System.out.println ("Max = "+num1+"; Min ="+num2);
        }else if (num2>num1){
            System.out.println ("Max = "+num2+"; Min ="+num1);
        }else{
            System.out.println(num1+" = "+num2);
        }
        System.out.println ("    ");

        System.out.println ("3.Работа с числом");
        int num3 = 20;
        if (num3 == 0){
            System.out.println (num3+"=0");
        }else if (num3<0){
            System.out.println (num3+" отрицательное число");
        }else {
            System.out.println (num3+" положительное число");
        }
        if(num3 % 2 == 0){
            System.out.println(num3+" четное число");
        }else{
            System.out.println(num3+" нечетное число");
        }
        System.out.println ("    ");


        System.out.println ("4.Поиск одинаковых цифр в числах");
        int num4 = 127;
        int num5 = 153;
        System.out.println ("Исходные числа: "+num4 +"; "+num5);
        if ((num4 / 100)== (num5/ 100)){
            System.out.println ("одинаковые в них цифры:" + (num5/ 100) +"; 2 разряд чисел");
        } if((num4/ 10 % 10)== (num5/ 10 % 10)){
            System.out.println ("одинаковые в них цифры:" + (num5/ 10 % 10) +"; 1 разряд чисел");
        }if((num4 % 10)== (num5 % 10)){
            System.out.println ("одинаковые в них цифры:" + (num5% 10) +"; 0 разряд чисел");
        }
        if ((num4 / 100) != (num5/ 100) & (num4 / 100) != (num5/ 100) & (num4 / 100) != (num5/ 100)){
            System.out.println ("одинаковых чисел нет");
        }
        System.out.println ("    ");


        System.out.println ("5.Определение буквы, числа или символа по их коду");
        char a='\u0057';
         if(a >='A'&&a <='Z') {
            System.out.println (a +" -большая буква");
        } if(a >='a'&&a <='z') {
            System.out.println (a +" -строчная буква");
        } if(a >='0'&&a <='9') {
            System.out.println (a +" -число");}
        if ((!(a >='A'&&a <='Z'))& (!(a >='a'&&a <='z'))& (! (a >='0'&& a <='9'))){
        System.out.println (a +" -не буква и не число");}
        System.out.println ("    ");


        System.out.println ("6.Определение суммы вклада и начисленных банком %");
        int contribution = 300000;
        System.out.println (" сумма вклада:"+ contribution);
        if (contribution < 100000){
            System.out.println (" начисленный %: " + ((contribution * 5) / 100)  +
            "\n итоговая сумма с %: " + (contribution + ((contribution * 5) / 100)));
        }if (contribution >= 100000 & contribution < 300000){
            System.out.println (" начисленный %: " + ((contribution * 7) / 100) +
            "\n итоговая сумма с %: " + (contribution+((contribution * 7) / 100)));
        }if (contribution >= 300000){
            System.out.println (" начисленный %: " + ((contribution * 10) / 100) + 
            "\n итоговая сумма с %: " + (contribution + ((contribution * 10) / 100)));
        }
        System.out.println ("    ");


        System.out.println ("7.Определение оценки по предметам");
        int history = 59;
        int programming = 91;
        int ratingHistr = 0;
        int ratingProgr = 0;
        if (history <= 60){
            ratingHistr=2;
            System.out.println(ratingHistr+" - история ");
        }else if (history >60 && history <= 73){
            ratingHistr =3;
            System.out.println(ratingHistr+" - история");
        }else if (history >73 && history <= 91){
            ratingHistr=4;
            System.out.println( ratingHistr+" - история");
        }else if (history >91 ){
            ratingHistr =5;
            System.out.println(ratingHistr+" - история");}
          if (programming <= 60){
            ratingProgr=2;
            System.out.println(ratingProgr+" - программирование ");
          }else if (programming >60 && programming <= 73){
            ratingProgr=3;
            System.out.println(ratingProgr+" - программирование");
          }else if (programming >73 && programming <= 91){
            ratingProgr=4;
            System.out.println(ratingProgr+" - программирование");
          }else if (programming >91 ){
            ratingProgr=5;
            System.out.println(ratingProgr+" - программирование");}
        System.out.println("Cредний % по предметам:"+((history+programming)/2)+ " %");
        System.out.println ("Cредний балл оценок по предметам: "+((ratingHistr+ratingProgr)/2));
        System.out.println ("    ");


        System.out.println ("8.Расчет прибыли");
        int rent = 5000;
        int averageCheckMonth = 13000;
        int costPrice = 9000;
        int month = 12;
        int profit= (averageCheckMonth -(rent+costPrice))* month ;
        if (profit >0){
        System.out.println ("+"+profit);
        }else {
            System.out.println (profit);
        }
        System.out.println ("    ");


        System.out.println ("9.Подсчет количества банкнот");
        int sum = 567;
        int hundred = sum / 100;
        int dozen = sum / 10 % 10;
        int unit = sum % 10;
        System.out.println(hundred+" сотен ");
        if( dozen>=5){
            unit= unit+ ((dozen-5)*10);
            dozen=5;
        }
        System.out.println(dozen+" десяток ");
        System.out.println(unit+" единиц");
        System.out.println("исходная сумма: "+(hundred*100+ dozen*10+unit));



        
        }
    }
