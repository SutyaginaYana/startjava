import java.util.Random;
import java.util.Scanner;
public class GuessNumber{
    private Player pl1;
    private Player pl2;

    public GuessNumber(Player pl1,Player pl2){
        this.pl1=pl1;
        this.pl2=pl2;
    }
    public void start(){
        Random random= new Random();
        int num=random.nextInt(100+1);
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print(pl1.getName()+" введите число: ");
            int option = scanner.nextInt();
            if(option==num){
                System.out.println("Победил игрок "+pl1.getName());
                break;
            }else if(option<num){
                System.out.println("Введенное число: "+option+" меньше загаданного");
            }else{
                System.out.println("Введенное число: "+option+" больше загаданного");
            }

            System.out.print(pl2.getName()+" введите число: ");
            option = scanner.nextInt();
            if(option==num){
                System.out.println("Победил игрок "+pl1.getName());
                break;
            }else if(option<num){
                System.out.println("Введенное число: "+option+" меньше загаданного");
            }else{
                System.out.println("Введенное число: "+option+" больше загаданного");
            }
        }
    }
}