package ru.whitebeef.beefnicknamecheck.handlers;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import ru.whitebeef.beeflibrary.chat.MessageFormatter;
import ru.whitebeef.beeflibrary.chat.MessageType;
import ru.whitebeef.beeflibrary.placeholderapi.PAPIUtils;
import ru.whitebeef.beefnicknamecheck.BeefNicknameCheck;

public class ClickEntityHandler implements Listener {

    @EventHandler
    public void onPlayerClickEntity(PlayerInteractAtEntityEvent event) {

        if (!(event.getRightClicked() instanceof Player interactedPlayer)) {
            return;
        }
        event.getPlayer().sendActionBar(MessageFormatter.of(
                        PAPIUtils.replaceBiPlaceholders(
                                MessageType.of(BeefNicknameCheck.getInstance(), "message"), interactedPlayer, event.getPlayer()))
                .toComponent(event.getPlayer()));
    }
}

