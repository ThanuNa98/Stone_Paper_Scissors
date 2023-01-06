import java.util.Random;

public class Computer
{
    Random random = new Random();
    Player player =  new Player();
    public void compinput()
    {
        int CompTurn = random.nextInt(1,3);
        GamePlay gp = new GamePlay();
        String turn = null;
        if(CompTurn == 1)
        {
            turn = "stone";
        }
        else if(CompTurn == 2)
        {
            turn = "paper";
        }
        else if(CompTurn ==3)
        {
            turn = "scissors";
        }
        System.out.println("Hey guy I got "+ turn );
        gp.setComputerTake(CompTurn);
        gp.check();
            player.getInput();

    }


}
