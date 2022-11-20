public class Person{
    String gender = "муж";
    String name = "Александр";
    float height = 1.89f;
    float weight = 90.5f;
    int year = 30;

    void walk(){
        System.out.println("вы прошли 5 шагов");
    }
    boolean sit(){
        System.out.println("вы сели на стул");
        return true;
    }
    void run(){
        System.out.println("вы пробежали 10км");
    }
    String talk(){
        return" Привет ";
    }
    boolean learnJava(){
        System.out.println("вы купили курс Top java");
        return true;
    }
}