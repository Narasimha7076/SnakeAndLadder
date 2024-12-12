import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Snake And Ladder");
        SinglePlayer s1 = new SinglePlayer();
        Scanner sc = new Scanner(System.in);
        int i=1;
        Random r= new Random();
        do {
            System.out.println("play game");
            int input = r.nextInt(3)+1;
            switch (input){
                case 1-> System.out.println("Position: "+s1.getPos());
                case 2-> {
                    int ladder = s1.rollDie();
                    int position = s1.getPos();
                    s1.setPos(position+ladder);
                    System.out.println("Position: "+s1.getPos());
                }
                case 3->{
                    int snake = s1.rollDie();
                    int position = s1.getPos();
                    s1.setPos(position-snake);
                    System.out.println("Position: "+s1.getPos());
                }

            }
            System.out.println("Press 0 to exit");
            i = sc.nextInt();
        }while(i!=0);
    }
}