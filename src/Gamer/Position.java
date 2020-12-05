package Gamer;

public class Position
{
    private int posX;
    private int posY;
    {
        posX=0;
        posY=0;
    }


    public Position(int x, int y)
    {
        this.posX=x;
        this.posY=y;

    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }


    public String GeneratePosStr()
    {
        return "Position{" +
            "posX=" + posX +
            ", posY=" + posY +
            '}';
    }
}
