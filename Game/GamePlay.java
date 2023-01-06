public class GamePlay
{
    //stone 1
    //paper 2
    //scissors 3

    //paper paper = row
    //scissors scissors = row
    //stone stone = row

    //paper scissors = scissors win
    //paper stone = paper win
    //scissors stone = stone win

    static int computerTake;
    static int playerTake;

    static int ComputerPoints;
    static int PlayerPoints;

    public int getComputerTake() {
        return computerTake;
    }

    public int getPlayerTake() {
        return playerTake;
    }

    public void setComputerTake(int computerTake) {
        this.computerTake = computerTake;
    }

    public void setPlayerTake(int playerTake) {
        this.playerTake = playerTake;
    }
    void check()
    {
        if(getComputerTake() == getPlayerTake())
        {
            System.out.println("Row try again");
        }
        else
        {
            if(getComputerTake() == 1)
            {
                if(getPlayerTake() == 2)
                {
                    System.out.println("Player win");
                    win(1);
                }
                else if(getPlayerTake() == 3)
                {
                    System.out.println("Computer  win");
                    win(2);
                }
            }

            if(getComputerTake() == 2)
            {
                if(getPlayerTake() == 3)
                {
                    System.out.println("Player win");
                    win(1);
                }
                else if(getPlayerTake() == 1)
                {
                    System.out.println("Computer  win");
                    win(2);
                }
            }

            if(getComputerTake() == 3)
            {
                if(getPlayerTake() == 1)
                {
                    System.out.println("Player win");
                    win(1);
                }
                else if(getPlayerTake() == 2)
                {
                    System.out.println("Computer  win");
                    win(2);
                }
            }
        }
    }

    private void win(int i)
    {
        if(i==1)
        {
            PlayerPoints++;
        }
        else if(i==2)
        {
            ComputerPoints++;
        }
        System.out.println();
        System.out.println("Computer got : "+ComputerPoints);
        System.out.println("Player got : "+PlayerPoints);
        System.out.println();
    }

}
