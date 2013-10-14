package net.acomputerdog.BlazeLoader.main.commands.bl.module;

import net.acomputerdog.BlazeLoader.api.chat.EChatColor;
import net.acomputerdog.BlazeLoader.mod.Mod;
import net.acomputerdog.BlazeLoader.mod.ModList;
import net.minecraft.src.ICommandSender;

import java.util.List;

/**
 * Gets the list of installed mods.
 */
public class ModuleMods extends CommandBLModule {

    @Override
    public int getNumRequiredArgs() {
        return 0;
    }

    @Override
    public String getModuleName() {
        return "mods";
    }

    @Override
    public String getUsage() {
        return "mods";
    }

    @Override
    public boolean canUserUseCommand(ICommandSender user) {
        return true;
    }

    @Override
    public void execute(ICommandSender user, String[] args) {
        List<Mod> mods = ModList.getLoadedMods();
        if(mods.size() > 0){
            sendChatLine(user, EChatColor.COLOR_AQUA + "" + EChatColor.FORMAT_UNDERLINE + mods.size() + " loaded mod(s):");
            for(Mod mod : mods){
                sendChat(user, "");
                sendChatLine(user, EChatColor.COLOR_YELLOW + mod.getModName() + EChatColor.COLOR_WHITE + " version " + EChatColor.COLOR_ORANGE + mod.getStringModVersion());
            }
        }else{
            sendChatLine(user, EChatColor.COLOR_RED + "No mods are loaded!");
        }
    }

    @Override
    public String getModuleDescription() {
        return "Displays the list of loaded mods.";
    }
}