package de.jxnxsdev.plcsim.item;

import de.jxnxsdev.plcsim.PLCSim;
import de.jxnxsdev.plcsim.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PLCSim.MODID);

    public static final Supplier<CreativeModeTab> PLCSIM_ITEMS_TAB = CREATIVE_MODE_TAB.register("plcsim_items_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.SPEZI.get()))
                    .title(Component.translatable("creativetab.plcsim.items"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SPEZI);
                        output.accept(ModBlocks.SPEZI_KASTEN);
                    }))

                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}

