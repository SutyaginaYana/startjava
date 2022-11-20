public class VariablesTheme {	
    public static void main(String[] args) {
        System.out.println("1.Создание переменных и вывод их значений на консоль ");
        byte ram = 6;
        short ssd = 512;
        int  releaseDate = 2021;
        long displayResolution = 1920*1080;
        float clockFrequency = 3.5;
        char cpu=7;
        System.out.println("Данные о копьтере:");
        System.out.println("Память с произвольной выборкой" + ram);
        System.out.println("Твердотельный накопитель"+ssd);
        System.out.println("Дата выпуска"+releaseDate+"г");
        System.out.println("Разрешение экрана"+displayResolution);
        System.out.println("Тактовая частота"+clockFrequency+"ГГц");
        System.out.println("Процессор i"+cpu);

        


    }
}