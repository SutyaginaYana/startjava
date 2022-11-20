public class Jaeger{

        private String modelName;
        private String msrk;
        private String origin;
        private float height;
        private float weight;
        private int strength;
        private int armor;

    public Jaeger(String modelName,String msrk,String origin,float height,float weight ,int strength,int armor){
        this.modelName=modelName;
        this.msrk=msrk;
        this.origin=origin;
        this.height=height;
        this.weight=weight;
        this.strength=strength;
        this.armor=armor;

    }

    public String getModelName(){
        return modelName;
    }
    public void setModelName(String modelName){
        this.modelName=modelName;}

    public String getMsrk(){
        return msrk;
    }
    public void setMsrk(String msrk){
        this.msrk=msrk;
    }

    public String getOrigin(){
        return origin;
    }
    public void setOrigin(String origin){
        this.origin=origin;
    }

    public float getHeight(){
        return height;
    }
    public void setHeight(float heigh){
        this.height=height;}

    public float getWeight(){
        return weight;
    }
    public void setWeight(float weight){
        this.weight=weight;}

    public int getStrength(){
        return strength;
    }
    public void setStrength( int strength){
        this.strength=strength;}

    public int getArmor(){
        return armor;
    }
    public void setArmor(int armor){
        this.armor=armor;
    }

    public void information (){
        System.out.println("modelName: "+modelName+
            ";\nmsrk: "+msrk+
            ";\norigin:"+origin+
            ";\nheight: "+height+
            "\nweight: "+weight+
            "\nstrength: "+strength+
            "\narmor: "+armor);
    }

    public void move(){
        System.out.println("вы прошли 14м");
    }

    public boolean drift(){
        System.out.println("вы вошли в дрифт");
        return true;
    }



}