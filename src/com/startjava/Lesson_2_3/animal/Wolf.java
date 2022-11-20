
public class Wolf{
    private String gender ;
    private String name ;
    private int height ;
    private int weight ;
    private String color ;

    public String getGender (){
        return gender;
    }
    public void setGender(String gender){
        this.gender=gender;}
    
    public String getName (){
        return name;
    }
    public void setName(String name){
        this.name=name;}
    
    public int getHeight (){
        return height;
    }
    public void setHeight(int height){
        this.height=height;}

    public int getWeight (){
        return weight;
    }
    public void setWeight(int weight){
        if (weight>8){
            System.out.println("Некорректный возраст");
        }else{
            this.weight=weight;
        }

    }
    public String getColor (){
        return color;
    }
    public void setColor(String color){
        this.color=color;}

    public void walk(){
        System.out.println("идет");
    }
    public boolean sit(){
        System.out.println("сидит");
        return true;
    }
    public void run(){
        System.out.println("бежит");
    }
    public String howl(){
        return"воет ";
    }
    public boolean hunt(){
        System.out.println("охотится");
        return true;
    }
}