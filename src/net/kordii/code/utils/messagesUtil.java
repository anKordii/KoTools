package net.kordii.code.utils;

import net.kordii.code.Main;

public class messagesUtil {

    public static String msgJoin = ColorFix.fixColor(Main.getInst().getConfig().getString("msgOnJoin"));
    public static String msgQuit = ColorFix.fixColor(Main.getInst().getConfig().getString("msgOnQuit"));
    public static String msgChatIsOff = ColorFix.fixColor(Main.getInst().getConfig().getString("chatIsOff"));
    public static String msgChatIsOn = ColorFix.fixColor(Main.getInst().getConfig().getString("chatIsOn"));
    public static String msgChatSetOff = ColorFix.fixColor(Main.getInst().getConfig().getString("chatSetOff"));
    public static String msgChatSetOn = ColorFix.fixColor(Main.getInst().getConfig().getString("chatSetOn"));
    public static String msgChatClear = ColorFix.fixColor(Main.getInst().getConfig().getString("chatClear"));
    public static String msgNoPerm = ColorFix.fixColor(Main.getInst().getConfig().getString("chatNoPerm"));
}
