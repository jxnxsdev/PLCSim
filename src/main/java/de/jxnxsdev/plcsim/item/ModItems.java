package de.jxnxsdev.plcsim.item;

import de.jxnxsdev.plcsim.PLCSim;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PLCSim.MODID);

    public static final DeferredItem<Item> SPEZI = ITEMS.register("spezi",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
