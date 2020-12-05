package Gamer;

import com.company.Deposit;
import com.company.Transactione;
import com.company.UniversalAccount;

public class Main1 {

    public static void main(String[] args) {

      Player me=new Player(new Position(0,0),"Player11");
System.out.println("My cors: "+me.GetCors());

      Bot bot=new Bot(new Position(0,0),"Player11");
        System.out.println("Bot cors: "+bot.GetCors());


        me.MoveLeft();
        System.out.println("Me moving Left!");
        System.out.println("My cors now: "+me.GetCors());


        bot.BotMove();
        System.out.println("Bot moving!");
        System.out.println("Bot cors now: "+bot.GetCors());
    }
}
