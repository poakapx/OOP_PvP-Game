package Gamer;

import java.util.Random;

public class Bot extends Playerobject {

    public Bot(Position pos,String objectnam)
    {
        super(pos,objectnam);
    }

    public void BotMove()
    {
        int tmp=1;
        Random myr=new Random();
        tmp=myr.nextInt();
        tmp= Math.abs(tmp%10);
       tmp=tmp%4;
        switch (tmp)
        {
            case 1:this.MoveRight();
                break;
            case 2:this.MoveUp();
                break;
            case 3:this.MoveLeft();
                break;
            case 4:this.MoveDown();
                break;
        }
    }
}
