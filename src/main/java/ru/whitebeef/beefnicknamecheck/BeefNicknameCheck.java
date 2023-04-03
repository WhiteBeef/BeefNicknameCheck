package ru.whitebeef.beefnicknamecheck;

import org.bukkit.plugin.java.JavaPlugin;
import ru.whitebeef.beeflibrary.BeefLibrary;
import ru.whitebeef.beeflibrary.chat.MessageType;
import ru.whitebeef.beefnicknamecheck.handlers.ClickEntityHandler;

public final class BeefNicknameCheck extends JavaPlugin {

    private static BeefNicknameCheck instance;

    public static BeefNicknameCheck getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;

        BeefLibrary.loadConfig(this);
        BeefLibrary.registerListeners(this, new ClickEntityHandler());
        MessageType.registerType(this, "message");
    }

    @Override
    public void onDisable() {
    }
}
