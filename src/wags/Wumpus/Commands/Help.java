package wags.Wumpus.Commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import wags.Wumpus.WumpyBoi;

public class Help extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        if (args[0].equalsIgnoreCase(WumpyBoi.prefix + "help")) {
            EmbedBuilder help = new EmbedBuilder();

            help.setTitle("Command list");
            help.addField("Andy Lenahan Commands", "love\n sexy\n forget\n spooky\n naked \n happy", false);
            help.addField("General Commands", "clear", false);

            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(help.build()).queue();
            help.clear();
        }
    }
}
