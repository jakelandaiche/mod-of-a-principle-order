package info.ravy.principleorder;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroup.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    // create DeferredRegister object
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PrincipleOrder.MODID);

    public static void init() {
        // attach DeferredRegister to the event bus
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // register item
    public static final RegistryObject<Item> COPPER = ITEMS.register("copper", () ->
            new Item(
                    new Item.Properties().tab(ItemGroup.TAB_MATERIALS)
            )
    );
}