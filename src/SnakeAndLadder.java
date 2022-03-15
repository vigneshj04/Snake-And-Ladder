
public class SnakeAndLadder {
    public static void main(String[] args) {
        int Player;
        int Position = 0;
        final int LADDER = 2;
        final int SNAKE = 1;
        int dieRolls = (int) Math.floor((Math.random() * 10) % 3);
        switch (dieRolls) {
            case SNAKE:
                System.out.println("Die Rolls ...... " + dieRolls);
                System.out.println("You got bite by a Snake & Your Position Goes to "+ (int) Math.floor(Math.random() * 10) % 16 +1);
                break;
            case LADDER:
                System.out.println("Die Rolls ...... " + dieRolls);
                System.out.println("Got a Ladder & Your Position Goes to " + Position + (int) Math.floor(Math.random() * 10) % 24+ 1);
                break;
            default:
                System.out.println("Die Rolls ......" + Position);
                System.out.println("Player position is Same");
        }
    }
}