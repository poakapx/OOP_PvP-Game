package Gamer;

public interface Playerable
{
    public void MoveLeft();
    public void MoveRight();
    public void MoveUp();
    public void MoveDown();
    public void MoveStop();
    public String BotMove();
    public String GetCors();
    public void ChangePos(int newx, int newy);
}