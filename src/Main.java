import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Snake And Ladder");
        Player s1 = new Player();
        Player s2 = new Player();
        Player currentPlayer;

        int chance = 0; // To toggle between player 1 and 2
        Random random = new Random();
        System.out.println("Game begins!");

        while (true) {
            currentPlayer = (chance == 0) ? s1 : s2;

            // Roll the die
            int roll = currentPlayer.rollDie();
            System.out.println("Player-" + (chance + 1) + " rolls: " + roll);

            // Update position
            int newPosition = currentPlayer.getPos() + roll;
            if (newPosition > 100) {
                System.out.println("Player-" + (chance + 1) + " stays at position " + currentPlayer.getPos());
            } else {
                currentPlayer.setPos(newPosition);
                System.out.println("Player-" + (chance + 1) + " moves to position " + currentPlayer.getPos());
            }

            // Check for win condition
            if (currentPlayer.getPos() == 100) {
                System.out.println("Player-" + (chance + 1) + " wins!");
                break;
            }

            // Toggle turn
            chance = 1 - chance;
        }

        System.out.println("Player-1 dice rolls: " + s1.dice);
        System.out.println("Player-2 dice rolls: " + s2.dice);
    }
}
