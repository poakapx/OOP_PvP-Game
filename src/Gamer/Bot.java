package Gamer;
import java.util.Random;

public class Bot extends Playerobject
{
    public Bot(Position pos, String objectname)
    {
        super(pos, objectname);
    }

    public String BotMove()
    {
        int tmp = 1;
        Random myr = new Random();
        tmp = myr.nextInt();
        tmp = Math.abs(tmp%10);
        tmp = tmp%5;
        /*if(tmp == 1)
        {
            MoveRight();
            System.out.print("(бот пошёл направо)");
        }
        else if(tmp == 2)
        {
            MoveUp();
            System.out.print("(бот пошёл вверх)");
        }
        else if(tmp == 3)
        {
            MoveLeft();
            System.out.print("(бот пошёл налево)");
        }
        else if(tmp == 4)
        {
            MoveDown();
            System.out.print("(бот пошёл вниз)");
        }
        else
        {
            System.out.print("(бот пропустил ход)");
        }*/
        switch (tmp)
        {
            case 1:
                MoveRight();
                break;
            case 2:
                MoveUp();
                break;
            case 3:
                MoveLeft();
                break;
            case 4:
                MoveDown();
                break;
            case 5:
                MoveStop();
                break;
        }
        return " ";
    }
}