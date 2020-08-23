package wags.Wumpus.Commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import wags.Wumpus.WumpyBoi;

public class Sexy extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        if (args[0].equalsIgnoreCase(WumpyBoi.prefix + "sexy")) {
            EmbedBuilder sexy = new EmbedBuilder();

            sexy.addField("You can't stay mad at this face. Soon it will be mine", "" , false);
            sexy.setImage("https://iili.io/d8350u.jpg");

            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(sexy.build()).queue();

        }
    }
}
