package wags.Wumpus.Commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import wags.Wumpus.WumpyBoi;

public class Naked extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        if (args[0].equalsIgnoreCase(WumpyBoi.prefix + "naked")) {

            EmbedBuilder naked = new EmbedBuilder();

            naked.setTitle("Saucy photo with the bois 🍆");
            naked.setColor(0xffffff);
            naked.setImage("https://iili.io/d8fusI.jpg");


            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(naked.build()).queue();
            naked.clear();

        }
    }
}
