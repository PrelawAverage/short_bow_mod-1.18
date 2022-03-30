package net.prelaw.mc.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.prelaw.mc.ShortBowMod;
import net.prelaw.mc.item.custom.weapons.ShortBowItem;

public class ModItems {

    public static final Item SHORT_BOW = registerItem("short_bow",
            new ShortBowItem(new FabricItemSettings().group(ItemGroup.COMBAT)));

    // Helper Method to help register the items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ShortBowMod.MOD_ID, name), item);
    }

    // Method that is used to register the items
    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + ShortBowMod.MOD_ID);
    }
}

