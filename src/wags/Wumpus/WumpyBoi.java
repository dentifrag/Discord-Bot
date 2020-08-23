package wags.Wumpus;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import wags.Wumpus.Commands.*;
import wags.Wumpus.Events.MemberJoin;
import wags.Wumpus.Events.Swearing;

import javax.security.auth.login.LoginException;
import java.util.Timer;
import java.util.TimerTask;


public class WumpyBoi extends ListenerAdapter {
    public static JDA jda;
    public static String prefix = "~";

    public static void main(String[] args) throws LoginException {
        jda = new JDABuilder(AccountType.BOT).setToken("Bot token here").build();

        jda.addEventListener(new Love());
        jda.addEventListener(new Clear());
        jda.addEventListener(new Sexy());
        jda.addEventListener(new Help());
        jda.addEventListener(new Forget());
        jda.addEventListener(new Swearing());
        jda.addEventListener(new Happy());
        jda.addEventListener(new Naked());
        jda.addEventListener(new Spooky());

        jda.addEventListener(new MemberJoin());

    }
}
