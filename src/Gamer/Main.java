package Gamer;

public class Main
{
    public static void main(String[] args)
    {
        String Player1 = "Player1";
        String Bot1 = "Bot1";

        Player me = new Player(new Position(10,20),Player1);
        Bot bot = new Bot(new Position(10,20),Bot1);

        System.out.print("My pos.:\t" + me.GetCors() + "\n");
        System.out.print("Bot pos.:\t" + bot.GetCors() + "\n");

        System.out.print("\n" + Player1 + ": ");
        me.MoveDown();
        System.out.print("\n" + me.GetCors() + "\n");

        System.out.print("\n" + Bot1 + ": ");
        bot.BotMove();
        System.out.print("\n" + bot.GetCors() + "\n");

        System.out.print("\n" + Player1 + ": ");
        me.MoveLeft();
        System.out.print("\n" + me.GetCors() + "\n");

        System.out.print("\n" + Bot1 + ": ");
        bot.BotMove();
        System.out.print("\n" + bot.GetCors() + "\n");

        System.out.print("\n" + Player1 + ": ");
        me.MoveLeft();
        System.out.print("\n" + me.GetCors() + "\n");
    }
}