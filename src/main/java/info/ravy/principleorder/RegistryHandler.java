package info.ravy.principleorder;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    // create DeferredRegister object
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PrincipleOrder.MODID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PrincipleOrder.MODID);

    public static void init() {
        // attach DeferredRegister to the event bus
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // register copper ore block
    public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore", () ->
        new Block(
                AbstractBlock.Properties
                .of(Material.STONE)
                .strength(5.0f, 6.0f)
                .sound(SoundType.STONE)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
        )
    );
    // register solid copper block
    public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block", () ->
            new Block(
                    AbstractBlock.Properties
                            .of(Material.METAL)
                            .strength(7.0f, 6.0f)
                            .sound(SoundType.METAL)
                            .harvestLevel(1)
                            .harvestTool(ToolType.PICKAXE)
            )
    );
    // register item
    public static final RegistryObject<Item> COPPER = ITEMS.register("copper", () ->
            new Item(
                    new Item.Properties().tab(ItemGroup.TAB_MATERIALS)
            )
    );


    public static final RegistryObject<Item> COPPER_ORE_ITEM = ITEMS.register("copper_ore", () ->
            new BlockItem(
                    COPPER_ORE.get(),
                    new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)
            )
    );

    public static final RegistryObject<Item> COPPER_BLOCK_ITEM = ITEMS.register("copper_block", () ->
            new BlockItem(
                    COPPER_BLOCK.get(),
                    new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)
            )
    );
}