package Gamer;

public abstract class Playerobject implements Playerable {
    private Position objectposition;
    private String objectname;

    public Playerobject(Position pos, String objectname)
    {
        this.objectposition=pos;
        this.objectname=objectname;
    }
    @Override
    public String GetCors() {
        return objectposition.GeneratePosStr();
    }


    @Override
    public void ChangePos(int newx, int newy) {
        this.objectposition.setPosX(newx);
        this.objectposition.setPosY(newy);
    }

    @Override
    public void MoveDown() {
        if(NotAWall())
        {
            this.objectposition.setPosY(this.objectposition.getPosY() - 1);
        }
    }

    @Override
    public void MoveLeft() {
        if(NotAWall()) {
            this.objectposition.setPosX(this.objectposition.getPosX() - 1);
        }

    }

    @Override
    public void MoveUp() {
        if(NotAWall())
        {
            this.objectposition.setPosY(this.objectposition.getPosY() + 1);
        }
    }

    @Override
    public void MoveRight() {
        if(NotAWall())
        {
            this.objectposition.setPosX(this.objectposition.getPosX() +1);
        }
    }

    public boolean NotAWall()
    {
        return  true;
    }
}
