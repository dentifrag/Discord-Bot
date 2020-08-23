package wags.Wumpus.Events;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Swearing extends ListenerAdapter {
    public void onGuildMessageReceived(GuildMessageReceivedEvent event) {
        String[] message = event.getMessage().getContentRaw().split("\\s+");
        String[] listOfBadWords = {"Goddamn", "anal", "anus", "arse", "ass", "balls", "bastard", "bitch", "blow job",
                "blowjob", "buttplug", "cock", "coon", "cunt", "damn", "dildo", "dyke", "fag", "fuck", "fucker",
                "fucking", "jizz", "motherfucker", "shit", "shitter","pussy","whore","hoe","cum",
                "bitc","coom","fuc","pusy","loomper"};
        for (int i = 0; i < message.length; i++) {
            for (int j = 0; j < listOfBadWords.length; j++) {
                if (message[i].equalsIgnoreCase(listOfBadWords[j])) {
                    EmbedBuilder swearing = new EmbedBuilder();

                    swearing.setTitle("Swearing is not permitted, shit head");
                    swearing.setColor(0xffffff);
                    swearing.setImage("https://iili.io/d8fGX2.jpg");
                    event.getChannel().sendTyping().queue();
                    event.getChannel().sendMessage(swearing.build()).queue();
                }


            }
        }
    }
}
