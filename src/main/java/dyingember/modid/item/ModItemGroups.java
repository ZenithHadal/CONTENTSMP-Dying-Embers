package dyingember.modid.item;

import dyingember.modid.CSMPDyingEmber;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup DYINGEMBER = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CSMPDyingEmber.MOD_ID, "binding_codex"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.dyingember"))
                    .icon(() -> new ItemStack(ModItems.BINDING_CODEX)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BINDING_CODEX);
                        entries.add(ModItems.BINDING_PENDANT);


                    }).build());



    public static void registerItemGroups() {
        CSMPDyingEmber.LOGGER.info("Registering Item Groups for" + CSMPDyingEmber.MOD_ID);
    }

}
