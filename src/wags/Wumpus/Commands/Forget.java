package wags.Wumpus.Commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import wags.Wumpus.WumpyBoi;

public class Forget extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        if (args[0].equalsIgnoreCase(WumpyBoi.prefix + "forget")) {

            EmbedBuilder forget = new EmbedBuilder();

            forget.setTitle("Let's not forget the true king💕");
            forget.setDescription("Everyone take a minute and think about what he has done for you");
            forget.setColor(0xffffff);
            forget.setImage("https://iili.io/d8FFIV.jpg");


            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(forget.build()).queue();
            forget.clear();

        }
    }
}