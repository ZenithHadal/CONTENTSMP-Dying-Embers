package dyingember.modid.item;

import dyingember.modid.CSMPDyingEmber;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
 public static final Item BINDING_CODEX = registerItem("binding_codex", new Item(new FabricItemSettings().maxCount(3).rarity(Rarity.EPIC)));
 public static final Item BINDING_PENDANT = registerItem("binding_pendant", new Item(new FabricItemSettings()));

 private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
     entries.add(BINDING_CODEX);
     entries.add(BINDING_PENDANT);
 }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CSMPDyingEmber.MOD_ID, name), item);
    }


    public static void registerModItems() {

        CSMPDyingEmber.LOGGER.info("Registering Mod Items for " + CSMPDyingEmber.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);

    }

}
