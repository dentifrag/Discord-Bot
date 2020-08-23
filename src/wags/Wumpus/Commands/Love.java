package wags.Wumpus.Commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import wags.Wumpus.WumpyBoi;

public class Love extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");

        if (args[0].equalsIgnoreCase(WumpyBoi.prefix + "love")) {
            EmbedBuilder love = new EmbedBuilder();

            love.setTitle("My love, Lenahan ❤");
            love.addField("The Man Himself", "", false);
            love.setDescription("He's the kindest bro you will meet, and you should be grateful you met him");
            love.setColor(0xffffff);
            love.setImage("https://iili.io/d82ucJ.jpg");


            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(love.build()).queue();
            love.clear();
        }
    }
}
