public class WolfTest {
    public static void main(String[] args) {
        Wolf WolfOne = new Wolf();
        WolfOne.setGender("муж") ;
        WolfOne.setName("Рекс");
        WolfOne.setHeight(20);
        WolfOne.setWeight(2);
        WolfOne.setColor("серый");
        System.out.println(" kг, возраст: "+WolfOne.getWeight());
        System.out.println("пол: "+WolfOne.getGender()+", кличка: "+WolfOne.getName()+ ", вес: "+WolfOne.getHeight()+ " kг, возраст: "+WolfOne.getWeight()+"г, окрас:"+WolfOne.getColor());
        WolfOne.walk();
        WolfOne.sit();
        WolfOne.run();
        WolfOne.howl();
        WolfOne.hunt();


    }
}