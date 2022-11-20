import java.util.Scanner; 

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введите имя первого игрока: ");
        String name1 = scanner.nextLine();
        Player player1= new Player(name1);

        System.out.println("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();
        Player player2= new Player(name2);

        GuessNumber act =new GuessNumber(player1,player2);
        String reply="yes";
        do{
            if("yes".equals(reply)){
                act.start();
            }
            System.out.print("вы хотите продолжить игру ? [yes/no] ");
            reply=scanner.nextLine();
        }while (!"no".equals(reply));
    }
}