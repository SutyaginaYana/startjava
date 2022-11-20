public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1.Создание переменных и вывод их значений на консоль ");
        byte ram = 6;
        short ssd = 512;
        int  releaseDate = 2021;
        long displayResolution = 1920*1080;
        double clockFrequency = 3.5;
        char cpu = '7';
        System.out.println("Данные о копьтере:\n" + "Память с произвольной выборкой " + ram + "\n" +
        "Твердотельный накопитель " + ssd + "\n" +
        "Дата выпуска " + releaseDate + "г\n" +
        "Разрешение экрана " + displayResolution + "\n" +
        "Тактовая частота " + clockFrequency + "ГГц\n" +
        "Процессор i"+cpu);
        System.out.println("    ");

        System.out.println("2.Расчет стоимости товара со скидкой");
        int pen = 100;
        int book = 200;
        int totalCost = pen+book;
        int discount = 11;
        int discountAmount = ((totalCost * discount) / 100);
        int result = totalCost - discountAmount;
        System.out.println("Сумма скидки " + discountAmount + "руб");
        System.out.println("Общая стоимость товаров со скидкой " + result + "руб");
        System.out.println("    ");


        System.out.println("3.Вывод на консоль слова JAVA");
        System.out.println("   j   a v     v a");
        System.out.println("   j  a a v   v a a");
        System.out.println("j  j aaaaa v v aaaaa");
        System.out.println(" jj a     a v a     a");
        System.out.println("    ");


        System.out.println("4.Отображение min и max значений числовых типов данных");
        byte x = 127;
        System.out.println("первоначальное значение byte" + x + "; значение после инкремента " + 
        (x + 1) + "; значение после декремента " + (x - 1));
        short x1 = 32767;
        System.out.println("первоначальное значение short" + x1 + "; значение после инкремента " + 
        (x1 + 1) + "; значение после декремента " + (x1 - 1));
        int x2 = 2147483647;
        System.out.println("первоначальное значение int" + x2 +"; значение после инкремента " +
        (x2 + 1) + "; значение после декремента " + (x2 - 1));
        System.out.println("    ");


        System.out.println("5.Перестановка значений переменных");
        int l = 2;
        int m = 5;
        System.out.println("5.1.Перестановка значений переменных с помощью третьей переменной");
        System.out.println("Исходные значения переменных: l=" + l + " m=" + m);
        int k = l;
        l = m;
        m =k ;
        System.out.println("Новые значения переменных: l=" + l +" m=" + m);
        System.out.println("5.2.Перестановка значений переменных с помощью арифметических операций");
        System.out.println("Исходные значения переменных: l=" + l + " m=" + m);
        l = l + m;
        m = l - m;
        l = l - m;
        System.out.println("Новые значения переменных: l=" + l +" m=" + m);
        System.out.println("5.3.Перестановка значений переменных с помощью побитовой операции ^");
        System.out.println("Исходные значения переменных: l=" + l + " m=" + m);
        l = l ^ m;
        m = m ^ l;
        l = l ^ m;
        System.out.println("Новые значения переменных: l=" + l + " m=" + m);
        System.out.println("    ");

        System.out.println("6.Вывод символов и их кодов");
        int a = 35;
        int b = 38;
        int c = 64;
        int d = 94;
        int f = 95;
        System.out.println( a + "  " + (char)a + "\n" +
        b + "  " + (char)b + "\n" +
        c +"  "+ (char)c + "\n" +
        d +"  "+ (char)d + "\n" +
        f + "  " + (char)f);
        System.out.println("    ");


        System.out.println("7.Отображение количества сотен, десятков и единиц числа");
        int number7 = 123;
        int hundred7 = number7 / 100;
        int dozen7 = number7 / 10 % 10;
        int unit7 = number7 % 10;
        System.out.println("Число " + number7 + " содержит: \n" +
        hundred7 + " сотню\n" +
        dozen7 + " десятка\n" +
        unit7 + " единицы");
        System.out.println("    ");

        System.out.println("8.Вывод на консоль ASCII-арт Дюка");
        String symbol1 = "/";
        String symbol2 = "\\";
        String symbol3 = "_" ;
        String symbol4 = "(";
        String symbol5 = ")";
        System.out.println("    " + symbol1 + symbol2);
        System.out.println("   " + symbol1 + "  "+ symbol2);
        System.out.println("  " + symbol1 + symbol3 + symbol4 + " " + symbol5 + symbol2);
        System.out.println(" " + symbol1 + "      " + symbol2);
        System.out.println(symbol1 + symbol3 + symbol3 + symbol3 + symbol3 + symbol1 + symbol2 + 
        symbol3 + symbol3 + symbol2);
        System.out.println("    ");


        System.out.println("9.Произведение и сумма цифр числа");
        int number9 = 345;
        int hundred9 = number9 / 100;
        int dozen9 = number9 / 10 % 10;
        int unit9 = number9 % 10;
        System.out.println("Cумма цифр числа " + number9 + "=" + (hundred9 + dozen9 + unit9) + "\n" +
        "Произведение цифр числа " + number9 + " = " + (hundred9 * dozen9 * unit9));
        System.out.println("    ");

        System.out.println("10.Преобразование секунд");
        int ss = 86399;
        int hh = ss / 3600; 
        int mm = (ss - hh * 3600) / 60; 
        ss = ss - hh * 3600 - mm * 60;
        System.out.println(hh + ":" + mm + ":" + ss);


    }

}