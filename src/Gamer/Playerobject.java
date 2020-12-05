package Gamer;

public abstract class Playerobject implements Playerable
{
    private Position objectposition;
    private String objectname;

    public Playerobject(Position pos, String objectname)
    {
        this.objectposition=pos;
        this.objectname=objectname;
    }
    @Override
    public String GetCors()
    {
        return objectposition.GeneratePosStr();
    }

    @Override
    public void ChangePos(int newx, int newy)
    {
        this.objectposition.setPosX(newx);
        this.objectposition.setPosY(newy);
    }

    @Override
    public void MoveDown()
    {
        if(NotAWall())
        {
            this.objectposition.setPosY(this.objectposition.getPosY() - 1);
            System.out.print("пошёл вниз");
        }
    }

    @Override
    public void MoveLeft()
    {
        if(NotAWall())
        {
            this.objectposition.setPosX(this.objectposition.getPosX() - 1);
            System.out.print("пошёл налево");
        }
    }

    @Override
    public void MoveUp()
    {
        if(NotAWall())
        {
            this.objectposition.setPosY(this.objectposition.getPosY() + 1);
            System.out.print("пошёл вниз");
        }
    }

    @Override
    public void MoveRight()
    {
        if(NotAWall())
        {
            this.objectposition.setPosX(this.objectposition.getPosX() + 1);
            System.out.print("пошёл направо");
        }
    }

    @Override
    public void MoveStop()
    {
        if(NotAWall())
        {
            System.out.print("пропустил ход");
        }
    }

    @Override
    public String BotMove()
    {
        return objectposition.toString();
    }

    public boolean NotAWall()
    {
        return true;
    }
}