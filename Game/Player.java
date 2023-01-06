import java.util.Scanner;

public class Player
{
    public void getInput()
    {
        GamePlay gp = new GamePlay();
        if(GamePlay.ComputerPoints <3 && GamePlay.PlayerPoints<3)
        {
            Computer comp = new Computer();
            System.out.println("\nSelect One\n1.Stone\n2.Paper\n3.Scissors");
            Scanner scan = new Scanner(System.in);
            int turn = scan.nextByte();
            if (turn <= 3) {
                gp.setPlayerTake(turn);
                comp.compinput();
            } else {
                System.out.println("Invalid input");
            }
        }
        else
        {
            if(GamePlay.PlayerPoints>GamePlay.ComputerPoints)
            {
                System.out.println("You win! well done man you got "+ GamePlay.PlayerPoints);
            }
            else
            {
                System.out.println("You loss! try again man you got "+GamePlay.PlayerPoints );
            }
        }


    }
}
