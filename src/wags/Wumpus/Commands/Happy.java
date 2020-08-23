package wags.Wumpus.Commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import wags.Wumpus.WumpyBoi;

public class Happy extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] args = event.getMessage().getContentRaw().split("\\s+");
        if (args[0].equalsIgnoreCase(WumpyBoi.prefix + "happy")) {

            EmbedBuilder happy = new EmbedBuilder();

            happy.setTitle("The greatest smile in the land");
            happy.setColor(0xffffff);
            happy.setImage("https://iili.io/d8flef.jpg");


            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(happy.build()).queue();
            happy.clear();

        }
    }
}
