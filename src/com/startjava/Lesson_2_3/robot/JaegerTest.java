public class JaegerTest{
    public static void main (String[] args){
        
        Jaeger valorOmega=new Jaeger("Valor Omega","Mark-6","USA",80.06f,2.04f,8,9);
        Jaeger chernoAlpha=new Jaeger("Cherno Alpha","Mark-1","Russia",280.5f,2.412f,3,10);

        /*Jaeger valorOmega=new Jaeger();
        valorOmega.setModelName("Valor Omega");
        valorOmega.setMsrk("Mark-6");
        valorOmega.setOrigin("USA");
        valorOmega.setHeight(80.06f);
        valorOmega.setWeight(2.04f);
        valorOmega.setStrength(8);
        valorOmega.setArmor(9);

        Jaeger chernoAlpha=new Jaeger();
        chernoAlpha.setModelName("Cherno Alpha");
        chernoAlpha.setMsrk("Mark-1");
        chernoAlpha.setOrigin("Russia");
        chernoAlpha.setHeight(280.5f);
        chernoAlpha.setWeight(2.412f);
        chernoAlpha.setStrength(3);
        chernoAlpha.setArmor(10);*/

        System.out.println("Uнформация по первому робату:");
        valorOmega.information();
        valorOmega.move();
        valorOmega.drift();

        System.out.println("\nИнформация по второму робату:");
        chernoAlpha.information();
        chernoAlpha.move();
        chernoAlpha.drift();

    }
}