package dev.chasem.cobblemonextras.init;

import com.cobblemon.mod.common.util.ResourceLocationExtensionsKt;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.chasem.cobblemonextras.CobblemonExtras;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;

import java.util.function.Supplier;

import static dev.chasem.cobblemonextras.CobblemonExtras.MODID;


public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MODID, Registry.ITEM_KEY);

    public static final RegistrySupplier<Item> TRADING_BLOCK;

    static {
        TRADING_BLOCK = ITEMS.register("trade_block", () -> new BlockItem(BlockInit.TRADING_BLOCK.get(), new Item.Settings()));
    }


}
