package net.minecraft.util;

import net.acomputerdog.BlazeLoader.api.base.ApiBase;
import net.minecraft.client.renderer.culling.ClippingHelperImpl;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;

/**
 * Class that allows access to the various Package Private fields in Minecraft's code.
 */
public class MinecraftPackageAccessor {
    public static void addShapelessRecipe(ItemStack output, Object... args){
        CraftingManager.getInstance().addShapelessRecipe(output, args);
    }

    public static void addShapedRecipe(ItemStack output, Object... args){
        CraftingManager.getInstance().addRecipe(output, args);
    }


    public static void setTPS(float tps){
        ApiBase.theMinecraft.timer.ticksPerSecond = tps;
    }

    public static float getTPS(){
        return ApiBase.theMinecraft.timer.ticksPerSecond;
    }
}