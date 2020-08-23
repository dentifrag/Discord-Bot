package wags.Wumpus.Commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import wags.Wumpus.WumpyBoi;

public class Spooky extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        if (args[0].equalsIgnoreCase(WumpyBoi.prefix + "spooky")) {

            EmbedBuilder spooky = new EmbedBuilder();

            spooky.setTitle("BOO👻");
            spooky.setColor(0xffffff);
            spooky.setImage("https://iili.io/d8fIxp.jpg");


            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(spooky.build()).queue();
            spooky.clear();

        }
    }
}
